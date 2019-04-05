<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/4
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改职位</title>
    <link rel="stylesheet" href="../css/all.css">
</head>
<body>
<br/>
<table class="mytablel" align="center" cellpadding="4" cellspacing="0">
    <tr>
        <th>职位名称</th>
        <td>${job.jobTitle}"</td>
    </tr>
    <tr>
        <th>职业类别</th>
        <td>${job.jobType}</td>
    </tr>
    <tr>
        <th>学历要求</th>
        <td>${job.jobEducation}</td>
    </tr>
    <tr>
        <th>性别要求</th>
        <td>${job.jobSex}</td>
    </tr>
    <tr>
        <th>年龄要求</th>
        <td>${job.jobAge}</td>
    </tr>
    <tr>
        <th>工作年限</th>
        <td><${job.jobWorkTime}</td>
    </tr>
    <tr>
        <th>招聘人数</th>
        <td>${job.jobNum}</td>
    </tr>
    <tr>
        <th>工作地区</th>
        <td>${job.jobWorkPlace}</td>
    </tr>
    <tr>
        <th>截止时间</th>
        <td>${job.jobEndTime}</td>
    </tr>
    <tr>
        <th>具体要求</th>
        <td>${job.jobComment}</td>
    </tr>
</table>
<p align="center">
    <input type="button" value="返回" onclick="window.history.back();">
</p>

</body>
</html>
