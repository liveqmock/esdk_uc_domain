package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class TeamMemberChangeInfo extends ChangeInfo
{
    private String teamId; // 分组ID

    private List<String> linkmanIdList;// 联系人ID列表

    public String getTeamId()
    {
        return teamId;
    }

    public void setTeamId(String teamId)
    {
        this.teamId = teamId;
    }

    public List<String> getLinkmanIdList()
    {
        return linkmanIdList;
    }

    public void setLinkmanIdList(List<String> linkmanIdList)
    {
        this.linkmanIdList = linkmanIdList;
    }
}
