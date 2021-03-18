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
<% List<ProductDTO> productList = (List<ProductDTO>) request.getAttribute("products"); %>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
        </tr>
    </thead>

    <% for (ProductDTO product : productList) {%>
    <tr>
        <td>
            <%=product.getName()%>
        </td>
        <td>
            <%=product.getDescription()%>
        </td>
        <td>
            <%=product.getPrice()%>
        </td>
    </tr>
    <%}%>

</table>
</body>
</html>
