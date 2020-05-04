package cn.itbro.service.impl;

import cn.itbro.dao.IDeviceTypeDao;
import cn.itbro.domain.DeviceType;
import cn.itbro.service.IDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeviceTypeServiceImpl implements IDeviceTypeService {

    @Autowired
    private IDeviceTypeDao deviceTypeDao;

    @Override
    public List<DeviceType> findAll() {
        return deviceTypeDao.findAll();
    }

    @Override
    public DeviceType findDeviceDetailsByDeviceTypeId(String id) {
        return deviceTypeDao.findDeviceDetailsByDeviceTypeId(id);
    }
}
