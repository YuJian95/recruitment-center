package com.rc.action;

import com.rc.common.RcPageList;
import com.rc.iservice.IRcApplicationService;
import com.rc.model.RcApplication;
import com.rc.model.RcJob;
import com.rc.model.RcPerson;
import com.rc.model.RcUser;
import com.rc.service.RcPersonService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class RcApplicationAction {
    private final int PAGE_SIZE = 8;
    @Autowired
    private IRcApplicationService applicationService;
    private Integer appId;
    private RcApplication app;
    private RcPageList<RcApplication> plist;
    private RcJob job;
    private Integer pageNo;
    private String msg;

    public String add() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        RcPerson person = (RcPerson) session.get("user");
        app = new RcApplication();
        app.setJob(job);
        app.setPerson(person);
        applicationService.addApplication(app);
        msg = "申请成功!<a href=\"/rc/RcApplicationAction!browse.action\">查看已申请的工作列表</a>";
        return "msg";
    }

    private String find(Integer comId, Integer perId, String url) throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        RcUser user = (RcUser) session.get("user");
        if (pageNo == null) {
            pageNo = 1;
        }
        List<RcApplication> list = applicationService.findApplications(comId, perId, pageNo, PAGE_SIZE);
        int count = applicationService.findCount(comId, perId);
        plist = new RcPageList<>(list, count, PAGE_SIZE, pageNo, url);
        return "manage";
    }

    public String manage() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        RcUser user = (RcUser) session.get("user");
        find(user.getUserId(), null, "/rc/RcApplication!manage.action");
        return "manage";
    }

    public String browse() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        RcUser user = (RcUser) session.get("user");
        find(null, user.getUserId(), "/rc/RcApplication!browse.action");
        return "browse";
    }

    public String edit() throws Exception {
        RcApplication app1 = applicationService.findApplicationById(app.getAppId());
        app1.setAppResponse(app.getAppResponse());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd hh:mm:ss");
        app1.setAppRspTime(sdf.format(new Date()));
        applicationService.editApplication(app1);
        return "manageaction";
    }

    public String delete() throws Exception {
        applicationService.deleteApplication(appId);
        return "browseaction";
    }

    public String delete1() throws Exception {
        applicationService.deleteApplication(appId);
        return "manageaction";
    }

    public String show() throws Exception {
        app = applicationService.findApplicationById(appId);
        return "show";
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public RcApplication getApp() {
        return app;
    }

    public void setApp(RcApplication app) {
        this.app = app;
    }

    public RcPageList<RcApplication> getPlist() {
        return plist;
    }

    public void setPlist(RcPageList<RcApplication> plist) {
        this.plist = plist;
    }

    public RcJob getJob() {
        return job;
    }

    public void setJob(RcJob job) {
        this.job = job;
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
