package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.bmu.IUserLevelCapability;
import com.huawei.esdk.uc.domain.model.bean.UserLevelInfo;

public class UserLevel
{
    private String count;
    
    private List<UserLevelInfo> userLevelInfos;
    
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        UserLevel.deviceManager = deviceManager;
    }
    
    /**
     *  查询用户等级
     * @param userId
     * @param sip
     * @return
     * @throws SDKException
     */
    public SDKResult<UserLevel> queryUserLevel(String userId, 
        String pageCount, String pageNum)
        throws SDKException
    {
        IUserLevelCapability userLevelCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IUserLevelCapability.class);
        SDKResult<UserLevel> result = userLevelCapability.queryUserLevel(userId, pageCount, pageNum);
        return result;
    }

    public String getCount()
    {
        return count;
    }

    public void setCount(String count)
    {
        this.count = count;
    }

    public List<UserLevelInfo> getUserLevelInfos()
    {
        return userLevelInfos;
    }

    public void setUserLevelInfos(List<UserLevelInfo> userLevelInfos)
    {
        this.userLevelInfos = userLevelInfos;
    }
    
    
}
