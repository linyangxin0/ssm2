package cn.itbro.service;

import cn.itbro.domain.SysLog;

import java.util.List;

public interface ISysLogService {

    List<SysLog> findAll(int var1, int var2);

    public void save(SysLog sysLog);
}
