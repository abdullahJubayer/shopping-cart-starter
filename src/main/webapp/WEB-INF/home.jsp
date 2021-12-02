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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <%@include file="includes/header.jsp" %>
    <%@include file="includes/nav_bar.jsp" %>
        <div class="container">
            <div class="jumbotron">
                <h1>Welcome to E-Shops !</h1>
                <img src="../bangladesh_flag.jpg" style="height: 100px" alt="Bangladesh Image"/>
            </div>
            <div class="row">
                <c:forEach var="product" items="${products}">
                    <div class="col-sm-4">
                        <div class="card h-100 mb-4">
                            <div class="card-body">
                                <h5 class="card-title"><c:out value="${product.name}"/></h5>
                                <p class="card-text"><c:out value="${product.description}"/></p>
                                <p class="card-text">Price $ <c:out value="${product.price}"/></p>
                                <a class="card-link btn btn-outline-info">Add toCart</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    <%@include file="includes/footer.jsp" %>
</html>
