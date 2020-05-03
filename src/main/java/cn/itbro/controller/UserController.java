package cn.itbro.controller;


import cn.itbro.service.IUserService;
import cn.itbro.utils.BCryptPasswordEncoderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/updatePassword.do")
    public @ResponseBody void updatePassword(String newPassword,String repeatPassword){
//        加密密码
        BCryptPasswordEncoderUtils bCryptPasswordEncoderUtils = new BCryptPasswordEncoderUtils();
        String newPwd  = bCryptPasswordEncoderUtils.encodePassword(newPassword);
        //修改密码
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = userDetails.getUsername();
        userService.updatePassword(username,newPwd);
    }

}
