<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Cidade: ${cidade.nome }
	<br>
	Estado: ${cidade.estado.nome }


	<c:forEach items="${cidades}" var="cidade">
		Cidade: <option>${cidade.nome}</option><br>
		Estado: <option>${cidade.estado.nome}</option><br><br>
	</c:forEach>


</body>
</html>