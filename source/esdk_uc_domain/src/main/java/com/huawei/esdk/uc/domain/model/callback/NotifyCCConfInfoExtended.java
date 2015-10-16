package com.huawei.esdk.uc.domain.model.callback;


public class NotifyCCConfInfoExtended
{
    private String eventId;
    private String sbj;
    private String start;
    private String end;
    private boolean locked;
    private boolean muted;
    private String confState;
    private String maxVoice;
    private String maxVoiceAccount;
    
    public String getEventId()
    {
        return eventId;
    }
    public void setEventId(String eventId)
    {
        this.eventId = eventId;
    }
    public String getSbj()
    {
        return sbj;
    }
    public void setSbj(String sbj)
    {
        this.sbj = sbj;
    }
    public String getStart()
    {
        return start;
    }
    public void setStart(String start)
    {
        this.start = start;
    }
    public String getEnd()
    {
        return end;
    }
    public void setEnd(String end)
    {
        this.end = end;
    }
    public boolean isLocked()
    {
        return locked;
    }
    public void setLocked(boolean locked)
    {
        this.locked = locked;
    }
    public boolean isMuted()
    {
        return muted;
    }
    public void setMuted(boolean muted)
    {
        this.muted = muted;
    }
    public String getConfState()
    {
        return confState;
    }
    public void setConfState(String confState)
    {
        this.confState = confState;
    }
    public String getMaxVoice()
    {
        return maxVoice;
    }
    public void setMaxVoice(String maxVoice)
    {
        this.maxVoice = maxVoice;
    }
    public String getMaxVoiceAccount()
    {
        return maxVoiceAccount;
    }
    public void setMaxVoiceAccount(String maxVoiceAccount)
    {
        this.maxVoiceAccount = maxVoiceAccount;
    }
    
}
