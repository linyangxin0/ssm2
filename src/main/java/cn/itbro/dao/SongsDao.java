package cn.itbro.dao;

import cn.itbro.domain.Songs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongsDao {

    @Select("select * from songs")
    public List<Songs> findAll() throws Exception;

    @Insert("insert into songs (name,title,update_time,sort,status) values(#{name},#{title},#{updateTime},#{sort},#{status})")
    void addSong(Songs song);

    @Select("select * from songs where name like CONCAT('%',#{searchText},'%')")
    List<Songs> findSongsByName(String searchText);
}
