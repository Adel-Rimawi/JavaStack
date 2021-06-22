<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix=  "c" uri=  "http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body style = "padding: 30px">
	<h1> You Gold: <c:out value="${goldtotal}"/></h1>
	<div style = " display: flex; justify-content: space-between;">
		<form method = "POST" action = "/addgold">
			<h3>Farm</h3>
			<input name ="hidden" type = "hidden" value = "farm">
			<p> (earns 10-20 gold)</p>
			<button type = "submit">Find Gold!</button>
		</form>
		<form method = "POST" action = "/addgold">
			<h3>Cave</h3>
			<input name ="hidden" type = "hidden" value = "cave">
			<p> (earns 5-10	gold)</p>
			<button type = "submit">Find Gold!</button>
		</form>
		<form method = "POST" action = "/addgold">
			<h3>House</h3>
			<input name ="hidden" type = "hidden" value = "house">
			<p> (earns 2-5 gold)</p>
			<button type = "submit">Find Gold!</button>
		</form>
		<form method = "POST" action = "/addgold">
			<h3>Casino</h3>
			<input name ="hidden" type = "hidden" value = "casino">
			<p> (earns/takes 0-50  gold)</p>
			<button type = "submit">Find Gold!</button>
		</form>
	</div>
	
	<h3> Activities: </h3>
	<div>
		<c:forEach var="Activity" items="${Activities}">
	    <p> ${Activity} </p>
		</c:forEach>
	</div>
	
	
</body>
</html>