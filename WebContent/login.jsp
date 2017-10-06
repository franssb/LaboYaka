<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
admin

<form action="${pageContext.request.contextPath}/spring/admin" method="post">
	<label>mot de passe</label>
	<input type="text" name="mdp">
	<input type="submit" value="login">
</form>

</body>
</html>