<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Name: <c:out value="${name}"/>
	Dojo Location: <c:out value="${location}"/>
	Favorite Language: <c:out value="${language}"/>
	Comment:  <c:out value="${comment}"/>
	
	<a href= "/">Go Back</a>
</body>
</html>