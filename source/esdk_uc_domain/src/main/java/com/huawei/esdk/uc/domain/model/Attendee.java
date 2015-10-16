package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.bmu.IAttendeeCapability;
import com.huawei.esdk.uc.domain.model.bean.DelAttendeeFailedList;
import com.huawei.esdk.uc.domain.model.bean.DelAttendeeInfoList;
import com.huawei.esdk.uc.domain.model.bean.QueryAttendeeInfoList;

public class Attendee
{
    
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    /**
     * 操作用户
     */
    private String userId;
    
    /**
     * 网关IP
     */
    private String gwIp;
    
    /**
     * 虚拟PBX ID
     */
    private String subPbx;
    
    /**
     * 会议厅号
     */
//    private String confNo;
    
    /**
     * 会议ID
     */
    private String confId;
    
    /**
     * 用户姓名或账号
     */
    private String account;
    
    /**
     * 与会人号码
     */
    private String attNumber;
    
    /**
     * 与会者类型: 0可听，可说   1只听，不说   2只说，不听 3主席
     */
    private String attType;
    
    /**
     * 与会者状态： 0离会    1等待    2连接中    3已进入
     */
    private String attStatus;
    
    /**
     * 麦克风，话筒状态
     */
    private String speakStatus;
    
    /**
     * 邮箱
     */
    private String email;
    
    /**
     * 旧主席
     */
    private String oldChairman;
    
    /**
     * 新主席
     */
    private String newChairman;
    
    /**
     * 操作与会者类型: 0:踢出，1:邀请 
     */
    private String operate;
    
    /**
     * 操作人号码
     */
    private String operNumber;
    
    public Attendee()
    {
    }
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        Attendee.deviceManager = deviceManager;
    }
    
    /** 
    * 添加与会者
    * 
    * @param attendee 与会者信息
    * @return SDKResult SDK结果对象
    * @throws SDKException SDK系统异常
    * @see [类、类#方法、类#成员]
    */
    public SDKResult<String> addAttendee(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAttendeeCapability.class);
        return attendeeCapability.addAttendee(attendee);
    }
    
    /** 
     * 修改与会者
     * 
     * @param attendee 与会者信息
     * @return SDKResult SDK结果对象
     * @throws SDKException SDK系统异常
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<String> modifyAttendee(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAttendeeCapability.class);
        return attendeeCapability.modifyAttendee(attendee);
    }
    
    
    /** 
     * 查询与会者列表
     * 
     * @param userId 操作用户
     * @param gwIp 网关IP
     * @param confId 会议ID
     * @param pageCount 分页大小
     * @param pageNum 当前页数
     * @return SDKResult<QueryAttendeeInfoList> 与会者列表
     * @throws SDKException SDK系统异常
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<QueryAttendeeInfoList> queryAttendee(String userId, String gwIp, String confId, int pageCount,
        int pageNum)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAttendeeCapability.class);
        return attendeeCapability.queryAttendee(userId, gwIp, confId, pageCount, pageNum);
    }
    
    /** 
     * 删除与会者列表
     * 
     * @param attendeeInfoList 需要删除的与会者列表
     * @return SDKResult<DelAttendeeFailedList> 删除结果，包括删除失败的与会者列表
     * @throws SDKException SDK系统异常
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<DelAttendeeFailedList> deleteAttendee(DelAttendeeInfoList attendeeInfoList)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAttendeeCapability.class);
        return attendeeCapability.deleteAttendee(attendeeInfoList);
    }
    
    /** 
     * 操作与会人
     * 
     * @param attendee 与会人信息
     * @return SDKErrorCode 操作结果
     * @throws SDKException SDK系统异常
     * @see [类、类#方法、类#成员]
     */
    public SDKErrorCode operateAttendee(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAttendeeCapability.class);
        
        return attendeeCapability.operateAttendee(attendee);
    }
    
    /** 
     * 主席权限转移
     * 
     * @param attendee 与会人信息
     * @return SDKErrorCode 操作结果
     * @throws SDKException SDK系统异常
     * @see [类、类#方法、类#成员]
     */
    public SDKErrorCode transferChairman(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAttendeeCapability.class);
        
        return attendeeCapability.transferChairman(attendee);
    }
    
    public String getUserId()
    {
        return userId;
    }
    
    public void setUserId(String userId)
    {
        this.userId = userId;
    }
    
    public String getGwIp()
    {
        return gwIp;
    }
    
    public void setGwIp(String gwIp)
    {
        this.gwIp = gwIp;
    }
    
//    public String getConfNo()
//    {
//        return confNo;
//    }
//    
//    public void setConfNo(String confNo)
//    {
//        this.confNo = confNo;
//    }
    
    public String getAccount()
    {
        return account;
    }
    
    public void setAccount(String account)
    {
        this.account = account;
    }
    
    public String getAttNumber()
    {
        return attNumber;
    }
    
    public void setAttNumber(String attNumber)
    {
        this.attNumber = attNumber;
    }
    
    public String getAttType()
    {
        return attType;
    }
    
    public void setAttType(String attType)
    {
        this.attType = attType;
    }
    
    public String getAttStatus()
    {
        return attStatus;
    }
    
    public void setAttStatus(String attStatus)
    {
        this.attStatus = attStatus;
    }
    
    public String getSpeakStatus()
    {
        return speakStatus;
    }
    
    public void setSpeakStatus(String speakStatus)
    {
        this.speakStatus = speakStatus;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getSubPbx()
    {
        return subPbx;
    }
    
    public void setSubPbx(String subPbx)
    {
        this.subPbx = subPbx;
    }
    
    public String getOldChairman()
    {
        return oldChairman;
    }
    
    public void setOldChairman(String oldChairman)
    {
        this.oldChairman = oldChairman;
    }
    
    public String getNewChairman()
    {
        return newChairman;
    }
    
    public void setNewChairman(String newChairman)
    {
        this.newChairman = newChairman;
    }
    
    public String getOperate()
    {
        return operate;
    }
    
    public void setOperate(String operate)
    {
        this.operate = operate;
    }
    
    public String getOperNumber()
    {
        return operNumber;
    }
    
    public void setOperNumber(String operNumber)
    {
        this.operNumber = operNumber;
    }

    public String getConfId()
    {
        return confId;
    }

    public void setConfId(String confId)
    {
        this.confId = confId;
    }
    
}
