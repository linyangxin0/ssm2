package cn.itbro.service.impl;

import cn.itbro.dao.SongsDao;
import cn.itbro.domain.Songs;
import cn.itbro.service.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SongsServiceImpl implements SongsService {

    @Autowired
    private SongsDao songsDao;

    @Override
    public List<Songs> findAll() throws Exception {
        return songsDao.findAll();
    }

    @Override
    public void addSong(Songs song) {
        songsDao.addSong(song);
    }

    @Override
    public List<Songs> findSongsByName(String searchText) {

        return songsDao.findSongsByName(searchText);
    }
}
