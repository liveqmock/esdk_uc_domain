package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class AttendeeInfo
{
    private String recordNum;
    
    private String msgContentLen;
    
    private List<String> attendeeNumbers;
    
    public String getRecordNum()
    {
        return recordNum;
    }
    
    public void setRecordNum(String recordNum)
    {
        this.recordNum = recordNum;
    }
    
    public String getMsgContentLen()
    {
        return msgContentLen;
    }
    
    public void setMsgContentLen(String msgContentLen)
    {
        this.msgContentLen = msgContentLen;
    }
    
    public List<String> getAttendeeNumbers()
    {
        return attendeeNumbers;
    }
    
    public void setAttendeeNumbers(List<String> attendeeNumbers)
    {
        this.attendeeNumbers = attendeeNumbers;
    }
}
