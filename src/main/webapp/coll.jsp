<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>

 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Crunchify.com JSP Servlet Example  </title>

<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>

<%!
 	String name = "Collection";
 	public String dec(){
 		return name;
 	}
 %>
<body>
<h1><%=dec() %></h1>
<div align='center'>
<!-- no need to call request.getattribute -->
<h3>Books</h3>
<table>
		<tr>
    	<th>id</th>
    	<th>title</th>
  		</tr>
 <c:forEach var="book" items="${books}">
 		
      <tr><td><c:out value = "${book.key}"/></td><td><c:out value="${book.value}"/><p></td></tr>
</c:forEach>   
</table>
</div>

     
    



</body>
</html>