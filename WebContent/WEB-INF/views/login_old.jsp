<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${not empty error}">
		<div class="error">${error}</div>
	</c:if>

	<form name='f'  method='POST'>
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text'  id='email' name='email' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' id='senha' name='senha' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		</table>
		<input type="hidden" 
                     name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
	
</body>
</html>