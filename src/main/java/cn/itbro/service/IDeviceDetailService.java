package cn.itbro.service;

import cn.itbro.domain.DeviceDetails;

import java.util.List;

public interface IDeviceDetailService {
    List<DeviceDetails> findAll();

    void deleteDeviceType(String id);

    void save(DeviceDetails deviceDetail);

    void editDetail(DeviceDetails deviceDetails);
}
