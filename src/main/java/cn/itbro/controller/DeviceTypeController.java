package cn.itbro.controller;


import cn.itbro.domain.DeviceType;
import cn.itbro.service.IDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/deviceType")
public class DeviceTypeController {


    @Autowired
    private IDeviceTypeService deviceTypeService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv= new ModelAndView();
        List<DeviceType> deviceTypes = deviceTypeService.findAll();

        mv.addObject("deviceTypes",deviceTypes);
        mv.setViewName("device-type-list");

        return mv;
    }

    @RequestMapping("/findDeviceDetailsByDeviceTypeId.do")
    public ModelAndView findDeviceDetailsByDeviceTypeId(@RequestParam(name = "id", required = true) String id){
        ModelAndView mv= new ModelAndView();

        DeviceType deviceTypes = deviceTypeService.findDeviceDetailsByDeviceTypeId(id);

        mv.addObject("deviceTypes",deviceTypes);
        mv.setViewName("device-type-show");
        return mv;

    }

}
