<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<jsp:include page="inc/header.jsp"></jsp:include>

<c:set var="pays" value="${requestScope['pays']}" />
<div>
	<form action="${pageContext.request.contextPath}/spring/achat" method="post">
		<label>nom:</label>
		<input type="text" name="nom"><br/>
		<label>prenom:</label>
		<input type="text" name="prenom"><br/>
		<label>adresse:</label>
		<input type="text" name="adresse"><br/>
		<label>localite:</label>
		<input type="text" name="localite"><br/>		
		<label>code postal:</label>
		<input type="text" name="cp"><br/>		
		<label>pays:</label>
		<select name="pays">
			<c:forEach var="p" items="${requestScope.pays}">
				<option value="${p.abreviation}">
					<c:out value="${p.nom}"/>
				</option>			
			</c:forEach>
		</select><br/>		
		<label>telephone:</label>
		<input type="text" name="telephone"><br/>
		<label>Numero de Carte:</label>
		<input type="text" name="numeroCarte"><br/>
		<label>date echeance:</label>
		<input type="text" name="echeance" placeholder="dd-mm-aaaa"><br/>
		<label>email:</label>
		<input type="text" name="email"><br/>
		
		<input type="submit" value="achat">
	</form>
	
</div>
</body>
</html>