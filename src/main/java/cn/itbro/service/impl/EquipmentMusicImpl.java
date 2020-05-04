package cn.itbro.service.impl;

import cn.itbro.dao.IEquipmentMusicDao;
import cn.itbro.domain.DeviceDetails;
import cn.itbro.domain.Songs;
import cn.itbro.service.IEquipmentMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EquipmentMusicImpl implements IEquipmentMusicService {

    @Autowired
    private IEquipmentMusicDao equipmentMusicDao;

    @Override
    public List<DeviceDetails> findAll() {
        return equipmentMusicDao.findAll();
    }

    @Override
    public List<Songs> findAllSongsById(String id) {
        return equipmentMusicDao.findAllSongsById(id);

    }

    @Override
    public void deleteSongs(String songId, String deviceId) {
        equipmentMusicDao.deleteSongs(songId,deviceId);
    }

    @Override
    public List<Songs> findSongsNotGet(String deviceId) {
        return equipmentMusicDao.findSongsNotGet(deviceId);
    }

    @Override
    public void saveSongs(String songId, String deviceId) {
        equipmentMusicDao.saveSongs(songId,deviceId);
    }


}
