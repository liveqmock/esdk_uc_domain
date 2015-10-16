package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.bmu.IPhoneCapability;
import com.huawei.esdk.uc.domain.model.bean.PhoneInfo;
import com.huawei.esdk.uc.domain.model.bean.PhoneStateList;

public class Phone
{
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        Phone.deviceManager = deviceManager;
    }
    
    public SDKResult<PhoneStateList> queryPhoneState(String userId, List<PhoneInfo> phoneInfoList)
        throws SDKException
    {
        IPhoneCapability phoneCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IPhoneCapability.class);
        return phoneCapability.queryPhoneState(userId, phoneInfoList);
    }
}
