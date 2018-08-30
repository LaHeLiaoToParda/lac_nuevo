<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Camisetas</title>
<meta charset="UTF-8">
</head>
<body>
<h1>Listado camisetas</h1>
<div>
<c:forEach var="mi" items="${Lista}">
<p>${mi.id}</p>
<p>${mi.color}</p>
<p>${mi.precio}</p>
<p>${mi.genero}</p>
<p>${mi.talla}</p>
<p>${mi.categoria}</p>
<p>${mi.stock}</p>
</c:forEach>
</div>
</body>
</html>