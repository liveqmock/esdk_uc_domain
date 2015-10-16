package com.huawei.esdk.uc.domain.model.bean;

public class FriendInfoBase extends UCUserInfo
{
    private String uri; // 路由号码

    private String name; // 名字

    /** * @return the uri */
    public String getUri()
    {
        return uri;
    }

    /** * @param uri the uri to set */
    public void setUri(String uri)
    {
        this.uri = uri;
    }

    /** * @return the name */
    public String getName()
    {
        return name;
    }

    /** * @param name the name to set */
    public void setName(String name)
    {
        this.name = name;
    }

}
