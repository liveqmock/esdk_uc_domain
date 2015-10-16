package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class BWList
{
    private String flowType; 

    private String activeBWListFlag;

    private String bwListFlag;

    private List<ScreenNum> screenNums;

    public String getFlowType()
    {
        return flowType;
    }

    public void setFlowType(String flowType)
    {
        this.flowType = flowType;
    }

    public String getActiveBWListFlag()
    {
        return activeBWListFlag;
    }

    public void setActiveBWListFlag(String activeBWListFlag)
    {
        this.activeBWListFlag = activeBWListFlag;
    }

    public String getBwListFlag()
    {
        return bwListFlag;
    }

    public void setBwListFlag(String bwListFlag)
    {
        this.bwListFlag = bwListFlag;
    }

    public List<ScreenNum> getScreenNums()
    {
        return screenNums;
    }

    public void setScreenNums(List<ScreenNum> screenNums)
    {
        this.screenNums = screenNums;
    }

    
}
