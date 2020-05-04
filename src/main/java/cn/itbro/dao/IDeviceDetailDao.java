package cn.itbro.dao;

import cn.itbro.domain.DeviceDetails;
import cn.itbro.domain.DeviceType;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IDeviceDetailDao {

    @Select("select * from device_details where device_type_id=#{id}")
    public List<DeviceDetails> findDeviceDetailsByDeviceTypeId(String id);

    @Select("select * from device_details")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "online",column = "online"),
            @Result(property = "deviceType",column = "device_type_id",javaType = DeviceType.class,one = @One(select = "cn.itbro.dao.IDeviceTypeDao.findById")),
    })
    List<DeviceDetails> findAll();


}
