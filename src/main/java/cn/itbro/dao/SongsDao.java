package cn.itbro.dao;

import cn.itbro.domain.Songs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

//    根据id修改信息
    @Update("update songs set name=#{name} where id=#{id}")
    public void updateNameById(Songs song);
    @Update("update songs set title=#{title} where id=#{id}")
    public void updateTitleById(Songs song);
    @Update("update songs set update_time=#{updateTime} where id=#{id}")
    public void updateUpdateTimeSongById(Songs song);
    @Update("update songs set sort=#{sort} where id=#{id}")
    public void updateSortById(Songs song);
    @Update("update songs set status=#{status} where id=#{id}")
    public void updateStatusById(Songs song);

    @Delete("delete from songs where id=#{id}")
    public void deleteSongById(String id);
}
