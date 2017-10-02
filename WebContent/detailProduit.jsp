<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mycss.css" />
</head>
<body>
	<div class="logo">
		<a href="${pageContext.request.contextPath}/spring/index">
			<h2>Yaka</h2>
			<img alt="Yaka_logo" src="${pageContext.request.contextPath}/images/Yaka_logo.png" class="yaka_logo">
		</a>
	</div>
	<c:set var="p" value="${requestScope.produit}" />
		<c:out value="${p.nom}"/><br/>
		<img alt="${p.nom}" src="${pageContext.request.contextPath}/images/${p.image}"><br/>
		<c:out escapeXml="false" value="${p.descrLongue}"></c:out>
		<form action="${pageContext.request.contextPath}/spring/panier/add" method="post">
			<c:forEach var="prop" items="${p.caracByProp}">
				<label><c:out value="${prop.proprietes.nom}"/></label>
				<c:if test="${prop.proprietes.id != 2}">
					<select name="param">
						<c:forEach var="v" items="${prop.caracteristiques}">
							<option  value="${v.id}"><c:out value="${v.valeur}"/></option>					
						</c:forEach>
					</select>
				</c:if>
				<br/>
			</c:forEach>
			<input type="submit" value="ajouter au panier">
		</form>
</body>
</html>