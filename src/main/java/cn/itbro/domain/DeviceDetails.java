package cn.itbro.domain;

public class DeviceDetails {

    private int id;
    private int device_type_id;
    private String name;
     //    0不在线，1在线
    private int online;
    private String onlineStr;
    private DeviceType deviceType;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDevice_type_id() {
        return device_type_id;
    }

    public void setDevice_type_id(int device_type_id) {
        this.device_type_id = device_type_id;
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
            onlineStr="在线";
        }
        if (online==1){
            onlineStr="不在线";
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
                ", device_type_id=" + device_type_id +
                ", name='" + name + '\'' +
                ", online=" + online +
                ", onlineStr='" + onlineStr + '\'' +
                ", deviceType=" + deviceType +
                '}';
    }
}
