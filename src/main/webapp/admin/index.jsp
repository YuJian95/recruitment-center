<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>系统管理首页</title>
</head>
<body>

</body>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mytag" uri="/WEB-INF/mytag.tld" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>网上人才中心系统</title>
    <link rel="stylesheet" href="css/all.css">
</head>
<body>
<div id="container">
    <%@include file="../common/top.jsp" %>
    <div id="pagebody">
        <div id="left" style="text-align: center">
            <br/>
            <p>
                <b>系统管理</b>
            </p>
            <hr/>
            <p><a href="RcPersonAction.action!manage.action" target="content">用户管理</a></p>
            <p><a href="RcNewsAction.action!manage.action" target="content">新闻管理</a></p>
            <p><a href="RcCompanyAction.action!manage.action" target="content">公司管理</a></p>
            <p><a href="admin/edit.jsp" target="content">修改密码</a></p>
            <p><a href="index.jsp">退出管理</a></p>
        </div>
        <div id="right">
            <iframe id="content" name="content" frameborder="0" width="100%" height="100%"
                    src="/rc/RcHomeAction!home.action"></iframe>
        </div>
    </div>
    <%@include file="/common/bottom.jsp" %>
</div>
</body>
</html>

</html>
