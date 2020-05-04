package cn.itbro.dao;

import cn.itbro.domain.DeviceDetails;
import cn.itbro.domain.Songs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IEquipmentMusicDao {

    @Select("select * from device_details")
    List<DeviceDetails> findAll();


    @Select("select * from songs where id in (select songs_id from songs_device where device_details_id=#{id})")
    List<Songs> findAllSongsById(String id);

    @Delete("delete from songs_device where songs_id=#{songId} and device_details_id=#{deviceId}")
    void deleteSongs(@Param("songId") String songId,@Param("deviceId") String deviceId);
}
