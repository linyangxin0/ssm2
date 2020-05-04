package cn.itbro.controller;

import cn.itbro.domain.Songs;
import cn.itbro.service.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongsController {

    @Autowired
    private SongsService songsService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Songs> songsList = songsService.findAll();
        mv.addObject("songsList",songsList);
        mv.setViewName("songs-list");
        return mv;
    }

    @RequestMapping("/addSong.do")
    @Secured("ROLE_ADMIN")
    public String addSong(@RequestParam(name = "name",required = true)String name,
                          @RequestParam(name = "title",required = true)String title,
                          @RequestParam(name = "status",required = true)String status){

        int cStatus = Integer.parseInt(status);

        Songs song = new Songs();
        song.setName(name);
        song.setTitle(title);
        song.setStatus(cStatus);
        song.setSort(0);
        song.setUpdateTime(new Date());

        songsService.addSong(song);

        return "redirect:findAll.do";
    }

    @RequestMapping("/search.do")
    public ModelAndView search(@RequestParam(name = "search_text",required = true)String searchText){
        ModelAndView mv=new ModelAndView();
        List<Songs> songsList = songsService.findSongsByName(searchText);
        mv.addObject("songsList",songsList);
        mv.setViewName("songs-list");
        return mv;
    }

    @RequestMapping("/editSong.do")
    @Secured("ROLE_ADMIN")
    public String editSong(@RequestParam(name = "name",required = true)String name,
                           @RequestParam(name = "title",required = true)String title,
                           @RequestParam(name = "status",required = true)String status,
                           @RequestParam(name = "id",required = true)String id){

        int cStatus = Integer.parseInt(status);
        int cId=Integer.parseInt(id);

        Songs song = new Songs();
        song.setName(name);
        song.setTitle(title);
        song.setStatus(cStatus);
        song.setSort(0);
        song.setUpdateTime(new Date());
        song.setId(cId);

        songsService.updateSongById(song);

        return "redirect:findAll.do";
    }

    @RequestMapping("/deleteSong.do")
    @Secured("ROLE_ADMIN")
    public @ResponseBody void deleteSong(String id) throws IOException {
        songsService.deleteSongById(id);
    }

}
