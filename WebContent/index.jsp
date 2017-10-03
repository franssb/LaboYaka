<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<jsp:include page="inc/header.jsp"></jsp:include>

	<c:set var="categories" value="${requestScope['categories']}" />
	<ul>
		<c:forEach var="cat" items="${requestScope.categories}">
			<li>
				<a href="${pageContext.request.contextPath}/spring/souscategories?cat=${cat.id}"><c:out value="${cat.nom}"/></a>
			</li>
		</c:forEach>
	</ul>
	<div class="panier">
		<a href="${pageContext.request.contextPath}/spring/panier">panier</a>
	</div>	
</body>
</html>    
   