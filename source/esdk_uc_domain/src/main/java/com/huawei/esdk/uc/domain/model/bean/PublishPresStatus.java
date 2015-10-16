package com.huawei.esdk.uc.domain.model.bean;

public class PublishPresStatus
{
    private String presTag;
    
    private long expires;

    public long getExpires()
    {
        return expires;
    }

    public void setExpires(long expires)
    {
        this.expires = expires;
    }

    public String getPresTag()
    {
        return presTag;
    }

    public void setPresTag(String presTag)
    {
        this.presTag = presTag;
    }
    
}
