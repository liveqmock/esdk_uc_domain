package com.huawei.esdk.uc.domain.model.bean;

public class DelAtteInfo
{
    /**
     * 与会者号码，最大32位长度号码
     */
    private String attendeeNumber;
    
    /**
     * 与会者是否注册用户
     */
    private String isRegister;

    public String getAttendeeNumber()
    {
        return attendeeNumber;
    }

    public void setAttendeeNumber(String attendeeNumber)
    {
        this.attendeeNumber = attendeeNumber;
    }

    public String getIsRegister()
    {
        return isRegister;
    }

    public void setIsRegister(String isRegister)
    {
        this.isRegister = isRegister;
    }
}
