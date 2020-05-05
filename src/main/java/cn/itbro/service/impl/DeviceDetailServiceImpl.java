package cn.itbro.service.impl;

import cn.itbro.dao.IDeviceDetailDao;
import cn.itbro.domain.DeviceDetails;
import cn.itbro.service.IDeviceDetailService;
import com.github.pagehelper.PageHelper;
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
    public List<DeviceDetails> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return deviceDetailDao.findAll();
    }

    @Override
    public void deleteDeviceType(String id) {
        deviceDetailDao.deleteDeviceType(id);
    }

    @Override
    public void save(DeviceDetails deviceDetail) {
        deviceDetailDao.save(deviceDetail);
    }

    @Override
    public void editDetail(DeviceDetails deviceDetails) {
        deviceDetailDao.editDetail(deviceDetails);
    }
}
