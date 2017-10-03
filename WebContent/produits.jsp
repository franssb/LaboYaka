<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 
<jsp:include page="inc/header.jsp"></jsp:include>

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