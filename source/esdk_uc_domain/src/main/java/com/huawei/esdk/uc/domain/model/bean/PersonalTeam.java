package com.huawei.esdk.uc.domain.model.bean;

public class PersonalTeam
{
    private String teamId; // 分组ID

    private String displayName; // 分组名称

    private long teamIndex; // 分组序号

    public String getTeamId()
    {
        return teamId;
    }

    public void setTeamId(String teamId)
    {
        this.teamId = teamId;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public long getTeamIndex()
    {
        return teamIndex;
    }

    public void setTeamIndex(long teamIndex)
    {
        this.teamIndex = teamIndex;
    }
}
