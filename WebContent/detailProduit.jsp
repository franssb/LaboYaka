<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<jsp:include page="inc/header.jsp"></jsp:include>

	<c:set var="p" value="${requestScope.produit}" />
		<c:out value="${p.nom}"/><br/>
		<img alt="${p.nom}" src="${pageContext.request.contextPath}/images/${p.image}"><br/>
		<c:out escapeXml="false" value="${p.descrLongue}"></c:out>
		<form action="${pageContext.request.contextPath}/spring/panier/add" method="post">
			<c:forEach var="prop" items="${p.caracByProp}">
				<label><c:out value="${prop.proprietes.nom}"/></label>
				<c:choose>
					<c:when test="${prop.proprietes.id != 2}">
						<select name="param">
							<c:forEach var="v" items="${prop.caracteristiques}">
								<option  value="${v.id}"><c:out value="${v.valeur}"/></option>					
							</c:forEach>
						</select>
					</c:when>
					<c:otherwise>
						<input name="param" type="hidden" value="${prop.caracteristiques[0].id}">
					</c:otherwise>
				</c:choose>
			
				<br/>
			</c:forEach>
			<input type="submit" value="ajouter au panier">
		</form>
</body>
</html>