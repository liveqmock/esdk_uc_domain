package com.huawei.esdk.uc.domain.model.bean;

import java.util.Date;
import java.util.List;

public class PeronalChangeInfo
{
    // 分组变化信息列表
    private List<PersonalTeamChangeInfo> personalTeamChangeInfos;

    // 联系人变化信息列表
    private List<LinkmanChangeInfo> linkmanChanges;

    // 分组成员变化信息列表
    private List<TeamMemberChangeInfo> teamMemberChangeInfos;

    // 群组变化信息列表
    private List<GroupChangeInfo> groupChangeInfos;

    //时间戳
    private Date timeStamp;
    
    public Date getTimeStamp()
    {
        if(timeStamp == null)
            return null;
        return (Date)timeStamp.clone();
    }

    public void setTimeStamp(Date timeStamp)
    {
        this.timeStamp = (Date)timeStamp.clone();
    }

    public List<PersonalTeamChangeInfo> getPersonalTeamChangeInfos()
    {
        return personalTeamChangeInfos;
    }

    public void setPersonalTeamChangeInfos(
            List<PersonalTeamChangeInfo> personalTeamChangeInfos)
    {
        this.personalTeamChangeInfos = personalTeamChangeInfos;
    }

    public List<LinkmanChangeInfo> getLinkmanChanges()
    {
        return linkmanChanges;
    }

    public void setLinkmanChanges(List<LinkmanChangeInfo> linkmanChanges)
    {
        this.linkmanChanges = linkmanChanges;
    }

    public List<TeamMemberChangeInfo> getTeamMemberChangeInfos()
    {
        return teamMemberChangeInfos;
    }

    public void setTeamMemberChangeInfos(
            List<TeamMemberChangeInfo> teamMemberChangeInfos)
    {
        this.teamMemberChangeInfos = teamMemberChangeInfos;
    }

    public List<GroupChangeInfo> getGroupChangeInfos()
    {
        return groupChangeInfos;
    }

    public void setGroupChangeInfos(List<GroupChangeInfo> groupChangeInfos)
    {
        this.groupChangeInfos = groupChangeInfos;
    }
}
