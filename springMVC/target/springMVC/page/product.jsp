<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2023/3/11
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/product/getProducts">
  <table>
    <tr>
      <td><input name="productId" value="1" type="checkbox">1</td>
    </tr>
    <tr>
      <td><input name="productId" value="2" type="checkbox">2</td>
    </tr>
    <tr>
      <td><input name="productId" value="3" type="checkbox">3</td>
    </tr>
    <tr>
      <td><input type="submit" value="提交"></td>
    </tr>
  </table>
</form>
</body>
</html>
