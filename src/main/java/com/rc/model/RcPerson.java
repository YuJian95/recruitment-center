package com.rc.model;

import java.util.Date;

public class RcPerson extends RcUser implements java.io.Serializable {
    private String perRealName;
    private String perSex;
    private String perBirthDate;
    private String perIDCard;
    private String perNature;
    private String perMarried;
    private String perRegResidence;
    private String perEducation;
    private String perSchool;
    private String perTel;
    private String perEmail;
    private String perAddr;
    private String perPic;
    private Date perPostTime;
    private String perResume;
    private String perJobTarget;
    public RcPerson() {

    }

    public String getPerRealName() {
        return perRealName;
    }

    public void setPerRealName(String perRealName) {
        this.perRealName = perRealName;
    }

    public String getPerSex() {
        return perSex;
    }

    public void setPerSex(String perSex) {
        this.perSex = perSex;
    }

    public String getPerBirthDate() {
        return perBirthDate;
    }

    public void setPerBirthDate(String perBirthDate) {
        this.perBirthDate = perBirthDate;
    }

    public String getPerIDCard() {
        return perIDCard;
    }

    public void setPerIDCard(String perIDCard) {
        this.perIDCard = perIDCard;
    }

    public String getPerNature() {
        return perNature;
    }

    public void setPerNature(String perNature) {
        this.perNature = perNature;
    }

    public String getPerMarried() {
        return perMarried;
    }

    public void setPerMarried(String perMarried) {
        this.perMarried = perMarried;
    }

    public String getPerRegResidence() {
        return perRegResidence;
    }

    public void setPerRegResidence(String perRegResidence) {
        this.perRegResidence = perRegResidence;
    }

    public String getPerEducation() {
        return perEducation;
    }

    public void setPerEducation(String perEducation) {
        this.perEducation = perEducation;
    }

    public String getPerSchool() {
        return perSchool;
    }

    public void setPerSchool(String perSchool) {
        this.perSchool = perSchool;
    }

    public String getPerTel() {
        return perTel;
    }

    public void setPerTel(String perTel) {
        this.perTel = perTel;
    }

    public String getPerEmail() {
        return perEmail;
    }

    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail;
    }

    public String getPerAddr() {
        return perAddr;
    }

    public void setPerAddr(String perAddr) {
        this.perAddr = perAddr;
    }

    public String getPerPic() {
        return perPic;
    }

    public void setPerPic(String perPic) {
        this.perPic = perPic;
    }

    public Date getPerPostTime() {
        return perPostTime;
    }

    public void setPerPostTime(Date perPostTime) {
        this.perPostTime = perPostTime;
    }

    public String getPerResume() {
        return perResume;
    }

    public void setPerResume(String perResume) {
        this.perResume = perResume;
    }

    public String getPerJobTarget() {
        return perJobTarget;
    }

    public void setPerJobTarget(String perJobTarget) {
        this.perJobTarget = perJobTarget;
    }
}
