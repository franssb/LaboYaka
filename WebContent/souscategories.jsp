<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<jsp:include page="inc/header.jsp"></jsp:include>


	<c:set var="souscategories" value="${requestScope['souscategories']}" />
	<ul>
		<c:forEach var="scat" items="${requestScope.souscategories}">
			<li>
				<a href="${pageContext.request.contextPath}/spring/produits?scat=${scat.id}"><c:out value="${scat.nom}"/></a>
			</li>
		</c:forEach>
	</ul>
	<div class="panier">
		<a href="${pageContext.request.contextPath}/spring/panier">panier</a>
	</div>	
</body>
</html>    
   