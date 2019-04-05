package com.rc.tag;


import com.rc.model.RcUser;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class RcUserStateTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        HttpSession session = this.pageContext.getSession();
        RcUser user = (RcUser) session.getAttribute("user");
        StringBuilder stringBuilder = new StringBuilder();
        if (user == null) {
            stringBuilder.append("<form name=\"form1\" method=\"POST\" action=\"/rc/RcPersonAction!login.action\">");
            stringBuilder.append("<p>用户名： <input type=\"text\" name=\"userName\" size=\"12\" value></p>");
            stringBuilder.append("<p>密&nbsp;码:<input type=\"password\" name=\"userPwd\" size=\"12\" value></p>");
            stringBuilder.append("<p>用户类型:<select size=\"1\" id=\"userType\" onchange=\"this.form.action='/rc/Rc'+this.options[this.selectedIndex].value+'Action!login.action'\">");
            stringBuilder.append("<option selected value=\"Person\">个人</option>");
            stringBuilder.append("<option selected value=\"Company\">企业</option>");
            stringBuilder.append("<option selected value=\"Admin\">管理员</option>");
            stringBuilder.append("</select></p>");
            stringBuilder.append("<p><a href=\"JavaScript:document.form1.submit()\">登录</a>&nbsp;<a href=\"JavaScript:document.location.href='/rc/'+document.getElementById('userType').value.toLowerCase()+'/add.jsp'\">注册</a></p>");
        } else {
            stringBuilder.append("<br/><p>欢迎").append(user.getUserName()).append("进入</p>");
            stringBuilder.append("<p>你是").append(user.getUserRole()).append("用户</p>");
            stringBuilder.append("<p><a href\"/rc/common/logout.jsp\"/>注销</a>&nbsp;<a href=\"/rc/").append(user.getUserRole()).append("/index.jsp\">").append(user.getRoleName()).append("管理</a>");
            try {
                this.pageContext.getOut().print(stringBuilder.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.doStartTag();
    }
}
