<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix=  "c" uri=  "http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${language.name}"/></title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h3><c:out value="${language.name}"/></h3>
<h3><c:out value="${language.creator}"/></h3>
<h3><c:out value="${language.version}"/></h3>
<a class="btn btn-link" href = "/Languages/edit/<c:out value="${language.id}"/>">Edit</a>
<form action="/Languages/<c:out value="${language.id}"/>" method = "POST">
	      <input type="hidden" name="_method" value="DELETE">
	      <button type="submit" class="btn btn-link">Delete</button>
	      </form>
	

</body>
</html>