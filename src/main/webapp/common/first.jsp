<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css">
    <style type="text/css">
        .title {
            width: 98%;
            height: 20px;
            margin: 0px auto;
            background-color: #CEE7FF;
            line-height: 20px;
            text-align: left;
            font-weight: bold;
        }
    </style>
</head>
<body style="margin: 0px">
<br/>
<div class="title">最新加入招聘信息</div>
<table class="mytable1" cellspacing="0" cellpadding="2" style="margin-top: 0px;">
    <tr>
        <th style="border-left-width: 0px">职位名称</th>
        <th>职位类别</th>
        <th>要求</th>
    </tr>
    <c:forEach items="${jobs}" var="b">
        <tr>
            <td style="border-left-width: 0px">${b.jobTitle}</td>
            <td>${b.jobType}</td>
            <td>学历:${b.jobEducation};性别:${b.jobSex};年龄:${b.jobAge};工作年限:${b.jobWorkTime}</td>
        </tr>
    </c:forEach>
</table>
<div class="title">最新加入人才信息</div>
<table class="mytable1" cellspacing="0" cellpadding="2" style="margin-top: 0px;">
    <tr>
        <th style="border-left-width: 0px;">姓名</th>
        <th>性别</th>
        <th>求职意向</th>
    </tr>
    <c:forEach items="${person}" var="p">
        <tr>
            <td style="border-left-width: 0px">${p.perRealName}</td>
            <td>${p.perSex}</td>
            <td>${p.perJobTarget}</td>
        </tr>
    </c:forEach>
</table>
<div class="title">最新加入企业信息</div>
<table class="mytable1" cellspacing="0" cellpadding="2" style="margin-top: 0px;">
    <tr>
        <th style="border-left-width: 0px">企业名称</th>
        <th>类型</th>
        <th>网站</th>
    </tr>
    <c:forEach items="${companies}" var="c">
        <tr>
            <td style="border-left-width: 0px">${c.comName}</td>
            <td>${c.comType}</td>
            <td>${c.comHomepage}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
