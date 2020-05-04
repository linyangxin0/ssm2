package cn.itbro.service.impl;

import cn.itbro.dao.IDeviceDetailDao;
import cn.itbro.domain.DeviceDetails;
import cn.itbro.service.IDeviceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeviceDetailServiceImpl implements IDeviceDetailService {

    @Autowired
    private IDeviceDetailDao deviceDetailDao;

    @Override
    public List<DeviceDetails> findAll() {
        return deviceDetailDao.findAll();
    }
}
