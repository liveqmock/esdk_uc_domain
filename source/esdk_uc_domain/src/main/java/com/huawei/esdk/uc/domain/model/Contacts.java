package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;

public class Contacts
{
    public Contacts()
    {
        
    }
    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
        .getBean("deviceManager");

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
}
