<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>职位管理</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css">
</head>
<body>
<br/>
<form method="post" action="/rc/RcJobAction!manage.action">
    职位名称:<input type="text" name="jobTitle" size="30" value="${jobTitle}"/>
    <input type="submit" value="查询"/>
</form>
<table class="mytablel" align="center" cellspacing="4" cellpadding="0">
    <tr>
        <th style="border-left-width: 0px">职位名称</th>
        <th width="80">招聘人数</th>
        <th width="80">发布时间</th>
        <th width="80">操作</th>
    </tr>
    <c:forEach items="${plist.list}" var="n">
        <tr>
            <td style="text-align: left;border-left-width: 0px"><a
                    href="/rc/RcJobAction!show.action?jobId=${n.jobId}">${n.jobTitle}</a></td>
            <td align="center">${n.jobNum}</td>
            <td align="center"><fmt:formatDate pattern="yyyy-MM-dd" value="${n.jobPostTime}" type="both"/></td>
            <td align="center">
                <a href="/rc/RcJobAction!willedit.action?jobId=${n.jobId}">修改</a>
                <a href="/rc/RcJobAction!delete.action?jobId=${n.jobId}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<center>
    ${plist.pageBar}&nbsp;<a href="add.jsp">添加</a>
</center>
</body>
</html>
