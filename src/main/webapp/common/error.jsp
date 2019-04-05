<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>错误信息</title>
</head>
<body>
<s:property value="exception.message"/>
<s:property value="exceptionStack"/>
</body>
</html>
