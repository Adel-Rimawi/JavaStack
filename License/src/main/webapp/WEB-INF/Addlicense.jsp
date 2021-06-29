<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add License</title>
</head>
<body>
	<form:form action="/licenses/add" method="POST" modelAttribute="newlicense">
	<form:label path="person">Person</form:label>
        <form:errors path="person"/>
        <form:select path="person">
        <c:forEach var="person" items="${persons}">
			<form:option value="${person.id}" label="${person.firstName}"/>
			
        </c:forEach>

       </form:select>
    
    
    <p>
        <form:label path="expirationDate">Expiration Date</form:label>
        <form:errors path="expirationDate"/>
        <form:input type="date" path="expirationDate" />
    </p>
    
    <p>
    <form:label path="state">State</form:label>
        <form:errors path="state"/>
        <form:input path="state"/>
     </p>
    
    
    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>