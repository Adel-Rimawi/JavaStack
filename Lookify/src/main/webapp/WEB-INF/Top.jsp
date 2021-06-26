<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix=  "c" uri=  "http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style = "display: flex; justify-content: space-between;">
	<h2>Top Ten Songs: </h2>
	<a href= "/songs">Dash board</a>
</div>
<c:forEach var="song" items="${Songs}">
	<h3>${song.rating} - <a href= "/songs/${song.id}">${song.title}</a> - ${song.artist}</h3> 
</c:forEach>
</body>
</html>