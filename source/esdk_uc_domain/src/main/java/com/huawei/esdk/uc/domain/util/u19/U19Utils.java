package com.huawei.esdk.uc.domain.util.u19;

import java.util.List;

import com.huawei.esdk.platform.common.bean.config.DeviceConfig;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;

public class U19Utils
{
    private static IDeviceManager deviceManager = ApplicationContextUtil.getBean("deviceManager");
    
    private static List<DeviceConfig> deviceConfigs;
    
    static
    {
        deviceConfigs = deviceManager.queryDeviceInfosByType("U19V1R1C20");
    }
    
    public static String getU19DeviceId()
    {
        
        if (null == deviceConfigs || deviceConfigs.isEmpty())
        {
            return "";
        }
        
        return deviceConfigs.get(0).getDeviceId();
    }
}
