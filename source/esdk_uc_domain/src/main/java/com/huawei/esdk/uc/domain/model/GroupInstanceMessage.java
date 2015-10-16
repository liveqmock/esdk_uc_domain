package com.huawei.esdk.uc.domain.model;

import java.util.Date;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.uc.device.obg.IMCapability;

/**
 * 群组即时消息模型
 * 
 */
public class GroupInstanceMessage extends InstanceMessage
{
    // 群组ID
    private String groupId;
    
    // 群组创建者UC账号
    private String groupCreator;

    public GroupInstanceMessage(String groupId, String groupCreator)
    {
        super();
        this.setGroupId(groupId);
        this.setGroupCreator(groupCreator);
    }

    // app用户发送消息
    public SDKErrorCode appSendMessage(String sendNo, String msg, Date msgSendTime)
    {
        return null;
    }
    
    public SDKErrorCode appSendMsgToGroup(GroupInstanceMessage groupInstanceMessage) throws SDKException
    {
        IMCapability imCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                IMCapability.class);
        SDKErrorCode errorCode = imCapability.
            appSendMsgToGroup(groupInstanceMessage);
        return errorCode;
    }

    public String getGroupCreator()
    {
        return groupCreator;
    }

    public void setGroupCreator(String groupCreator)
    {
        this.groupCreator = groupCreator;
    }

    public String getGroupId()
    {
        return groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

}
