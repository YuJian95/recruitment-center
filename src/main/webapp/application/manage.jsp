<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>应聘管理页</title>
    <link rel="stylesheet" href="../css/all.css">
</head>
<body>
<table class="mytablel" align="center" cellpadding="4" cellspacing="0">
    <tr>
        <th style="border-left-width: 0px">工作名称</th>
        <th width="80">申请人</th>
        <th width="80">电话</th>
        <th width="80">邮件</th>
        <th width="80">申请时间</th>
        <th width="80">回复情况</th>
        <th width="80">操作</th>
    </tr>
    <c:forEach items="${plist.list}" var="n">
        <tr>
            <td style="text-align: left;border-left-width: 0px">${n.job.jobTitle}</td>
            <td>
                <a href="/rc/RcPersonAction!show.action?userId=${n.person.userId}">${n.person.userName}</a>
            </td>
            <td>${n.person.perTel}</td>
            <td>${n.person.perEmail}</td>
            <td>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${n.appPostTime}" type="both"/>
            </td>
            <td>
                <c:choose>
                    <c:when test="${n.appResponse==null}">
                        <a href="return.jsp?appId=${n.appId}">回复</a>
                    </c:when>
                    <c:otherwise>
                        <a href="JavaScript:alert('${n.appResponse}');">查看回复</a>
                    </c:otherwise>
                </c:choose>
            </td>
            <td align="center">
                <a href="/rc/RcApplicationAction!delete.action?appId=${n.appId}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<center>${plist.pageBar}</center>
</body>
</html>
