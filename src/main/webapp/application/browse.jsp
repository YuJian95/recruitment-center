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
    <title>浏览申请</title>
    <link rel="stylesheet" href="/rc/css/all.css" type="text/css">
</head>
<body>
<table class="mytablel" align="center" cellpadding="4" cellspacing="0">
    <tr>
        <th style="border-left-width: 0px">工作名称</th>
        <th width="160">企业名称</th>
        <th width="80">联系人</th>
        <th width="80">电话</th>
        <th width="80">申请时间</th>
        <th width="80">回复情况</th>
        <th width="80">操作</th>
    </tr>
    <c:forEach items="${plist.list}" var="n">
        <tr>
            <td style="text-align: left;border-left-width: 0px;">
                <a href="/rc/RcJobAction!show.action?jobId=${n.job.jobId}">${n.job.jobTitle}</a>
            </td>
            <td>${n.job.company.comName}</td>
            <td>${n.job.company.comContactor}</td>
            <td>${n.job.company.comTel}</td>
            <td>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${n.appPostTime}" type="both"/>
            </td>
            <td>
                <c:choose>
                    <c:when test="${n.appResponse==null}">
                        未回复
                    </c:when>
                    <c:otherwise>
                        已回复
                    </c:otherwise>
                </c:choose>
            </td>
            <td align="center">
                <c:choose>
                    <c:when test="${n.appResponse!=null}">
                        <a href="JavaScript:alert('${n.appResponse}');">查看回复</a>
                    </c:when>
                    <c:otherwise>
                        <a href="/rc/RcApplication!delete.action?appId=${n.appId}">取消申请</a>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
</table>
<center>${plist.pageBar}</center>
</body>
</html>
