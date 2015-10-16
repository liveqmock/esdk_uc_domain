package com.huawei.esdk.uc.domain.model.bean;

public class ConfAgenda
{
    // 议程说明
    private String text;
    
    // 用户时间 （格式不限）
    private String time;

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }
}
