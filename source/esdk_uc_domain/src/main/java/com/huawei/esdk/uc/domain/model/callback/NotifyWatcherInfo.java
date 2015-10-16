package com.huawei.esdk.uc.domain.model.callback;

import java.util.List;

import com.huawei.esdk.uc.domain.model.bean.WatcherInfo;

public class NotifyWatcherInfo
{
    private String ucAccount;

    private List<WatcherInfo> watcherInfoList;

    private int expires;

    public String getUcAccount()
    {
        return ucAccount;
    }

    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }

    public List<WatcherInfo> getWatcherInfoList()
    {
        return watcherInfoList;
    }

    public void setWatcherInfoList(List<WatcherInfo> watcherInfoList)
    {
        this.watcherInfoList = watcherInfoList;
    }

    public int getExpires()
    {
        return expires;
    }

    public void setExpires(int expires)
    {
        this.expires = expires;
    }

}
