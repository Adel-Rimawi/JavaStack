<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">    
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<div class = "d-flex justify-content-around">
    
    
    <form method="post" action="/logint">
    <h1>Login</h1>
    <span>${ error }</span>
        <div class="form-group">
            <label for="email">Email</label>
            <input class="form-control" type="text" id="email" name="lemail"/>
        </div>
        <div class="form-group">
            <label class="form-check-label" for="password">Password</label>
            <input class="form-control" type="password" id="password" name="password"/>
        </div>
        <input class="btn btn-primary" type="submit" value="Login!"/>
    </form>   
    
    
    <p><form:errors path="user.*"/></p>
    
    <form:form method="POST" action="/registration" modelAttribute="registration">
    <h1>Register!</h1>
        <div class="form-group">
            <form:label class="form-check-label" path="email">Email:</form:label>
            <form:input class="form-control" type="email" path="email"/>
        </div>
        <div class="form-group">
            <form:label class="form-check-label" path="password">Password:</form:label>
            <form:password class="form-control" path="password"/>
        </div>
        <div class="form-group">
            <form:label class="form-check-label" path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password class="form-control" path="passwordConfirmation"/>
        </div>
        <input class="btn btn-primary" type="submit" value="Register!"/>
    </form:form>
    </div> 
</body>
</html>