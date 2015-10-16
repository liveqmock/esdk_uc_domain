package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class BindingNumber
{
    private String bindingNumber;

    private String priority;

    private String bindType;

    private String useTimeRange;

    private List<BindingTimeInfo> bindingTimeInfos;

    public String getBindingNumber()
    {
        return bindingNumber;
    }

    public void setBindingNumber(String bindingNumber)
    {
        this.bindingNumber = bindingNumber;
    }

    public String getPriority()
    {
        return priority;
    }

    public void setPriority(String priority)
    {
        this.priority = priority;
    }

    public String getBindType()
    {
        return bindType;
    }

    public void setBindType(String bindType)
    {
        this.bindType = bindType;
    }

    public String getUseTimeRange()
    {
        return useTimeRange;
    }

    public void setUseTimeRange(String useTimeRange)
    {
        this.useTimeRange = useTimeRange;
    }

    public List<BindingTimeInfo> getBindingTimeInfos()
    {
        return bindingTimeInfos;
    }

    public void setBindingTimeInfos(List<BindingTimeInfo> bindingTimeInfos)
    {
        this.bindingTimeInfos = bindingTimeInfos;
    }

}
