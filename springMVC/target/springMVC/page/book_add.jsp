<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2023/3/10
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h3>添加图书</h3>
<form action="book/add" method="post">
  <p>图书名称:<input type="text"/></p>
  <p>图书作者:<input type="text"/></p>
  <p>图书价格:<input type="text"/></p>
  <p><input type="submit" value="提交"/></p>
</form>
</body>
</html>
