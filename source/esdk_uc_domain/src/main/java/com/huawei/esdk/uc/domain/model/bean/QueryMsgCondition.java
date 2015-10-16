package com.huawei.esdk.uc.domain.model.bean; import java.util.Date;

/** * @author w00208247 * *  */
public class QueryMsgCondition
{
    private String userNum;
    private String msgType;
    private Date startTime;
    private Date endTime;
    
    public String getUserNum()
    {
        return userNum;
    }
    public void setUserNum(String userNum)
    {
        this.userNum = userNum;
    }
    public String getMsgType()
    {
        return msgType;
    }
    public void setMsgType(String msgType)
    {
        this.msgType = msgType;
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

}
