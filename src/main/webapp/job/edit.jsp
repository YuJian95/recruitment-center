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
<form method="post" action="/rc/RcJobAction!edit.action" target="content">
    <input type="hidden" name="job.jobId" value="${job.jobId}"/>
    <table class="mytablel" align="center" cellpadding="4" cellspacing="0">
        <tr>
            <th>职位名称</th>
            <td><input type="text" name="job.jobTitle" value="${job.jobTitle}"></td>
        </tr>
        <tr>
            <th>职业类别</th>
            <td><s:select list="{'会计','金融','计算机'}" name="job.jobType" value="#session.job.jobType"/></td>
        </tr>
        <tr>
            <th>学历要求</th>
            <td><s:select list="{'无要求','本科','大专','硕士','博士','高中','中职'}" name="job.jobEducation"
                          value="#session.job.jobType"/>
            </td>
        </tr>
        <tr>
            <th>性别要求</th>
            <td><s:select list="{'无要求','男','女'}" name="job.jobSex" value="#session.job.jobSex"/>
            </td>
        </tr>
        <tr>
            <th>年龄要求</th>
            <td><s:select list="{'18岁以上','18到25岁','25到40岁'}" name="job.jobAge" value="#session.job.jobAge"/>
            </td>
        </tr>
        <tr>
            <th>工作年限</th>
            <td><s:select list="{'无要求','一年','一年到三年','三年以上'}" name="job.jobWorkTime" value="#session.job.jobWorkTime"/>
            </td>
        </tr>
        <tr>
            <th>招聘人数</th>
            <td><input type="text" name="job.jobNum" value="${job.jobNum}"></td>
        </tr>
        <tr>
            <th>工作地区</th>
            <td><input type="text" name="job.jobWorkPlace" value="${job.jobWorkPlace}"></td>
        </tr>
        <tr>
            <th>截止时间</th>
            <td><input type="text" name="job.jobEndTime" value="${job.jobEndTime}"></td>
        </tr>
        <tr>
            <th>具体要求</th>
            <td><textarea rows="6" name="job.jobComment" cols="55">${job.jobComment}</textarea></td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="button" value="取消" onclick="window.history.back();">
    </p>
</form>

</body>
</html>
