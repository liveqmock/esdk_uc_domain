package com.huawei.esdk.uc.domain.model.bean;

public class LinkmanChangeInfo extends ChangeInfo
{
    private LinkmanInfo linkmanInfo;        // 联系人信息

    /** * @return the linkmanInfo */
    public LinkmanInfo getLinkmanInfo()
    {
        return linkmanInfo;
    }

    /** * @param linkmanInfo the linkmanInfo to set */
    public void setLinkmanInfo(LinkmanInfo linkmanInfo)
    {
        this.linkmanInfo = linkmanInfo;
    }
}
