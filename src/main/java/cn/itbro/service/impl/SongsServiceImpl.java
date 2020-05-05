package cn.itbro.service.impl;

import cn.itbro.dao.ISongsDao;
import cn.itbro.domain.Singer;
import cn.itbro.domain.Songs;
import cn.itbro.service.SongsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SongsServiceImpl implements SongsService {

    @Autowired
    private ISongsDao ISongsDao;

    @Override
    public List<Songs> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return ISongsDao.findAll();
    }

    @Override
    public void addSong(Songs song) {
        ISongsDao.addSong(song);
    }

    @Override
    public List<Songs> findSongsByName(String searchText) {

        return ISongsDao.findSongsByName(searchText);
    }

    @Override
    public void updateSongById(Songs song) {
        ISongsDao.updateNameById(song);
        ISongsDao.updateTitleById(song);
        ISongsDao.updateUpdateTimeSongById(song);
        ISongsDao.updateSortById(song);
        ISongsDao.updateStatusById(song);
    }

    @Override
    public void deleteSongById(String id) {
        ISongsDao.deleteSongById(id);
    }

    @Override
    public Singer getSingerBySongId(String singerId) {
        return ISongsDao.getSingerBySongId(singerId);
    }
}
