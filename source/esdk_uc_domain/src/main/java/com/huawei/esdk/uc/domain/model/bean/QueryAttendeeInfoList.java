package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class QueryAttendeeInfoList
{
    private int amount;
    
    private List<QueryAttendeeInfo> attendeeInfoList;
    
    public int getAmount()
    {
        return amount;
    }
    
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
    public List<QueryAttendeeInfo> getAttendeeInfoList()
    {
        return attendeeInfoList;
    }
    
    public void setAttendeeInfoList(List<QueryAttendeeInfo> attendeeInfoList)
    {
        this.attendeeInfoList = attendeeInfoList;
    }
}
