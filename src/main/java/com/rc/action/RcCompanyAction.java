package com.rc.action;

import com.rc.common.RcPageList;
import com.rc.iservice.IRcCompanyService;
import com.rc.model.RcCompany;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class RcCompanyAction {
    private final int PAGE_SIZE = 8;
    @Autowired
    private IRcCompanyService companyService;
    private Integer userId;
    private RcCompany company;
    private RcPageList<RcCompany> plist;
    private String userName;
    private String userPwd;
    private String comType;
    private String comName;
    private Integer pageNo;
    private String msg;

    public String add() throws Exception {
        companyService.addCompany(company);
        msg = "注册成功!<a href='/rc/index.jsp'>返回</a>";
        return "msg";
    }

    public String edit() throws Exception {
        companyService.editCompany(company);
        msg = "修改成功!<a href='/rc/company/index.jsp'>返回</a>";
        return "msg";
    }

    public String login() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        company = companyService.findCompany(userName, userPwd);
        if (company != null) {
            session.put("user", company);
            return "index";
        } else {
            msg = "登录失败!<a href='/rc/index.jsp'>返回</a>";
            return "msg";
        }
    }

    public void find(String url) throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        if (pageNo == null) {
            pageNo = 1;
            session.put("comType", comType);
            session.put("comName", comName);
        } else {
            comType = (String) session.get("comType");
            comName = (String) session.get("comName");
        }
        if (comType == null || comType.equals("所有")) {
            comType = "";
        }
        if (comName == null) {
            comName = "";
        }

        List<RcCompany> list = companyService.findCompanies(comType, comName, pageNo, PAGE_SIZE);
        int count = companyService.findCount(comType, comName);
        plist = new RcPageList<RcCompany>(list, count, PAGE_SIZE, pageNo, url);
    }

    public String manage() throws Exception {
        find("/rc/RcCompany!manage.action");
        return "manage";
    }

    public String browse() throws Exception {
        find("/rc/RcCompany!browse.action");
        return "browse";
    }

    public String delete() throws Exception {
        companyService.deleteCompany(userId);
        return "manageaction";
    }

    public String show() throws Exception {
        company = companyService.findCompanyById(userId);
        return "show";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public RcCompany getCompany() {
        return company;
    }

    public void setCompany(RcCompany company) {
        this.company = company;
    }

    public RcPageList<RcCompany> getPlist() {
        return plist;
    }

    public void setPlist(RcPageList<RcCompany> plist) {
        this.plist = plist;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
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

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
