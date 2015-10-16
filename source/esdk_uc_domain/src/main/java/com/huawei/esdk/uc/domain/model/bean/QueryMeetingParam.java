package com.huawei.esdk.uc.domain.model.bean;

import java.util.Date;

public class QueryMeetingParam
{
    //操作用户
    private String userId;
    
    //会议Id
    private String confId;
    
    //与会人号码
    private String phone;
    
    //会议主题 
    private String confName;
    
    //起始时间
    private Date startTime;
    
    //结束时间
    private Date endTime;
    
    //分页大小
    private String pageCount;
    
    //分页
    private String pageNum;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getConfId()
    {
        return confId;
    }

    public void setConfId(String confId)
    {
        this.confId = confId;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getConfName()
    {
        return confName;
    }

    public void setConfName(String confName)
    {
        this.confName = confName;
    }

    public Date getStartTime()
    {
        if(startTime == null)
            return null;
        return (Date)startTime.clone();
    }

    public void setStartTime(Date startTime)
    {
        this.startTime = (Date)startTime.clone();
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

    public String getPageCount()
    {
        return pageCount;
    }

    public void setPageCount(String pageCount)
    {
        this.pageCount = pageCount;
    }

    public String getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(String pageNum)
    {
        this.pageNum = pageNum;
    }

}
