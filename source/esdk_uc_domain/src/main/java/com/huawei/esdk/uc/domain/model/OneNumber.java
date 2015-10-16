package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.uc.device.obg.voice.VoiceServiceOneNumberCapability;
import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.domain.model.bean.BindingNumber;
import com.huawei.esdk.uc.domain.model.bean.OneNumberMode;

public class OneNumber
{
    private String oneNumber;
    
    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
    	    .getBean("deviceManager");
    
    public OneNumber(String oneNumber)
    {
        this.setOneNumber(oneNumber);
    }

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    //设置一号通模式
    public SDKErrorCode setOneNumberService(OneNumberMode oneNumberMode) throws SDKException
    {
    	VoiceServiceOneNumberCapability voiceAbility = deviceManager.getDeviceServiceProxy(
                ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                VoiceServiceOneNumberCapability.class);
        return voiceAbility.setOneNumberService(oneNumber, oneNumberMode);
    }
    
    //查询一号通绑定号码
    public SDKResult<List<BindingNumber>> queryBindingNumber() throws SDKException
    {
        SDKResult<List<BindingNumber>> result = null;
        VoiceServiceOneNumberCapability voiceServiceOneNumberCapability = getDeviceManager().getDeviceServiceProxy(
                ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                VoiceServiceOneNumberCapability.class);
        result = voiceServiceOneNumberCapability.queryBindingNumber(getOneNumber());
        return result;
    }

    public String getOneNumber()
    {
        return oneNumber;
    }

    public void setOneNumber(String oneNumber)
    {
        this.oneNumber = oneNumber;
    }

}
