package cn.itbro.controller;

import cn.itbro.domain.DeviceDetails;
import cn.itbro.domain.DeviceType;
import cn.itbro.service.IDeviceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/deviceDetail")
public class DeviceDetailController {

    @Autowired
    private IDeviceDetailService deviceDetailService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv= new ModelAndView();
        List<DeviceDetails> deviceDetails = deviceDetailService.findAll();

        mv.addObject("deviceDetails",deviceDetails);
        mv.setViewName("device-detail-list");

        return mv;
    }
}
