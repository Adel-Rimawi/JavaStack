<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix=  "c" uri=  "http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div style = "display:felx; justify-content: space-between;">
		<h2>Songs By: <c:out value="${artist}"/></h2>
		<form action="/songs/search"  style = "display: inline-block;">
					<input type="text" name="artist"/>
					<button class="btn btn-primary">Search Artists</button>
		</form>
	</div>
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">Name</th>
	      <th scope="col">Rating</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="song" items="${songs}">
		    <tr>
		      <th scope="row"><a href= "/songs/${song.id}">${song.title}</a></th> 
		      <td>${song.rating}</td>
		    </tr>
			</c:forEach>
			 </tbody>
	</table>	
</body>
</html>