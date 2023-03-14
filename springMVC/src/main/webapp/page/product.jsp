<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head><title>异步提交商品</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/jquery-3.6.0.js"></script>
</head>
<body>
<form id="products">
    <table border="1">
        <tr>
            <th>商品id</th>
            <th>商品名称</th>
            <th>提交</th>
        </tr>
        <tr>
            <td>
                <input name="productId" value="1" id="productId" type="text">
            </td>
            <td><input name="productName" value="三文鱼"
                       id="productName" type="text"></td>
            <td><input type="button" value="提交单个商品"
                       onclick="sumbmitProduct()"></td>
        </tr>
        <tr>
            <td><input name="productId" value="2" id="productId2"
                       type="text"></td>
            <td><input name="productName" value="红牛"
                       id="productName2" type="text"></td>
            <td><input type="button" value="提交多个商品"
                       onclick="submitProducts()"></td>
        </tr>
    </table>
</form>
<script type="text/javascript">
    function sumbmitProduct() {
        var productId = $("#productId").val();
        var productName = $("#productName").val();
        $.ajax({
            url: "${pageContext.request.contextPath }/product/getProduct",
            type: "post",
            data: JSON.stringify({productId: productId, productName: productName}),
            contentType: "application/json;charset=UTF-8",
            dataType: "json",
            success: function (response) {
                alert(response);
            }
        });
    }

    function submitProducts() {
        var pro1 = {productId: $("#productId").val(), productName: $("#productName").val()}
        var pro2 = {productId: $("#productId2").val(), productName: $("#productName2").val()}
        $.ajax({
            url: "${pageContext.request.contextPath }/product/getProductList",
            type: "post",
            data: JSON.stringify([pro1, pro2]),
            contentType: "application/json;charset=UTF-8",
            dataType: "json",
            success: function (response) {
                alert(response);
            }
        });
    }
</script>
</body>
</html>

