package com.rc.common;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class RcTransactionInterceptor extends AbstractInterceptor {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext as = actionInvocation.getInvocationContext();
//        try {
//            RcHibernateHelper.
//        }
        return null;
    }
}
