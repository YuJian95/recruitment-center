package com.rc.model;

import java.util.Date;

public class RcApplication implements java.io.Serializable {
    private Integer appId;
    private RcJob job;
    private RcPerson person;
    private Date appPostTime;
    private String appResponse;
    private String appRspTime;

    public RcApplication(){

    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public RcJob getJob() {
        return job;
    }

    public void setJob(RcJob job) {
        this.job = job;
    }

    public RcPerson getPerson() {
        return person;
    }

    public void setPerson(RcPerson person) {
        this.person = person;
    }

    public Date getAppPostTime() {
        return appPostTime;
    }

    public void setAppPostTime(Date appPostTime) {
        this.appPostTime = appPostTime;
    }

    public String getAppResponse() {
        return appResponse;
    }

    public void setAppResponse(String appResponse) {
        this.appResponse = appResponse;
    }

    public String getAppRspTime() {
        return appRspTime;
    }

    public void setAppRspTime(String appRspTime) {
        this.appRspTime = appRspTime;
    }
}
