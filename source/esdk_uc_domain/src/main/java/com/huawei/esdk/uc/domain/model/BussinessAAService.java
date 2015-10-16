package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.client.IClientCommonCapability;

/**
 * * @author j00213891 * * 业务鉴权方式待定
 */
public class BussinessAAService
{
    private int otherLoginType;

    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
            .getBean("deviceManager");

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }

    // UC客户端登陆
    public SDKResult<Integer> userLogin(String ucAccount, String pw,
            String registerFunc, String deviceIP, String handleID)
            throws SDKException
    {
        IClientCommonCapability client = getDeviceManager()
                .getDeviceServiceProxy(
                		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        IClientCommonCapability.class);
        SDKResult<Integer> sdkResult = client.userLogin(ucAccount, pw,
                registerFunc, deviceIP, handleID);
        return sdkResult;
    }

    // UC客户端注销
    public SDKErrorCode userLogOut(String ucAccount) throws SDKException
    {
        IClientCommonCapability client = getDeviceManager()
                .getDeviceServiceProxy(
                		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        IClientCommonCapability.class);
        SDKErrorCode sdkErrorCode = client.userLogOut(ucAccount);
        return sdkErrorCode;
    }

    /** * @param otherLoginType the otherLoginType to set */
    public void setOtherLoginType(int otherLoginType)
    {
        this.otherLoginType = otherLoginType;
    }

    /** * @return the otherLoginType */
    public int getOtherLoginType()
    {
        return otherLoginType;
    }

}
