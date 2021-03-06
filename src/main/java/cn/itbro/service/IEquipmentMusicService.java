package cn.itbro.service;

import cn.itbro.domain.DeviceDetails;
import cn.itbro.domain.Songs;

import java.util.List;

public interface IEquipmentMusicService {
    List<DeviceDetails> findAll(int var1, int var2);


    List<Songs> findAllSongsById(String id,int var1, int var2);

    void deleteSongs(String songId, String deviceId);

    List<Songs> findSongsNotGet(String deviceId);

    void saveSongs(String songId, String deviceId);
}
