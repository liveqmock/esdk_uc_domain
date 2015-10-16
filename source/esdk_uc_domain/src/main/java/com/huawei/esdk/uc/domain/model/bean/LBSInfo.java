package com.huawei.esdk.uc.domain.model.bean;

public class LBSInfo
{
    private String userName; // 用户姓名

    private String ucAccount; // 用户帐号

    private String physicalDetail; // 位置信息

    private String loginTime; // 登录时间

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUcAccount()
    {
        return ucAccount;
    }

    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }

    public String getPhysicalDetail()
    {
        return physicalDetail;
    }

    public void setPhysicalDetail(String physicalDetail)
    {
        this.physicalDetail = physicalDetail;
    }

    public String getLoginTime()
    {
        return loginTime;
    }

    public void setLoginTime(String loginTime)
    {
        this.loginTime = loginTime;
    }

}
