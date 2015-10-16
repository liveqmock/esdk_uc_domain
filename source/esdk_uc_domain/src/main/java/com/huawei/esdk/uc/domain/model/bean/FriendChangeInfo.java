package com.huawei.esdk.uc.domain.model.bean;

public class FriendChangeInfo extends ChangeInfo
{
    private FriendInfo friendInfo; // 好友信息

    /** * @return the friendInfoBase */
    public FriendInfo getFriendInfoBase()
    {
        return friendInfo;
    }

    /** * @param friendInfoBase the friendInfoBase to set */
    public void setFriendInfoBase(FriendInfo friendInfo)
    {
        this.friendInfo = friendInfo;
    }
}
