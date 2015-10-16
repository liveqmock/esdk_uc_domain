package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.uc.device.obg.ICTCCapability;
import com.huawei.esdk.uc.devices.v200r001c03.ctc.UCV2R1C03CTCCapability;

public class HoldingConference extends Conference
{    
    // 会议是否被锁定
    private boolean ifLocked;

    // 会议是否被静音
    private boolean ifMuted;
    
    public HoldingConference(String id)
    {
        super(id);
    }

    public HoldingConference()
    {
        super();
    }

    // 查询会场信息
    public SDKResult<HoldingConference> getConfInfo(String ucAccount)
            throws SDKException
    {
        ICTCCapability ctcCapability = getDeviceManager()
                .getDeviceServiceProxy(
                		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                        ICTCCapability.class);
        return ctcCapability.getConfInfo(ucAccount, this.getConfId());
    }

    // 查询会议与会成员
    public SDKErrorCode getConfMember(String ucAccount)
    {
        return null;
    }
    
    //选看会场 viewSite
    public SDKErrorCode viewTerminalSite(String ucAccount, String termianlUri) throws SDKException
    {
        UCV2R1C03CTCCapability ctcCapability = getDeviceManager()
            .getDeviceServiceProxy(
            		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                    UCV2R1C03CTCCapability.class);
        return ctcCapability.viewTerminalSite(getConfId(),ucAccount, termianlUri, isLocked() ? "1" : "0");
    }

    public boolean isLocked()
    {
        return ifLocked;
    }

    public void setLocked(boolean locked)
    {
        this.ifLocked = locked;
    }

    public boolean isMuted()
    {
        return ifMuted;
    }

    public void setMuted(boolean muted)
    {
        this.ifMuted = muted;
    }
}
