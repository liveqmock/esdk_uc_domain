package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.uc.device.obg.IMCapability;

/**
 * 部门即时消息模型
 * 
 */
public class DeptInstanceMessage extends InstanceMessage
{
    //部门ID
    private String deptNo;
    
    public DeptInstanceMessage(String deptNo)
    {
        super();
        this.setDeptNo(deptNo);
    }
       
    //发送消息
    public SDKErrorCode appSendMessage(String sendNo, String msg, String subject)
    {
        return null;
    }

    public String getDeptNo()
    {
        return deptNo;
    }

    public void setDeptNo(String deptNo)
    {
        this.deptNo = deptNo;
    }

    
    public SDKErrorCode appSendMsgToDept(DeptInstanceMessage deptInstanceMessage) throws SDKException
    {
        IMCapability imCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                IMCapability.class);
        SDKErrorCode errorCode = imCapability.
            appSendMsgToDept(deptInstanceMessage);
        return errorCode;
    }

}
