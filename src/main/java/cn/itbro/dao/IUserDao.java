package cn.itbro.dao;

import cn.itbro.domain.Role;
import cn.itbro.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

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

    @Update("update users set password=#{passWord} where user_name=#{userName}")
    void updatePassword(@Param("userName") String username,@Param("passWord")String newPwd);


    @Select("select * from users")
    public List<UserInfo> findAll();

    @Select("select * from users where id=#{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "userName",column = "user_name"),
            @Result(property = "email",column = "email"),
            @Result(property = "password",column = "password"),
            @Result(property = "phoneNum",column = "phone_num"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.itbro.dao.IRoleDao.findRoleByUserId")),
    })
    public UserInfo findById(String id);

    @Select("select * from role where id not in (select role_id from users_role where user_id=#{userId})")
    public List<Role> findOtherRole(String userId);

    @Insert("insert into users_role(user_id,role_id) values(#{userId},#{roleId})")
    void addRoleToUser(@Param("userId") String userId, @Param("roleId") String roleId);


    @Insert("insert into users(email,user_name,password,phone_num,status) values(#{email},#{userName},#{password},#{phoneNum},#{status})")
    public void save(UserInfo userInfo) throws Exception;
}
