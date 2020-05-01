package cn.itbro.service;

import cn.itbro.domain.Songs;

import java.util.List;

public interface SongsService {

    public List<Songs> findAll() throws Exception;

    public void addSong(Songs song);

    public List<Songs> findSongsByName(String searchText);
}
