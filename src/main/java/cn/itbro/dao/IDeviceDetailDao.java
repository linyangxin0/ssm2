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
            @Result(property = "deviceTypeId",column = "device_type_id"),
            @Result(property = "deviceType",column = "device_type_id",javaType = DeviceType.class,one = @One(select = "cn.itbro.dao.IDeviceTypeDao.findById")),
    })
    List<DeviceDetails> findAll();


    @Delete("delete from device_details where id=#{id}")
    void deleteDeviceType(String id);

    @Insert("insert into device_details (device_type_id,name,online) values (#{deviceTypeId},#{name},#{online})")
    void save(DeviceDetails deviceDetail);

    @Update("update device_details set device_type_id=#{deviceTypeId},name=#{name},online=#{online} where id=#{id} ")
    void editDetail(DeviceDetails deviceDetails);
}
