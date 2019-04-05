package com.rc.model;

public class RcCompany extends RcUser implements java.io.Serializable {
    private String comType;  // 企业类型
    private String comName;  // 企业名称
    private String comCreateTime; // 创办时间
    private String comContactor;  // 联系人
    private String comEmpNum;  // 员工数
    private String comTel;  // 电话
    private String comFax;  //传真
    private String comAddr;  // 地址
    private String comZip;  // 邮编
    private String comHomepage;  // 企业主页
    private String comEmail;  // 邮箱
    private String comDesc;  // 简介
    private String comPostTime;  // 注册时间

    public RcCompany(){

    }

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComCreateTime() {
        return comCreateTime;
    }

    public void setComCreateTime(String comCreateTime) {
        this.comCreateTime = comCreateTime;
    }

    public String getComContactor() {
        return comContactor;
    }

    public void setComContactor(String comContactor) {
        this.comContactor = comContactor;
    }

    public String getComEmpNum() {
        return comEmpNum;
    }

    public void setComEmpNum(String comEmpNum) {
        this.comEmpNum = comEmpNum;
    }

    public String getComTel() {
        return comTel;
    }

    public void setComTel(String comTel) {
        this.comTel = comTel;
    }

    public String getComFax() {
        return comFax;
    }

    public void setComFax(String comFax) {
        this.comFax = comFax;
    }

    public String getComAddr() {
        return comAddr;
    }

    public void setComAddr(String comAddr) {
        this.comAddr = comAddr;
    }

    public String getComZip() {
        return comZip;
    }

    public void setComZip(String comZip) {
        this.comZip = comZip;
    }

    public String getComHomepage() {
        return comHomepage;
    }

    public void setComHomepage(String comHomepage) {
        this.comHomepage = comHomepage;
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

    public String getComPostTime() {
        return comPostTime;
    }

    public void setComPostTime(String comPostTime) {
        this.comPostTime = comPostTime;
    }
}
