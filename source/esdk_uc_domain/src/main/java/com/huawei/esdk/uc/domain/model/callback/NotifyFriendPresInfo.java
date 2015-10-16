package com.huawei.esdk.uc.domain.model.callback;

import java.util.ArrayList;
import java.util.List;

import com.huawei.esdk.uc.domain.model.bean.BuddyInfo;

public class NotifyFriendPresInfo
{
    private String ucAccount;

    private List<BuddyInfo> buddyInfos;

    private int expires;

    public String getUcAccount()
    {
        return ucAccount;
    }

    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }

    public List<BuddyInfo> getBuddyInfos()
    {
        if (null == buddyInfos)
        {
            buddyInfos = new ArrayList<BuddyInfo>();
        }
        return buddyInfos;
    }

    public void setBuddyInfos(List<BuddyInfo> buddyInfos)
    {
        this.buddyInfos = buddyInfos;
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
