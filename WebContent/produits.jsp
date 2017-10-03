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
	<c:set var="produits" value="${requestScope['produits']}" />
	<ul>
		<c:forEach var="p" items="${requestScope.produits}">
			<li>
				<a href="${pageContext.request.contextPath}/spring/detailProduit?prod=${p.id}">
					<img alt="${p.nom}" src="${pageContext.request.contextPath}/images/${p.vignette}">
					<c:out value="${p.nom}"/><br/>
				</a>
				<c:out value="${p.descrCourte}"></c:out>
			</li>
		</c:forEach>
	</ul>	
	<div class="panier">
		<a href="${pageContext.request.contextPath}/spring/panier">panier</a>
	</div>	
</body>
</html>