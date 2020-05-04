package cn.itbro.dao;

import cn.itbro.domain.DeviceType;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface IDeviceTypeDao {

    @Select("select * from device_type")
    List<DeviceType> findAll();

    @Select("Select * from device_type where id=#{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "deviceType",column = "device_type"),
            @Result(property = "devices",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.itbro.dao.IDeviceDetailDao.findDeviceDetailsByDeviceTypeId")),
    })
    DeviceType findDeviceDetailsByDeviceTypeId(String id);
}
