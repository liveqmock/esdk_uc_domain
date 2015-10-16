package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.voice.VoiceServiceBWNumberCapability;
import com.huawei.esdk.uc.domain.model.bean.BWList;

public class BlackWhiteListService
{
    private String userNumber;
    
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");

    public BlackWhiteListService(String userNumber)
    {
        this.setUserNumber(userNumber);
    }
    
    //UC用户号码黑白名单状态设置
    public SDKResult<String> setBWListState(String bwListFlag) throws SDKException
    {
        VoiceServiceBWNumberCapability voiceServiceBWNumberCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                    VoiceServiceBWNumberCapability.class);
        return voiceServiceBWNumberCapability.setBWListState(userNumber, bwListFlag);
    }
    
    //UC用户号码黑白名单业务设置
    public SDKErrorCode setBWService(String optCode, BWList bwList) throws SDKException
    {
        VoiceServiceBWNumberCapability voiceServiceBWNumberCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                    VoiceServiceBWNumberCapability.class);
        return voiceServiceBWNumberCapability.setBWService(userNumber,optCode, bwList);
    }
    
    // UC用户号码黑白名单查询
    public SDKResult<List<BWList>> queryBWService() throws SDKException
    {
        VoiceServiceBWNumberCapability voiceServiceBWNumberCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                VoiceServiceBWNumberCapability.class);
        SDKResult<List<BWList>> result = voiceServiceBWNumberCapability.
        queryBWService(getUserNumber());
        return result;
    }

    public String getUserNumber()
    {
        return userNumber;
    }

    public void setUserNumber(String userNumber)
    {
        this.userNumber = userNumber;
    }

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }

    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        BlackWhiteListService.deviceManager = deviceManager;
    }
    
}
