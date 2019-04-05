<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>个人用户管理</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css"/>
</head>
<body>
<br/>
<form method="post" action="/rc/RcPersonAction!manage.action">
    求职意向:<input type="text" name="perJobTarget" size="30" value="${perJobTarget}"/>
    <input type="submit" value="查询"/>
</form>
<table class="mytable1" align="center" cellpadding="4" cellspacing="0">
    <tr>
        <th style="border-left-width: 0px">用户名</th>
        <th width="80">真实名</th>
        <th width="80">电话</th>
        <th width="80">邮件</th>
        <th width="80">操作</th>
    </tr>
    <c:forEach items="${plist.list}" var="n">
        <tr>
            <td style="text-align: left;border-bottom-width: 0px">
                <a href="/rc/RcPersonAction!show.action?userId=${n.userId}">${n.userName}</a>
            </td>
            <td>${n.perRealName}</td>
            <td>${n.perTel}</td>
            <td>${n.perEmail}</td>
            <td align="center">
                <a href="/rc/RcPersonAction!delete.action?userId=${n.userId}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br/>
<center>
    ${plist.pageBar}
</center>
</body>
</html>
