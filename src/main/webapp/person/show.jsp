<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>查看人才信息</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css"/>
</head>
<body>
<table class="mytable2" align="center" cellspacing="0" cellpadding="2">
    <tr>
        <th>用户名</th>
        <td>${person.userName}</td>
        <td width="134" rowspan="8" style="border-left: 1px solid #0099cc">
            <img src="/rc/upfile/${person.perPic}" width="134" height="100%"/>
        </td>
    </tr>
    <tr>
        <th>真实姓名</th>
        <td>${person.perRealName}</td>
    </tr>
    <tr>
        <th>性别</th>
        <td>${person.perSex}</td>
    </tr>
    <tr>
        <th>出生日期</th>
        <td>{person.perBirthDate}</td>
    </tr>
    <tr>
        <th>户口所在地</th>
        <td>${person.perRegResidence}</td>
    </tr>
    <tr>
        <th>身份证号码</th>
        <td>${person.perIDCard}</td>
    </tr>
    <tr>
        <th>民族</th>
        <td>${person.perNature}</td>
    </tr>
    <tr>
        <th>婚姻状况</th>
        <td>${person.perMarried}</td>
    </tr>
    <tr>
        <th>教育程度</th>
        <td colspan="2">${person.perEducation}</td>
    </tr>
    <tr>
        <th>毕业学校</th>
        <td colspan="2">${person.perSchool}</td>
    </tr>
    <tr>
        <th>联系电话</th>
        <td colspan="2">${person.perTel}</td>
    </tr>
    <tr>
        <th>Email</th>
        <td>${person.perEmail}</td>
    </tr>
    <tr>
        <th>联系地址</th>
        <td>${person.perAddr}</td>
    <tr>
        <th>简历</th>
        <td colspan="2">${person.perResume}</td>
    </tr>
</table>
<p align="center">
    <input type="button" value="返回" onclick="window.history.back();">
</p>

</body>
</html>
