package com.huawei.esdk.uc.domain.model.bean;

public class ScreenNum
{
    private String screenNumType; // 号码范围类型

    private String number; // 范围内号码

    private String numberEnd; // 号码范围下限

    public String getScreenNumType()
    {
        return screenNumType;
    }

    public void setScreenNumType(String screenNumType)
    {
        this.screenNumType = screenNumType;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumberEnd()
    {
        return numberEnd;
    }

    public void setNumberEnd(String numberEnd)
    {
        this.numberEnd = numberEnd;
    }

}
