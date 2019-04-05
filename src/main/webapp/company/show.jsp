<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  com: max
  Date: 2019/4/2
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>企业信息</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css"/>
</head>
<body>
<table class="mytable2" align="center" cellspacing="0" cellpadding="2">
    <tr>
        <th>用户名</th>
        <td>${company.userName}</td>
    </tr>
    <tr>
        <th>公司名称</th>
        <td>${company.comName}</td>
    </tr>
    <tr>
        <th>公司类型</th>
        <td>${company.comType}</td>
    </tr>

    <tr>
        <th>创办时间</th>
        <td>${company.comCreateTime}</td>
    </tr>
    <tr>
        <th>联系人</th>
        <td>${company.comContactor}</td>
    </tr>
    <tr>
        <th>员工人数</th>
        <td>${company.comEmpNum}</td>
    </tr>

    <tr>
        <th>电话</th>
        <td>${company.comTel}</td>
    </tr>
    <tr>
        <th>传真</th>
        <td>${company.comFex}</td>
    </tr>
    <tr>
        <th>地址</th>
        <td>${company.comAddr}</td>
    </tr>

    <tr>
        <th>邮编</th>
        <td>${company.comZip}</td>
    </tr>
    <tr>
        <th>公司主页</th>
        <td>${company.comHomepage}"</td>
    </tr>
    <tr>
        <th>Email</th>
        <td>${company.comEmail}</td>
    </tr>
    <tr>
        <th>简介</th>
        <td>${company.comDesc}</td>
    </tr>
</table>
<p align="center">
    <input type="button" value="返回" onclick="window.history.back();">
</p>

</body>
</html>
