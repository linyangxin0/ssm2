package cn.itbro.service;

import cn.itbro.domain.DeviceType;

import java.util.List;

public interface IDeviceTypeService {
    List<DeviceType> findAll();

    DeviceType findDeviceDetailsByDeviceTypeId(String id);
}
