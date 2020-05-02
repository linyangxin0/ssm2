package cn.itbro.dao;

import cn.itbro.domain.UserInfo;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface IUserDao {
    @Select("select * from users where user_name=#{username}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "userName",column = "user_name"),
            @Result(property = "email",column = "email"),
            @Result(property = "password",column = "password"),
            @Result(property = "phoneNum",column = "phone_num"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.itbro.dao.IRoleDao.findRoleByUserId")),
    })
    public UserInfo findByUsername(String username) throws Exception;
}
