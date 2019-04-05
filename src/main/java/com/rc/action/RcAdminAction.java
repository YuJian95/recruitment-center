package com.rc.action;

import com.rc.iservice.IRcAdminService;
import com.rc.model.RcAdmin;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class RcAdminAction {
    @Autowired
    private IRcAdminService adminService;

    private String userId;
    private RcAdmin admin;
    private String userName;
    private String userPwd;
    private String msg;

    public String login() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        admin = adminService.findAdmin(userName, userPwd);
        if (admin != null) {
            session.put("user", admin);
            return "index";
        }

        msg = "登录失败!<a href='/rc/index.jsp'>返回</a>";
        return "msg";
    }

    public String edit() throws Exception {
        Map session = ServletActionContext.getContext().getSession();
        RcAdmin admin1 = (RcAdmin) session.get("user");
        if (admin1.getUserPwd().equals(userPwd)) {
            admin1.setUserPwd(admin.getUserPwd());
            adminService.editAdmin(admin1);
            msg = "修改成功!<a href='/rc/admin/index.jsp'>返回首页</a>";
        } else {
            msg = "原密码错误!<a href='JavaScript:window.history.back()'>返回</a>";
        }
        return "msg";
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RcAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(RcAdmin admin) {
        this.admin = admin;
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
