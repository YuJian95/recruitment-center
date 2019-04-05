<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/4
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>回复申请</title>
    <link rel="stylesheet" href="../css/all.css">
</head>
<body>
<form method="post" action="/rc/RcApplication!edit.action">
    <input type="hidden" name="app.appId" value="${param.appId}">
    <table class="mytable2" align="center" cellspacing="0" cellpadding="2">
        <tr>
            <th>内容</th>
            <td><textarea rows="8" name="app.appResponse" cols="62"></textarea></td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="button" value="取消" onclick="window.history.back();">
    </p>
</form>
</body>
</html>
