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
<c:set var="categories" value="${requestScope['categories']}" />
<form action="${pageContext.request.contextPath}/spring/admin/cat/del" method="post">
	<select name="del">
		<c:forEach var="cat" items="${categories}" >
			<option value="${cat.id}">
					<c:out value="${cat.nom}"/>
				</option>
		</c:forEach>
	</select>
	<input type="submit" value="delete">
</form>
<form action="${pageContext.request.contextPath}/spring/admin/cat/add" method="post">
	<label>ajout Categorie</label>
	<input type="text" name="cat"/>
	<input type="submit" value="ajout"/>
</form>
</body>
</html>