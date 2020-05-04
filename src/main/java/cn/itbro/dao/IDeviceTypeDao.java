package cn.itbro.dao;

import cn.itbro.domain.DeviceType;
import org.apache.ibatis.annotations.*;


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

    @Insert("insert into device_type (device_type) values (#{deviceType})")
    void save(String deviceType);

    @Delete("delete from device_type where id=#{id}")
    void deleteDeviceType(String id);

    @Delete("delete from device_details where device_type_id=#{id}")
    void deleteDeviceDetailsByDetailTypeId(String id);

    @Select("select * from device_type where id=#{id}")
    public DeviceType findById(String id);
}
