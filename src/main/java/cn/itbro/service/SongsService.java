package cn.itbro.service;

import cn.itbro.domain.Singer;
import cn.itbro.domain.Songs;

import java.util.List;

public interface SongsService {

    public List<Songs> findAll(int var1, int var2) throws Exception;

    public void addSong(Songs song);

    public List<Songs> findSongsByName(String searchText);

    public void updateSongById(Songs song);

    public void deleteSongById(String id);

    Singer getSingerBySongId(String singerId);
}
