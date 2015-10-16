package com.huawei.esdk.uc.domain.model;

import java.util.Date;
import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfileFriendCapability;
import com.huawei.esdk.uc.devices.v200r001c03.userprofile.UCV2R1C03UserProfileFriendCapability;
import com.huawei.esdk.uc.domain.model.bean.FriendChangeInfo;
import com.huawei.esdk.uc.domain.model.bean.FriendInfo;

public class MyFriendsService
{
    // key：UC账号
    private String ucAccount;

    // 好友基本信息列表
    private List<FriendInfo> friendInfoBases;

    public MyFriendsService(String ucAccount)
    {
        this.setUcAccount(ucAccount);
    }

    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
            .getBean("deviceManager");

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }

    // 好友信息增量同步
    public SDKResult<List<FriendChangeInfo>> getPersonIncFriendList(Date date)
            throws SDKException
    {
        SDKResult<List<FriendChangeInfo>> result = null;
        UserProfileFriendCapability userProfileFriendCapability = getDeviceManager()
                .getDeviceServiceProxy(
                        ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        UserProfileFriendCapability.class);
        result = userProfileFriendCapability.getPersonIncFriendList(
                getUcAccount(), String.valueOf((date.getTime() / 1000)));
        return result;
    }

    // 好友信息查询
    public SDKResult<FriendInfo> getFriendInfo(int type, String friendAccount)
            throws SDKException
    {
        SDKResult<FriendInfo> result = null;
        UserProfileFriendCapability userProfileFriendCapability = getDeviceManager()
                .getDeviceServiceProxy(
                        ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        UserProfileFriendCapability.class);
        result = userProfileFriendCapability.getFriendInfo(getUcAccount(),
                type, friendAccount);
        return result;
    }

    // 添加好友
    public SDKErrorCode addFriend(String friendAccount) throws SDKException
    {
        SDKErrorCode result = null;
        UserProfileFriendCapability userProfileFriendCapability = getDeviceManager()
                .getDeviceServiceProxy(
                        ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        UserProfileFriendCapability.class);
        result = userProfileFriendCapability.addFriend(getUcAccount(),
                friendAccount);
        return result;
    }

    // 删除好友
    public SDKErrorCode delFriend(String friendAccount) throws SDKException
    {
        SDKErrorCode result = null;
        UserProfileFriendCapability userProfileFriendCapability = getDeviceManager()
                .getDeviceServiceProxy(
                        ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        UserProfileFriendCapability.class);
        result = userProfileFriendCapability.delFriend(getUcAccount(),
                friendAccount);
        return result;
    }

    // 好友列表
    public SDKResult<List<FriendInfo>> getFriendList() throws SDKException
    {
        SDKResult<List<FriendInfo>> result = null;
        UserProfileFriendCapability userProfileFriendCapability = getDeviceManager()
                .getDeviceServiceProxy(
                        ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        UserProfileFriendCapability.class);
        result = userProfileFriendCapability.getFriendList(getUcAccount());
        return result;
    }
    
    /**
     * addNewFriend
     */
    public SDKErrorCode addNewFriend(String groupId) throws SDKException {
        SDKErrorCode result = null;
        UCV2R1C03UserProfileFriendCapability userProfileFriendCapability = getDeviceManager()
                .getDeviceServiceProxy(
                        ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        UCV2R1C03UserProfileFriendCapability.class);
        
        FriendInfo friendInfo = friendInfoBases.get(0);

        result = userProfileFriendCapability.addNewFriend(ucAccount,friendInfo,friendInfo.getFriendAccount(),groupId);
        return result;
    }

    public String getUcAccount()
    {
        return ucAccount;
    }

    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }

    public List<FriendInfo> getFriendInfoBases()
    {
        return friendInfoBases;
    }

    public void setFriendInfoBases(List<FriendInfo> friendInfoBases)
    {
        this.friendInfoBases = friendInfoBases;
    }

}
