<%--
  Created by IntelliJ IDEA.
  User: abdul
  Date: 3/17/2021
  Time: 11:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.bazlur.shoppingcart.dto.ProductDTO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<% List<ProductDTO> productList = (List<ProductDTO>) request.getAttribute("produtcs"); %>
<table>
    <thead>
    <tr>Name</tr>
    <tr>Description</tr>
    <tr>Price</tr>
    </thead>
    <% for (ProductDTO product : productList) {%>
    <tr>
        <td><%=product.getName()%>
        </td>
    </tr>
    <tr>
        <td><%=product.getDescription()%>
        </td>
    </tr>
    <tr>
        <td><%=product.getPrice()%>
        </td>
    </tr>
    <%}%>

</table>
</body>
</html>
