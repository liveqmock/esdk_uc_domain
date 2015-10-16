package com.huawei.esdk.uc.domain.model.bean;

public class JoinGroupInfo
{
    private GroupInfoBase groupInfoBase;

    private String ucAccount;

    private int status;

    public GroupInfoBase getGroupInfoBase()
    {
        return groupInfoBase;
    }

    public void setGroupInfoBase(GroupInfoBase groupInfoBase)
    {
        this.groupInfoBase = groupInfoBase;
    }

    public String getUcAccount()
    {
        return ucAccount;
    }

    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

}
