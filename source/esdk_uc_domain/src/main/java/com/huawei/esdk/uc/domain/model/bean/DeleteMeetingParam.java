package com.huawei.esdk.uc.domain.model.bean;

public class DeleteMeetingParam
{
    //网关IP
    private String gwIp;
    
    //虚拟PBX ID，仅作为删除会议时的返回参数
    private String subPbx;
    
    //会议id
    private String confId;

    public String getGwIp()
    {
        return gwIp;
    }

    public void setGwIp(String gwIp)
    {
        this.gwIp = gwIp;
    }

    public String getSubPbx()
    {
        return subPbx;
    }

    public void setSubPbx(String subPbx)
    {
        this.subPbx = subPbx;
    }

    public String getConfId()
    {
        return confId;
    }

    public void setConfId(String confId)
    {
        this.confId= confId;
    }
}
