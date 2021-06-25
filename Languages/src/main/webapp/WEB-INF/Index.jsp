<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix=  "c" uri=  "http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Hi !</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Creator</th>
      <th scope="col">Version</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="Language" items="${Languages}">
	    <tr>
	      <th scope="row"><a href= "/Languages/${Language.id}">${Language.name}</a></th> 
	      <td>${Language.creator}</td>
	      <td>${Language.version}</td>
	      <td><a class="btn btn-link" href= "Languages/edit/${Language.id}">Edit</a> 
	      <form action="/Languages/${Language.id}" method = "POST">
	      <input type="hidden" name="_method" value="DELETE">
	      <button type="submit" class="btn btn-link">Delete</button>
	      </form></td>
	    </tr>
		</c:forEach>
  </tbody>
</table>	
		
		
<form:form action="/Languages" method="POST" modelAttribute="language">
    
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>  
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>