package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.voice.VoiceServiceOneNumberCapability;
import com.huawei.esdk.uc.domain.model.bean.BindingNumber;
import com.huawei.esdk.uc.domain.model.bean.OneNumberMode;

public class OneNumberService
{
	//一号通服务uc账号
    private String userAccount;
    
    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
    	    .getBean("deviceManager");

    public OneNumberService(String userAccount)
    {
        this.setUserAccount(userAccount);
    }

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    //设置一号通主号码
    public SDKErrorCode setOneNumber(String optCode, String oneNumber) throws SDKException
    {
    	VoiceServiceOneNumberCapability voiceAbility = getDeviceManager().getDeviceServiceProxy(
                ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                VoiceServiceOneNumberCapability.class);
        return voiceAbility.setOneNumber(userAccount, optCode, oneNumber);
    }

    //设置一号通绑定号码
    public SDKErrorCode setBindingNumber(String optCode, String oneNumber, BindingNumber bindingNumberInfo) 
        throws SDKException
    {
        SDKErrorCode result = null;
        VoiceServiceOneNumberCapability voiceServiceOneNumberCapability = getDeviceManager().getDeviceServiceProxy(
                ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                VoiceServiceOneNumberCapability.class);
        result = voiceServiceOneNumberCapability.setBindingNumber(getUserAccount(), optCode,
            oneNumber, bindingNumberInfo);
        return result;
    }
    
    //查询一号通业务模式
    public SDKResult<OneNumberMode> queryOneNumberService(String oneNumber) throws SDKException
    {
        SDKResult<OneNumberMode> result = null;
        VoiceServiceOneNumberCapability voiceServiceOneNumberCapability = getDeviceManager().getDeviceServiceProxy(
                ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                VoiceServiceOneNumberCapability.class);
        result = voiceServiceOneNumberCapability.queryOneNumberService
            (getUserAccount(),  oneNumber);
        return result;
    }

    public String getUserAccount()
    {
        return userAccount;
    }

    public void setUserAccount(String userAccount)
    {
        this.userAccount = userAccount;
    }

} 
