package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.INotifyCapability;
import com.huawei.esdk.uc.domain.util.u19.U19Utils;

public class Notify
{
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        Notify.deviceManager = deviceManager;
    }
    
    public SDKErrorCode registerNotification(boolean register)
        throws SDKException
    {
        INotifyCapability notifyCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_appserver_device"),
                INotifyCapability.class);
        return notifyCapability.registerNotification(register);
    }
    
    public SDKErrorCode registerNotification4U19(boolean register)
        throws SDKException
    {
        INotifyCapability notifyCapability =
            getDeviceManager().getDeviceServiceProxy(U19Utils.getU19DeviceId(),
                INotifyCapability.class);
        return notifyCapability.registerNotification(register);
    }
}
