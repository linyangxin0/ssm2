package cn.itbro.dao;

import cn.itbro.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISysLogDao {

    @Insert("insert into syslog(visit_time,user_name,ip,url,execution_time,method) values(#{visitTime},#{userName},#{ip},#{url},#{executionTime},#{method})")
    public void save(SysLog sysLog);

    @Select("select * from syslog")
    List<SysLog> findAll();
}
