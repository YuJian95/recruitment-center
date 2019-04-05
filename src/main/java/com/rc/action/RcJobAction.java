package com.rc.action;

import com.rc.common.RcPageList;
import com.rc.iservice.IRcJobService;
import com.rc.model.RcCompany;
import com.rc.model.RcJob;
import com.rc.model.RcUser;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class RcJobAction {
    private final int PAGE_SIZE = 8;
    @Autowired
    private IRcJobService jobService;
    private Integer jobId;
    private RcJob job;
    private RcPageList<RcJob> plist;
    private Integer comId;
    private String jobType;
    private String jobTitle;
    private Integer pageNo;
    private String msg;

    public void find(Integer comId, String url) throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        if (pageNo == null) {
            pageNo = 1;
            session.put("jobType", jobType);
            session.put("jobTitle", jobTitle);
        } else {
            jobType = (String) session.get("jobType");
            jobTitle = (String) session.get("jobTitle");
        }
        if (jobType == null) {
            jobType = "";
        }
        if (jobTitle == null) {
            jobTitle = "";
        }

        List<RcJob> list = jobService.findJobs(comId, jobType, jobTitle, pageNo, PAGE_SIZE);
        int count = jobService.findCount(comId, jobType, jobTitle);
        plist = new RcPageList<RcJob>(list, count, PAGE_SIZE, pageNo, url);
    }

    public String manage() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        RcUser user = (RcUser) session.get("user");
        find(user.getUserId(), "/rc/RcJobAction!manage.action");
        return "manage";
    }

    public String browse() throws Exception {
        find(comId, "/rc/RcJobAction!browse.action");
        return "browse";
    }

    public String add() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        RcCompany com = (RcCompany) session.get("user");
        job.setCompany(com);
        jobService.addJob(job);
        return "manageaction";
    }

    public String willedit() throws Exception {
        job = jobService.findJobById(jobId);
        return "willedit";
    }

    public String edit() throws Exception {
        jobService.editJob(job);
        return "manageaction";
    }

    public String delete() throws Exception {
        jobService.deleteJob(jobId);
        return "manageaction";
    }

    public String show() throws Exception {
        job = jobService.findJobById(jobId);
        return "show";
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public RcJob getJob() {
        return job;
    }

    public void setJob(RcJob job) {
        this.job = job;
    }

    public RcPageList<RcJob> getPlist() {
        return plist;
    }

    public void setPlist(RcPageList<RcJob> plist) {
        this.plist = plist;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
