<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Find Peçasas | Registrar conta</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/iCheck/custom.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">

</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen   animated fadeInDown">
        <div>
            <div>

               <h1 class="logo-name"><i class="fa fa-wrench"></i></h1>

            </div>
            <h3>Registrar em Find PeÃ§as</h3>
            <p>Crie uma conta e o veja em aÃ§Ã£o.</p>
            <form class="m-t" role="form" action="login.html">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Nome" required="">
                </div>
				<div class="form-group">
					<select class="form-control m-b" name="estado" required="">
						<option>- Escolha um estado -</option>
						
						<c:forEach items="${estados}" var="estado">
							<option>${estado.nome}</option>
						</c:forEach>
						
					</select>
				</div>
				<div class="form-group">
					<select class="form-control m-b" name="cidade" required="">
						<option>- Escolha uma cidade -</option>
						
						<c:forEach items="${cidades}" var="cidade">
							<option>${cidade.nome}</option>
						</c:forEach>
						
					</select>
				</div>
                <div class="form-group">
                    <input type="email" class="form-control" placeholder="E-mail" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Password" required="">
                </div>
                <div class="form-group">
                        <div class="checkbox i-checks"><label> <input type="checkbox"><i></i> Aceito os termos e polÃ­ticas </label></div>
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">Registrar</button>

                <p class="text-muted text-center"><small>JÃ¡ possui uma conta?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="login.html">Entrar</a>
            </form>
            <p class="m-t"> <small>Inspinia we app framework base on Bootstrap 3 &copy; 2014</small> </p>
        </div>
    </div>

    <!-- Mainly scripts -->
    <script src="<c:url value="/resources/js/jquery-2.1.1.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <!-- iCheck -->
    <script src="<c:url value="/resources/js/plugins/iCheck/icheck.min.js"/>"></script>
    <script>
        $(document).ready(function(){
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });
        });
    </script>
</body>

</html>
