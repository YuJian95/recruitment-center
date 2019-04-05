package com.rc.action;

import com.rc.common.RcPageList;
import com.rc.iservice.IRcPersonService;
import com.rc.model.RcPerson;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

public class RcPersonAction {
    private final int PAGE_SIZE = 8;
    private final String PATH = "D:\\rc\\src\\main\\webapp\\upfiles";
    @Autowired
    private IRcPersonService personService;
    private Integer userId;
    private RcPerson person;
    private RcPageList<RcPerson> plist;
    private String perJobTarget;
    private String userName;
    private String userPwd;
    private File upload;
    private Integer pageNo;
    private String msg;

    public String add() throws Exception {
        FileInputStream in = new FileInputStream(upload);
        String filename = (new java.util.Date()).getTime() + ".jpg";
        File file = new File(PATH + File.separator + filename);
        FileOutputStream out = new FileOutputStream(file);
        byte[] b = new byte[1024];
        int n;
        while ((n = in.read(b, 0, 1024)) > 0) {
            out.write(b, 0, n);
        }
        out.flush();
        in.close();
        out.close();
        person.setPerPic(filename);
        personService.addPerson(person);
        msg = "注册成功!<a href='/rc/index.jsp'>返回</a>";
        return "msg";
    }

    public String edit() throws Exception {
        personService.editPerson(person);
        msg = "修改成功!<a href='/rc/person/index.jsp'>返回</a>";
        return "msg";
    }

    public String login() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        person = personService.findPerson(userName, userPwd);
        if (person != null) {
            session.put("user", person);
            return "index";
        } else {
            msg = "登录失败!<a href='/rc/index.jsp'>返回</a>";
            return "msg";
        }
    }

    private void find(String url) throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        if (pageNo == null) {
            pageNo = 1;
            session.put("perJobTarget", perJobTarget);
        } else {
            perJobTarget = (String) session.get("perJobTarget");
        }

        if (perJobTarget == null) {
            perJobTarget = "";
        }

        List<RcPerson> list = personService.findPersons(perJobTarget, pageNo, PAGE_SIZE);
        int count = personService.findCount(perJobTarget);
        plist = new RcPageList<RcPerson>(list, count, pageNo, PAGE_SIZE, url);
    }

    public String manage() throws Exception {
        find("/rc/RcPersonAction!manage.action");
        return "manage";
    }

    public String browse() throws Exception {
        find("/rc/RcPersonAction!browse.action");
        return "browse";
    }

    public String delete() throws Exception {
        personService.deletePerson(userId);
        return "manageaction";
    }

    public String show() throws Exception {
        person = personService.findPersonById(userId);
        return "show";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public RcPerson getPerson() {
        return person;
    }

    public void setPerson(RcPerson person) {
        this.person = person;
    }

    public RcPageList<RcPerson> getPlist() {
        return plist;
    }

    public void setPlist(RcPageList<RcPerson> plist) {
        this.plist = plist;
    }

    public String getPerJobTarget() {
        return perJobTarget;
    }

    public void setPerJobTarget(String perJobTarget) {
        this.perJobTarget = perJobTarget;
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

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
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
