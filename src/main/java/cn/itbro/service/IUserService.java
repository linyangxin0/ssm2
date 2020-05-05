package cn.itbro.service;

import cn.itbro.domain.Role;
import cn.itbro.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {

    void updatePassword(String username, String newPwd);

    public List<UserInfo> findAll(int var1, int var2);

    public UserInfo findById(String id);

    public List<Role> findOtherRole(String userId);

    public void addRoleToUser(String userId, String[] roleIds);

    public void save(UserInfo userInfo) throws Exception;
}
