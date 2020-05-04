package cn.itbro.dao;

import cn.itbro.domain.DeviceDetails;
import cn.itbro.domain.Songs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
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

    @Select("select * from songs where id not in (select songs_id from songs_device where device_details_id=#{deviceId})")
    List<Songs> findSongsNotGet(String deviceId);

    @Insert("insert into songs_device (songs_id,device_details_id) values (#{songId},#{deviceId})")
    void saveSongs(@Param("songId")String songId, @Param("deviceId")String deviceId);
}
