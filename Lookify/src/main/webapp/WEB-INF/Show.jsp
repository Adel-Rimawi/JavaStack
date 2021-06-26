<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix=  "c" uri=  "http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${Song.title}"/></title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div style = "display: flex; justify-content: space-between;">
	<h2>Top Ten Songs: </h2>
	<a href= "/songs">Dash board</a>
</div>
<h3><c:out value="${Song.title}"/></h3>
<h3><c:out value="${Song.rating}"/></h3>
<h3><c:out value="${Song.artist}"/></h3>
<a class="btn btn-link" href = "/Languages/edit/<c:out value="${language.id}"/>">Edit</a>
<form action="/Languages/<c:out value="${Song.id}"/>" method = "POST">
	      <input type="hidden" name="_method" value="DELETE">
	      <button type="submit" class="btn btn-link">Delete</button>
	      </form>

</body>
</html>