package com.rc.common;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.rc.model.RcUser;

import java.util.Map;

public class RcRightCheckInterceptor extends MethodFilterInterceptor {
    private Integer right;

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext ac = actionInvocation.getInvocationContext();
        Map session = actionInvocation.getInvocationContext().getSession();
        RcUser user = (RcUser) session.get("user");
        if (right != null && user != null && Integer.parseInt(user.getUserRole()) < right) {
            return actionInvocation.invoke();
        } else {
            ac.put("msg", "你没有登录或权限不够,无权访问!");
            return "msg";
        }
    }
}
