package cn.itbro.controller;


import cn.itbro.domain.DeviceDetails;

import cn.itbro.domain.Songs;
import cn.itbro.service.IEquipmentMusicService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/equipmentMusic")
public class EquipmentMusicController {

    @Autowired
    private IEquipmentMusicService equipmentMusicService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") Integer page,
                                @RequestParam(name = "size",required = true,defaultValue = "4")Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<DeviceDetails> deviceDetails = equipmentMusicService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(deviceDetails);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("equipment-music-list");
        return mv;
    }

    @RequestMapping("/findAllSongs.do")
    public ModelAndView findAllSongs(@RequestParam(name = "id",required = true)String id,
                                     @RequestParam(name = "page",required = true,defaultValue = "1") Integer page,
                                     @RequestParam(name = "size",required = true,defaultValue = "4")Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Songs> songs = equipmentMusicService.findAllSongsById(id,page,size);
        PageInfo pageInfo = new PageInfo(songs);
        mv.addObject("pageInfo",pageInfo);
        mv.addObject("deviceId",id);
        mv.setViewName("one-equipment-music-list");
        return mv;
    }


    @RequestMapping("/deleteSongs.do")
    public String deleteSongs(@RequestParam(name = "songId",required = true)String songId,
                                    @RequestParam(name = "deviceId",required = true)String deviceId) throws Exception {
        equipmentMusicService.deleteSongs(songId,deviceId);
        return "redirect:findAllSongs.do?id="+deviceId;
    }


    @RequestMapping("/addSong.do")
    public ModelAndView addSong(@RequestParam(name = "deviceId",required = true)String deviceId) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Songs> songs = equipmentMusicService.findSongsNotGet(deviceId);
        System.out.println(songs);
        mv.addObject("songs",songs);
        mv.addObject("deviceId",deviceId);
        mv.setViewName("one-equipment-music-add");
        return mv;
    }

    @RequestMapping("/save.do")
    public String saveSongs(@RequestParam(name = "songId",required = true)String songId,
                              @RequestParam(name = "deviceId",required = true)String deviceId) throws Exception {
        equipmentMusicService.saveSongs(songId,deviceId);
        return "redirect:findAllSongs.do?id="+deviceId;
    }



}
