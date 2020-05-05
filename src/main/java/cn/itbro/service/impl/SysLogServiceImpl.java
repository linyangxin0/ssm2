package cn.itbro.service.impl;

import cn.itbro.dao.ISysLogDao;
import cn.itbro.domain.SysLog;
import cn.itbro.service.ISysLogService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;

    @Override
    public void save(SysLog sysLog){
        sysLogDao.save(sysLog);
    }

    @Override
    public List<SysLog> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return sysLogDao.findAll();
    }
}
