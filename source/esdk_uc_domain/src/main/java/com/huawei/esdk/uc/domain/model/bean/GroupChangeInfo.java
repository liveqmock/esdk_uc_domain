package com.huawei.esdk.uc.domain.model.bean;

import com.huawei.esdk.uc.domain.model.Group;

public class GroupChangeInfo extends ChangeInfo
{
    private Group groupInfo;        // 群组信息

    /** * @return the groupInfo */
    public Group getGroupInfo()
    {
        return groupInfo;
    }

    /** * @param groupInfo the groupInfo to set */
    public void setGroupInfo(Group groupInfo)
    {
        this.groupInfo = groupInfo;
    }

}
