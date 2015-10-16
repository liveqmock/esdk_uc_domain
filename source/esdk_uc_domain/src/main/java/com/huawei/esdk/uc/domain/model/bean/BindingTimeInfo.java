package com.huawei.esdk.uc.domain.model.bean;

import java.util.Date;

public class BindingTimeInfo
{
    private String beginWeekDay;

    private String endWeekDay;

    private Date beginTime;

    private Date endTime;

    public String getBeginWeekDay()
    {
        return beginWeekDay;
    }

    public void setBeginWeekDay(String beginWeekDay)
    {
        this.beginWeekDay = beginWeekDay;
    }

    public String getEndWeekDay()
    {
        return endWeekDay;
    }

    public void setEndWeekDay(String endWeekDay)
    {
        this.endWeekDay = endWeekDay;
    }

    public Date getBeginTime()
    {
        if(beginTime == null)
            return null;
        return (Date)beginTime.clone();
    }

    public void setBeginTime(Date beginTime)
    {
        this.beginTime = (Date)beginTime.clone();
    }

    public Date getEndTime()
    {
        if(endTime == null)
            return null;
        return (Date)endTime.clone();
    }

    public void setEndTime(Date endTime)
    {
        this.endTime = (Date)endTime.clone();
    }

}
