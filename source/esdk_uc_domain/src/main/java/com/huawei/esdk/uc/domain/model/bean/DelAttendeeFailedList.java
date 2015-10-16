package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class DelAttendeeFailedList
{
    private List<DelAttendeeFailedInfo> attendeeFailedInfos;

    public List<DelAttendeeFailedInfo> getAttendeeFailedInfos()
    {
        return attendeeFailedInfos;
    }

    public void setAttendeeFailedInfos(List<DelAttendeeFailedInfo> attendeeFailedInfos)
    {
        this.attendeeFailedInfos = attendeeFailedInfos;
    }
}
