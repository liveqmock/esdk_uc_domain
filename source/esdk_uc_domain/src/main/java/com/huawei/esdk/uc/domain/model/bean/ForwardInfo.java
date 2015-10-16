package com.huawei.esdk.uc.domain.model.bean;

public class ForwardInfo
{
    private String fwdType; // 呼叫转移类型

    private String fwdNumber; // 前转号码

    public String getFwdType()
    {
        return fwdType;
    }

    public void setFwdType(String fwdType)
    {
        this.fwdType = fwdType;
    }

    public String getFwdNumber()
    {
        return fwdNumber;
    }

    public void setFwdNumber(String fwdNumber)
    {
        this.fwdNumber = fwdNumber;
    }
}
