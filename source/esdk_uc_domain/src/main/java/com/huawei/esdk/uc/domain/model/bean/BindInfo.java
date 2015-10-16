package com.huawei.esdk.uc.domain.model.bean;

public class BindInfo
{
    private String ucAccount;

    public String getUcAccount()
    {
        return ucAccount;
    }

    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }

    public String getCorpInterNumber()
    {
        return corpInterNumber;
    }

    public void setCorpInterNumber(String corpInterNumber)
    {
        this.corpInterNumber = corpInterNumber;
    }

    public String getCorpId()
    {
        return corpId;
    }

    public void setCorpId(String corpId)
    {
        this.corpId = corpId;
    }

    public int getBindType()
    {
        return bindType;
    }

    public void setBindType(int bindType)
    {
        this.bindType = bindType;
    }

    private String corpInterNumber;

    private String corpId;

    private int bindType;

}
