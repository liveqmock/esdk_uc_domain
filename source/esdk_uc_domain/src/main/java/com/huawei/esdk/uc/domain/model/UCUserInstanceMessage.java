package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.uc.device.obg.IMCapability;

/**
 * 部门即时消息模型
 * 
 */
public class UCUserInstanceMessage extends InstanceMessage
{
    //UC账号ID
    private String ucAccount;
    
    public UCUserInstanceMessage(String ucAccount)
    {
        super();
        this.setUcAccount(ucAccount);
    }

    public SDKErrorCode appSendMsgToUC(UCUserInstanceMessage userInstanceMessage) throws SDKException
    {
        IMCapability imCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                IMCapability.class);
        SDKErrorCode errorCode = imCapability.
            appSendMsgToUC(userInstanceMessage);
        return errorCode;
        
    }
       
    public String getUcAccount()
    {
        return ucAccount;
    }

    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }
}
