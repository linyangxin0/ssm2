package cn.itbro.dao;

import cn.itbro.domain.DeviceDetails;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IDeviceDetailDao {

    @Select("select * from device_details where device_type_id=#{id}")
    public List<DeviceDetails> findDeviceDetailsByDeviceTypeId(String id);
}
