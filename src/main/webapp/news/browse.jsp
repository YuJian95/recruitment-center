<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <title>新闻浏览</title>
    <link rel="stylesheet" href="/rc/css/all.css" type="text/css"/>
</head>
<body>
<table class="mytablel" align="center" cellspacing="0" cellpadding="4">
    <tr>
        <th style="border-left-width: 0px">新闻标题</th>
        <th width="120">发布时间</th>
    </tr>
    <c:forEach items="${plist.list}" var="n">
        <tr>
            <td style="text-align: left;border-left-width: 0px">
                <a href="/rc/RcNewAction!show.action?newId=${n.newsId}">${n.newTitle}</a>
            </td>
            <td align="center">
                <fmt:formatDate pattern="yyyy-MM-dd" value="${n.newsPostTime}" type="both"/>
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
