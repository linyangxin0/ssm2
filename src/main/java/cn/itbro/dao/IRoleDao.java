package cn.itbro.dao;

import cn.itbro.domain.Permission;
import cn.itbro.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IRoleDao {

    //根据用户id查询处所有对应的角色
    @Select("select * from role where id in (select role_id from users_role where user_id=#{userId})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roleName",column = "role_name"),
            @Result(property = "roleDesc",column = "role_desc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.itbro.dao.IPermissionDao.findPermissionByRoleId")),
    })
    public List<Role> findRoleByUserId(String userId);

    @Select("select * from role")
    public List<Role> findAll();

    @Select("select * from role where id=#{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roleName",column = "role_name"),
            @Result(property = "roleDesc",column = "role_desc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.itbro.dao.IPermissionDao.findPermissionByRoleId"))
    })
    Role findById(String id);

    @Delete("delete from users_role where role_id=#{roleId}")
    void deleteFromUser_RoleByRoleId(String roleId);

    @Delete("delete from role_permission where role_id=#{roleId}")
    void deleteFromRole_PermissionByRoleId(String roleId);

    @Delete("delete from role where id=#{roleId}")
    void deleteFromRoleByRoleId(String roleId);

    @Insert("insert into role (role_name,role_desc) values (#{roleName},#{roleDesc})")
    void save(Role role);

    @Select("select * from permission where id not in (select permission_id from role_permission where role_id=#{roleId})")
    public List<Permission> findOtherPermissions(String roleId);

    @Insert("insert into role_permission(role_id,permission_id) values(#{roleId},#{permissionId})")
    void addPermissionToRole(@Param("roleId") String roleId, @Param("permissionId") String permissionId);

}
