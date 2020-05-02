package cn.itbro.dao;

import cn.itbro.domain.Role;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
}
