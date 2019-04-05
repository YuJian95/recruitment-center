package com.rc.model;

import java.util.Date;

public class RcJob {
    private Integer jobId;
    private RcCompany company;
    private String jobTitle;
    private String jobType;
    private String jobEducation;
    private String jobSex;
    private String jobAge;
    private String jobWorkTime;
    private Integer jobNum;
    private String jobComment;
    private String comEmail;
    private String comDesc;
    private String jobWorkPlace;
    private Date comPostTime;
    private Date jobEndTime;


    public RcJob(){

    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public RcCompany getCompany() {
        return company;
    }

    public void setCompany(RcCompany company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobEducation() {
        return jobEducation;
    }

    public void setJobEducation(String jobEducation) {
        this.jobEducation = jobEducation;
    }

    public String getJobSex() {
        return jobSex;
    }

    public void setJobSex(String jobSex) {
        this.jobSex = jobSex;
    }

    public String getJobAge() {
        return jobAge;
    }

    public void setJobAge(String jobAge) {
        this.jobAge = jobAge;
    }

    public String getJobWorkTime() {
        return jobWorkTime;
    }

    public void setJobWorkTime(String jobWorkTime) {
        this.jobWorkTime = jobWorkTime;
    }

    public Integer getJobNum() {
        return jobNum;
    }

    public void setJobNum(Integer jobNum) {
        this.jobNum = jobNum;
    }

    public String getJobComment() {
        return jobComment;
    }

    public void setJobComment(String jobComment) {
        this.jobComment = jobComment;
    }

    public String getComEmail() {
        return comEmail;
    }

    public void setComEmail(String comEmail) {
        this.comEmail = comEmail;
    }

    public String getComDesc() {
        return comDesc;
    }

    public void setComDesc(String comDesc) {
        this.comDesc = comDesc;
    }

    public String getJobWorkPlace() {
        return jobWorkPlace;
    }

    public void setJobWorkPlace(String jobWorkPlace) {
        this.jobWorkPlace = jobWorkPlace;
    }

    public Date getComPostTime() {
        return comPostTime;
    }

    public void setComPostTime(Date comPostTime) {
        this.comPostTime = comPostTime;
    }

    public Date getJobEndTime() {
        return jobEndTime;
    }

    public void setJobEndTime(Date jobEndTime) {
        this.jobEndTime = jobEndTime;
    }
}
