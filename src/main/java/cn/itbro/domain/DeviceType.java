package cn.itbro.domain;

import java.util.List;

public class DeviceType {

    private int id;
    private String deviceType;
    private List<DeviceDetails> devices;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public List<DeviceDetails> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceDetails> devices) {
        this.devices = devices;
    }


    @Override
    public String toString() {
        return "DeviceType{" +
                "id=" + id +
                ", deviceType='" + deviceType + '\'' +
                ", devices=" + devices +
                '}';
    }
}
