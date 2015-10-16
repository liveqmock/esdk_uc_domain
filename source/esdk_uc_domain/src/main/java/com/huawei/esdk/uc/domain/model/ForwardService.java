package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.voice.VoiceServiceFWDNumberCapability;
import com.huawei.esdk.uc.domain.model.bean.ForwardInfo;

public class ForwardService
{
	// 用户号码
    private String userNumber;

    // 前转信息
    private ForwardInfo forwardInfo;

    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
            .getBean("deviceManager");

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }

    public ForwardService(String userNumber)
    {
        this.setUserNumber(userNumber);
    }

    // UC用户号码前转设置
    public SDKErrorCode setFWDService(String fwdType, String fwdNumber)
            throws SDKException
    {
        VoiceServiceFWDNumberCapability fwdNumberCapability = getDeviceManager()
                .getDeviceServiceProxy(
                		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        VoiceServiceFWDNumberCapability.class);
        return fwdNumberCapability
                .setFWDService(userNumber, fwdType, fwdNumber);
    }

    // UC用户号码前转查询
    public SDKResult<List<ForwardInfo>> queryFWDService() throws SDKException
    {
        VoiceServiceFWDNumberCapability voiceServiceFWDNumberCapability = getDeviceManager()
                .getDeviceServiceProxy(
                		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        VoiceServiceFWDNumberCapability.class);
        SDKResult<List<ForwardInfo>> result = voiceServiceFWDNumberCapability
                .queryFWDService(getUserNumber());
        return result;
    }

    // UC用户取消号码前转设置
    public SDKErrorCode unsetFWDService(String fwdType) throws SDKException
    {
        VoiceServiceFWDNumberCapability fwdNumberCapability = getDeviceManager()
                .getDeviceServiceProxy(
                		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        VoiceServiceFWDNumberCapability.class);
        return fwdNumberCapability.unsetFWDService(userNumber, fwdType);
    }

    public String getUserNumber()
    {
        return userNumber;
    }

    public void setUserNumber(String userNumber)
    {
        this.userNumber = userNumber;
    }

    public ForwardInfo getForwardInfo()
    {
        return forwardInfo;
    }

    public void setForwardInfo(ForwardInfo forwardInfo)
    {
        this.forwardInfo = forwardInfo;
    }

}
