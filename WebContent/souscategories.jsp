<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<c:set var="souscategories" value="${requestScope['souscategories']}" />
	<ul>
		<c:forEach var="scat" items="${requestScope.souscategories}">
			<li>
				<a href="${pageContext.request.contextPath}/spring/produits?scat=${scat.id}"><c:out value="${scat.nom}"/></a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>    
   