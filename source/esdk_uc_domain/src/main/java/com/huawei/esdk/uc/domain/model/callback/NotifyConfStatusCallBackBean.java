package com.huawei.esdk.uc.domain.model.callback;

public class NotifyConfStatusCallBackBean
{

    private int confMessageType;

    private int result;

    private String memberNumber;

    public int getConfMessageType()
    {
        return confMessageType;
    }

    public void setConfMessageType(int confMessageType)
    {
        this.confMessageType = confMessageType;
    }

    public int getResult()
    {
        return result;
    }

    public void setResult(int result)
    {
        this.result = result;
    }

    public String getMemberNumber()
    {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber)
    {
        this.memberNumber = memberNumber;
    }

}
