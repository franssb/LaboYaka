<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<jsp:include page="inc/header.jsp"></jsp:include>
	
	<c:set var="panier" value="${requestScope['panier']}" />
	<ul>
		<c:forEach var="p" items="${requestScope.panier.articles}">
			<li>
				<c:out value="${p.produit.nom}"/><br/>
				<img alt="${p.produit.nom}" src="${pageContext.request.contextPath}/images/${p.produit.vignette}">
				<p>caracteristiques:</p>
				<c:forEach var="c" items="${p.caracteristiques}">
					<c:out value="${c.proprietes.nom}"/>
					<c:out value="${c.valeur}"></c:out>
				</c:forEach>
				<span>prix:</span>
				<c:out value="${p.prixHtva }"/><span> euros</span>
				<form action="${pageContext.request.contextPath}/spring/panier/remove" method="post">
					<input type="hidden" name="remove" value="${p.id}">
					<input type="submit" value="retirer">
				</form>
			</li>
		</c:forEach>
	</ul>
	<span>total:</span>
	<c:out value="${panier.prix}"></c:out>
</body>
</html>