package cn.itbro.service;

import cn.itbro.domain.Permission;

import java.util.List;

public interface IPermissionService {

    public List<Permission> findAll(int var1, int var2);

    void save(Permission permission);

    void deleteById(String id) throws Exception;

    Permission findById(String id) throws Exception;
}
