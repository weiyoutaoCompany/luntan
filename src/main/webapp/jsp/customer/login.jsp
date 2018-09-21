<%--
  Created by IntelliJ IDEA.
  User: S6203-1-08
  Date: 2018/9/19
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=basePath%>/jsp/login" method="post">
用户名：<input type="text" name="username"/>
密码：<input type="password" name="password"/>
   <button type="submit">登录</button>
</form>
</body>
</html>
