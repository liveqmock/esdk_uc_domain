package com.huawei.esdk.uc.domain.model.bean;

public class PresPublishInfo
{
    private UCPresType presType; // 用户类型状态

    private String location; // 地点

    private String deviceType; // 设备类型

    private String tZone; // 时区

    private String availableTool; // 可用工具

    private String presStatus; //用户状态
    
    public UCPresType getPresType()
    {
        return presType;
    }

    public void setPresType(UCPresType presType)
    {
        this.presType = presType;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getTZone()
    {
        return tZone;
    }

    public void setTZone(String tZone)
    {
        this.tZone = tZone;
    }

    public String getAvailableTool()
    {
        return availableTool;
    }

    public void setAvailableTool(String availableTool)
    {
        this.availableTool = availableTool;
    }

    public String getPresStatus()
    {
        return presStatus;
    }

    public void setPresStatus(String presStatus)
    {
        this.presStatus = presStatus;
    }

}
