package cn.itbro.dao;

import cn.itbro.domain.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPermissionDao {

    @Select("select * from permission where id in (select permission_id from role_permission where role_id=#{id})")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;
}
