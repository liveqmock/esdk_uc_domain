package com.huawei.esdk.uc.domain.model.bean;

public class GroupInfoBase
{
    private String groupName; // 群组名

    private String groupNo; // 群组号

    protected String groupId; // 群组Id

    protected String groupCreater; // 群组创建者
    
    protected String groupOwner;//当前的群组管理员

    private String creatorURL;//群组创建者URL
    
    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getGroupNo()
    {
        return groupNo;
    }

    public void setGroupNo(String groupNo)
    {
        this.groupNo = groupNo;
    }

    public String getGroupId()
    {
        return groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    public String getGroupCreater()
    {
        return groupCreater;
    }

    public void setGroupCreater(String creator)
    {
        this.groupCreater = creator;
    }

    public String getGroupOwner()
    {
        return groupOwner;
    }

    public void setGroupOwner(String groupOwner)
    {
        this.groupOwner = groupOwner;
    }

	public String getCreatorURL() {
		return creatorURL;
	}

	public void setCreatorURL(String creatorURL) {
		this.creatorURL = creatorURL;
	}
}
