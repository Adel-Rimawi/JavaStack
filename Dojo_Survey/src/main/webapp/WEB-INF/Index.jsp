<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Hi ! </h1>
	<form action = "/info" method = "POST">
		Your Name: <input type = "text" name = "name"><br>
		Dojo Location: <select name = "location">
			<option>Ramallah</option>
			<option>Nablus</option>
			<option>Jenin</option>
	    </select><br>
	    Favorite Language: <select name = "language">
			<option>Python</option>
			<option>Java</option>
			<option>JavaScript</option>
	    </select><br>
	    Comment(Optional): <textarea name="comment"  rows="4" cols="50">
	    
	    
		</textarea>
		<button type = "submit"> Button </button>
		
	</form>
</body>
</html>