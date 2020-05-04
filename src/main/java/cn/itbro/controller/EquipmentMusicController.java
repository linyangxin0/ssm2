package cn.itbro.controller;


import cn.itbro.domain.DeviceDetails;

import cn.itbro.domain.Songs;
import cn.itbro.service.IEquipmentMusicService;
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
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<DeviceDetails> deviceDetails = equipmentMusicService.findAll();
        mv.addObject("deviceDetails",deviceDetails);
        mv.setViewName("equipment-music-list");
        return mv;
    }

    @RequestMapping("/findAllSongs.do")
    public ModelAndView findAllSongs(@RequestParam(name = "id",required = true)String id) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Songs> songs = equipmentMusicService.findAllSongsById(id);
        mv.addObject("songs",songs);
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
