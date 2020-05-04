package cn.itbro.controller;

import cn.itbro.domain.DeviceDetails;
import cn.itbro.domain.DeviceType;
import cn.itbro.service.IDeviceDetailService;
import cn.itbro.service.IDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/deviceDetail")
public class DeviceDetailController {

    @Autowired
    private IDeviceDetailService deviceDetailService;

    @Autowired
    private IDeviceTypeService deviceTypeService;

    @RequestMapping("/findAllDeviceType.do")
    public ModelAndView findAllDeviceType(){
        ModelAndView mv= new ModelAndView();
        List<DeviceType> deviceTypes = deviceTypeService.findAll();

        mv.addObject("deviceTypes",deviceTypes);
        mv.setViewName("device-detail-add");

        return mv;
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv= new ModelAndView();
        List<DeviceDetails> deviceDetails = deviceDetailService.findAll();
        List<DeviceType> deviceTypes=deviceTypeService.findAll();
        mv.addObject("deviceDetails",deviceDetails);
        mv.addObject("deviceTypes",deviceTypes);
        mv.setViewName("device-detail-list");
        return mv;
    }

    @RequestMapping("/deleteDeviceDetail.do")
    public String deleteDeviceDetail(@RequestParam(name = "id", required = true) String id){
        deviceDetailService.deleteDeviceType(id);
        return "redirect:findAll.do";
    }


    @RequestMapping("/save.do")
    public String save(@RequestParam(name = "name", required = true) String name,
                       @RequestParam(name = "id", required = true) String deviceTypeId,
                       @RequestParam(name = "online", required = true) String online){

        int cOnline = Integer.parseInt(online);
        int cDeviceTypeId = Integer.parseInt(deviceTypeId);

        DeviceDetails deviceDetail = new DeviceDetails();
        deviceDetail.setName(name);
        deviceDetail.setOnline(cOnline);
        deviceDetail.setDeviceTypeId(cDeviceTypeId);

        deviceDetailService.save(deviceDetail);
        return "redirect:findAll.do";
    }

    @RequestMapping("/editDetail.do")
    public String editDetail(@RequestParam(name = "id", required = true) String id,
                         @RequestParam(name = "name", required = true) String name,
                         @RequestParam(name = "typeId", required = true) String typeId,
                         @RequestParam(name = "online", required = true) String edit_online){

        DeviceDetails deviceDetails =new DeviceDetails();

        int cId=Integer.parseInt(id);
        int cTypeId=Integer.parseInt(typeId);
        int cEditOnline=Integer.parseInt(edit_online);

        deviceDetails.setId(cId);
        deviceDetails.setName(name);
        deviceDetails.setDeviceTypeId(cTypeId);
        deviceDetails.setOnline(cEditOnline);

        deviceDetailService.editDetail(deviceDetails);

        return "redirect:findAll.do";
    }

}
