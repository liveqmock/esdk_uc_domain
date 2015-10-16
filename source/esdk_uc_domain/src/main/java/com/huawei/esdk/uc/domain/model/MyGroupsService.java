package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfilePublicGroupCapability;
import com.huawei.esdk.uc.domain.model.bean.JoinGroupInfo;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.QueryModeInfo;

public class MyGroupsService
{
    private String ucAccount;
    
    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
    	    .getBean("deviceManager");
    
    public MyGroupsService(String ucAccount)
    {
        this.setUcAccount(ucAccount);
    }

    //查找某个用户的群组列表
    public SDKResult<PagedList<JoinGroupInfo>> queryJoinGroupByUC(QueryModeInfo queryModeInfo) throws SDKException
    {
        UserProfilePublicGroupCapability pgAbility = deviceManager.getDeviceServiceProxy(
        		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
            UserProfilePublicGroupCapability.class);
        return pgAbility.queryJoinGroupByUC(this.getUcAccount(),queryModeInfo);
    }
    
    public String getUcAccount()
    {
        return ucAccount;
    }


    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }

}
