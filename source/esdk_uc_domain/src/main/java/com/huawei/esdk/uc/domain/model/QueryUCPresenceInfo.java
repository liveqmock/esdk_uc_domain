package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfilePSSvrCapability;
import com.huawei.esdk.uc.domain.model.bean.UCPresInfo;
import com.huawei.esdk.uc.domain.model.bean.UCPresQryResult;

public class QueryUCPresenceInfo extends QueryService
{
    private UCPresQryResult queryResult;

    private List<UCPresInfo> ucPresInfos;
    
    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
        .getBean("deviceManager");

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    // 查询UC用户状态
    public SDKResult<List<QueryUCPresenceInfo>> queryUCPresence(
            List<String> presentitys) throws SDKException
    {
        SDKResult<List<QueryUCPresenceInfo>> result = null;
        UserProfilePSSvrCapability userProfileFriendCapability = getDeviceManager().getDeviceServiceProxy(
        		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                UserProfilePSSvrCapability.class);
        result = userProfileFriendCapability.queryUCPresence(presentitys);
        return result;
    }

    public UCPresQryResult getQueryResult()
    {
        return queryResult;
    }

    public void setQueryResult(UCPresQryResult queryResult)
    {
        this.queryResult = queryResult;
    }

    public List<UCPresInfo> getUcPresInfos()
    {
        return ucPresInfos;
    }

    public void setUcPresInfos(List<UCPresInfo> ucPresInfos)
    {
        this.ucPresInfos = ucPresInfos;
    }
}
