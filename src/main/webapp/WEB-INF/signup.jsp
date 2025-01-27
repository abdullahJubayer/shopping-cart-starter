<%--
  Created by IntelliJ IDEA.
  User: abdul
  Date: 12/3/2021
  Time: 8:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@include file="includes/header.jsp" %>
<%@include file="includes/nav_bar.jsp" %>
<div class="container">

    <form class="form-horizontal" action='' method="POST">
        <fieldset>

            <div class="control-group">
                <!-- FirstName -->
                <label class="control-label" for="first_name">FirstName</label>
                <div class="controls">
                    <input type="text" id="first_name" name="first_name" placeholder="" class="input-xlarge">
                    <p class="help-block">FirstName can contain any letters or numbers</p>
                </div>
            </div>

            <div class="control-group">
                <!-- LastName -->
                <label class="control-label" for="last_name">LastName</label>
                <div class="controls">
                    <input type="text" id="last_name" name="last_name" placeholder="" class="input-xlarge">
                    <p class="help-block">LastName can contain any letters or numbers</p>
                </div>
            </div>

            <div class="control-group">
                <!-- Username -->
                <label class="control-label" for="username">Username</label>
                <div class="controls">
                    <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
                    <p class="help-block">Username can contain any letters or numbers, without spaces</p>
                </div>
            </div>

            <div class="control-group">
                <!-- E-mail -->
                <label class="control-label" for="email">E-mail</label>
                <div class="controls">
                    <input type="text" id="email" name="email" placeholder="" class="input-xlarge">
                    <p class="help-block">Please provide your E-mail</p>
                </div>
            </div>

            <div class="control-group">
                <!-- Password-->
                <label class="control-label" for="password">Password</label>
                <div class="controls">
                    <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
                    <p class="help-block">Password should be at least 4 characters</p>
                </div>
            </div>

            <div class="control-group">
                <!-- Password -->
                <label class="control-label" for="password_confirm">Password (Confirm)</label>
                <div class="controls">
                    <input type="password" id="password_confirm" name="password_confirm" placeholder=""
                           class="input-xlarge">
                    <p class="help-block">Please confirm password</p>
                </div>
            </div>

            <div class="control-group">
                <!-- Button -->
                <div class="controls">
                    <button class="btn btn-success">Register</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>
<%@include file="includes/footer.jsp" %>
</html>
