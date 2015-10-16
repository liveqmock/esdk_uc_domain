package com.huawei.esdk.uc.domain.model.bean;  public class WatcherInfo
{
    //被订阅者账号
    private String watcherAccount;
    
    //订阅关系状态
    private int state;
    
    //好友订阅触发事件
    private int event;

    public int getEvent()
    {
        return event;
    }

    public void setEvent(int event)
    {
        this.event = event;
    }

    public int getState()
    {
        return state;
    }

    public void setState(int state)
    {
        this.state = state;
    }

    public String getWatcherAccount()
    {
        return watcherAccount;
    }

    public void setWatcherAccount(String watcherAccount)
    {
        this.watcherAccount = watcherAccount;
    }
    
}
