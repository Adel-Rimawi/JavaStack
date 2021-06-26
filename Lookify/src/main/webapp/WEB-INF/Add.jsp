<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix=  "c" uri=  "http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new Song</title>
</head>
<body>
	<h1>Test</h1>
	
	<form:form action="/songs/new" method="POST" modelAttribute="song">
    
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="artist">Artist</form:label>
        <form:errors path="artist"/>
        <form:input path="artist"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:select path="rating">
        <form:option value="1" label="1"/>
        <form:option value="2" label="2"/> 
        <form:option value="3" label="3"/>
        <form:option value="4" label="4"/>
        <form:option value="5" label="5"/>
        <form:option value="6" label="6"/>
        <form:option value="7" label="7"/>
        <form:option value="8" label="8"/>
        <form:option value="9" label="9"/>
        <form:option value="10" label="10"/>
        </form:select>
           
    </p>  
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>