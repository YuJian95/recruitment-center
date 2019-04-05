<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>公司管理</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css">
</head>
<body>
<br/>
<form method="post" action="/rc/RcCompanyAction!manage.action">
    公司类型:<s:select name="company.comType" list="{'所有','国有企业','独资企业','合资企业','股份制企业','私营企业','其他类型'}"
                   value="#session.comType"/>
    公司名称:<input type="text" name="comName" size="30" value="${comName}"/>
    <input type="submit" value="查询"/>
</form>
<table class="mytablel" align="center" cellpadding="4" cellspacing="0">
    <tr>
        <th style="border-bottom-width: 0px">企业名称</th>
        <th width="80">用户名</th>
        <th width="80">联系人</th>
        <th width="80">电话</th>
        <th width="80">操作</th>
    </tr>
    <c:forEach items="${plist.list}" var="n">
        <tr>
            <td style="text-align: left;border-left-width: 0px">
                <a href="/rc/RcCompanyAction!show.action?userId=${n.userId}">${n.comName}</a>
            </td>
            <td>
                    ${n.userName}
            </td>
            <td>
                    ${n.comContactor}
            </td>
            <td>
                    ${n.comTel}
            </td>
            <td align="center">
                <a href="/rc/RcCompanyAction!delete.action?userId=${userId}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<center>${plist.pageBar}</center>
</body>
</html>
