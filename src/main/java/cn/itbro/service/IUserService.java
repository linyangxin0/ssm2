package cn.itbro.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {

    void updatePassword(String username, String newPwd);
}
