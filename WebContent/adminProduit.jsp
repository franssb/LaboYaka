<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="sousCat" value="${requestScope['sousCategories']}" />
<form action="${pageContext.request.contextPath}/spring/adminProduit">
	<label>nom du produit:</label>
	<input type="text">
	<label>sous catégorie:</label>
	<select>
		<c:forEach var="scat" items="${requestScope.sousCat}">
			<option value="${scat.id}">
				<c:out value="${scat.nom}"/>
			</option>			
		</c:forEach>
	</select>
</form>
</body>
</html>