package cn.itbro.dao;

import cn.itbro.domain.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPermissionDao {

    @Select("select * from permission where id in (select permission_id from role_permission where role_id=#{id})")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;

    @Select("select * from permission")
    List<Permission> findAll();

    @Insert("insert into permission(permission_name,url) values (#{permissionName},#{url})")
    void save(Permission permission);

    @Delete("delete from role_permission where permission_id=#{id}")
    void deleteFromRole_Permission(String id) throws Exception;

    @Delete("delete from permission where id=#{id}")
    void deleteById(String id) throws Exception ;

    @Select("select * from permission where id=#{id}")
    Permission findById(String id) throws Exception;
}
