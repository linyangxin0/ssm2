package cn.itbro.domain;

import java.util.List;

public class DeviceDetails {

    private int id;
    private int deviceTypeId;
    private String name;
     //    0不在线，1在线
    private int online;
    private String onlineStr;
    private DeviceType deviceType;
    private List<Songs> songs;

    public List<Songs> getSongs() {
        return songs;
    }

    public void setSongs(List<Songs> songs) {
        this.songs = songs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(int deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public String getOnlineStr() {
        if(online==0){
            onlineStr="不在线";
        }
        if (online==1){
            onlineStr="在线";
        }
        return onlineStr;
    }

    public void setOnlineStr(String onlineStr) {
        this.onlineStr = onlineStr;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return "DeviceDetails{" +
                "id=" + id +
                ", deviceTypeId=" + deviceTypeId +
                ", name='" + name + '\'' +
                ", online=" + online +
                ", onlineStr='" + onlineStr + '\'' +
                ", deviceType=" + deviceType +
                ", songs=" + songs +
                '}';
    }
}
