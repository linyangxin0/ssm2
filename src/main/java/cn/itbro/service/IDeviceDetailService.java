package cn.itbro.service;

import cn.itbro.domain.DeviceDetails;

import java.util.List;

public interface IDeviceDetailService {
    List<DeviceDetails> findAll();
}
