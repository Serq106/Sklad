<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Books</title>
</head>
<body>


<h3>Мега библиотека</h3>
<table>	
	<c:forEach var="book" items="${listBooks}" >
		<tr>
		<td>${book.id}</td>
		<td>${book.bookTitle}</td>
		<td></td>
		<td></td>
		<td></td>
		</tr>
	
	</c:forEach>

</table>


</body>
</html>