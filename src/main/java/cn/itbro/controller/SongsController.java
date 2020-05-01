package cn.itbro.controller;

import cn.itbro.domain.Songs;
import cn.itbro.service.SongsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
        mv.setViewName("main");
        return mv;
    }

    @RequestMapping("/addSong.do")
    public String addSong(@RequestParam(name = "name",required = true)String name,
                          @RequestParam(name = "title",required = true)String title,
                          @RequestParam(name = "status",required = true)int status){
        Songs song = new Songs();
        song.setName(name);
        song.setTitle(title);
        song.setStatus(status);
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
        mv.setViewName("search-list-show");
        return mv;
    }

}
