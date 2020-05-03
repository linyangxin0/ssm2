package cn.itbro.service;

import cn.itbro.domain.SysLog;

import java.util.List;

public interface ISysLogService {

    List<SysLog> findAll();

    public void save(SysLog sysLog);
}
