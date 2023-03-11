<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2023/3/10
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/user/registerUser" method="post">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="submit" value="提交">
  </form>
</body>
</html>
