package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class PersonalTeamInfo extends PersonalTeam
{
    private List<String> linkmanIdList; // 联系人ID列表

    public List<String> getLinkmanIdList()
    {
        return linkmanIdList;
    }

    public void setLinkmanIdList(List<String> linkmanIdList)
    {
        this.linkmanIdList = linkmanIdList;
    }

}
