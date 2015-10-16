package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfilePublicGroupCapability;
import com.huawei.esdk.uc.domain.model.bean.GroupInfoBase;
import com.huawei.esdk.uc.domain.model.bean.LBSInfo;
import com.huawei.esdk.uc.domain.model.bean.PagedList;
import com.huawei.esdk.uc.domain.model.bean.QueryModeInfo;

public class QueryService
{
    // 查询方式
    private QueryModeInfo queryModeInfo;
    
    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
    	    .getBean("deviceManager");
    
    public QueryService()
    {
        
    }
    
    //群组列表查询
    public SDKResult<PagedList<GroupInfoBase>> queryGroupList(String groupNo, 
    		String groupName, QueryModeInfo modeInfo) throws SDKException
    {
    	UserProfilePublicGroupCapability pgAbility = deviceManager.getDeviceServiceProxy(
    			ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                UserProfilePublicGroupCapability.class);
        return pgAbility.queryGroupList(groupNo, groupName, modeInfo);
    }
    
    // 群组信息查询,为何返回List?
    public SDKResult<List<Group>> queryGroupInfo(String groupId, String groupCreater) throws SDKException
    {
    	UserProfilePublicGroupCapability pgAbility = deviceManager.getDeviceServiceProxy(
    			ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                UserProfilePublicGroupCapability.class);
        return pgAbility.queryGroupInfo(groupId, groupCreater);
    }
    
    // 查询物理位置
    public SDKResult<LBSInfo> queryLBSLocation(String sRouteNumber)
    {
        return null;
    }

    public QueryModeInfo getListInfo()
    {
        return queryModeInfo;
    }

    public void setListInfo(QueryModeInfo listInfo)
    {
        this.queryModeInfo = listInfo;
    }
}
