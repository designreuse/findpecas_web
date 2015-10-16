<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Find Peças | Login</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">

    <link href="<c:url value="/resources/css/animate.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">

</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name"><i class="fa fa-wrench"></i></h1>

            </div>
            <h3>Bem-vindo(a) ao Find Peças</h3>

			<c:if test="${not empty error}">
				<div class="error">${error}</div>
			</c:if>
		

			<p>Perfectly designed and precisely prepared admin theme with over 50 pages with extra new web app views.
                <!--Continually expanded and constantly improved Inspinia Admin Them (IN+)-->
            </p>
            <p>Entre, e o veja em ação</p>
            <form name='formLogin' class="m-t" method='POST'>
                <div class="form-group">
                    <input type="email" id="email" name="email" class="form-control" placeholder="E-mail" required="">
                </div>
                <div class="form-group">
                    <input type="password" id="senha" name="senha" class="form-control" placeholder="Senha" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">Entrar</button>

                <a href="usuario/recuperar-senha"><small>Esqueceu sua senha?</small></a>
                <p class="text-muted text-center"><small>Não possui uma conta?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="usuario/criar-novo-usuario">Criar uma conta</a>
                
                <input type="hidden" 
                     name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>
            <p class="m-t"> <small>Find Peças &copy; 2015</small> </p>
        </div>
    </div>

    <!-- Mainly scripts -->
    <script src="<c:url value="/resources/js/jquery-2.1.1.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

</body>

</html>
