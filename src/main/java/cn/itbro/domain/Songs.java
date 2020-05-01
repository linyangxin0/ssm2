package cn.itbro.domain;

import cn.itbro.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Songs implements Serializable {
    private int id;
    private String name;
    private String title;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date updateTime;
    private String updateTimeStr;
    private int sort;
    private int status;

    public String getUpdateTimeStr() {
        if(updateTime!=null){
            updateTimeStr= DateUtils.date2String(updateTime,"yyyy-MM-dd HH:mm");
        }
        return updateTimeStr;
    }

    public void setUpdateTimeStr(String updateTimeStr) {
        this.updateTimeStr = updateTimeStr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", updateTime=" + updateTime +
                ", sort=" + sort +
                ", status=" + status +
                '}';
    }
}
