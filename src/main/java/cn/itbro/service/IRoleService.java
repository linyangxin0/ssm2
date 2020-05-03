package cn.itbro.service;

import cn.itbro.domain.Permission;
import cn.itbro.domain.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll();

    public Role findById(String id);

    public void deleteRole(String roleId);

    public void save(Role role);

    public List<Permission> findOtherPermissions(String roleId);

    public void addPermissionToRole(String roleId, String[] permissionIds);
}
