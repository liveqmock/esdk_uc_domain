package com.huawei.esdk.uc.domain.model.bean;

public class UCPresInfo
{
    private UCUserInfo ucUserInfo; // UC用户基本信息
    
    private PresPublishInfo presPublish; // 用户发布的状态信息
    
    private PresPublishInfo presExchange; //用户发布的Exchange日历状态信息

    public PresPublishInfo getPresPublish()
    {
        return presPublish;
    }

    public void setPresPublish(PresPublishInfo presPublish)
    {
        this.presPublish = presPublish;
    }

    public UCUserInfo getUcUserInfo()
    {
        return ucUserInfo;
    }

    public void setUcUserInfo(UCUserInfo ucUserInfo)
    {
        this.ucUserInfo = ucUserInfo;
    }

    public void setPresExchange(PresPublishInfo presExchange)
    {
        this.presExchange = presExchange;
    }

    public PresPublishInfo getPresExchange()
    {
        return presExchange;
    }

}
