<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.findpecas.web.controller.UsuarioController"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Find Peças | Início</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/iCheck/custom.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">

	<link href="<c:url value="/resources/css/plugins/chosen/chosen.css"/>" rel="stylesheet">
	
    <link href="<c:url value="/resources/css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css"/>" rel="stylesheet">
   

</head>

<body>

    <div id="wrapper">

    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element"> 
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">${usuario.nome}</strong>
                             </span> <span class="text-muted text-xs block">Administrador <b class="caret"></b></span> </span> </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a href="profile.html">Perfil</a></li>
                            <li><a href="contacts.html">Configurações</a></li>
                            <li><a href="mailbox.html">Mailbox</a></li>
                            <li class="divider"></li>
                            <li><a href="<%= request.getContextPath() + "/logout" %>">Sair</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        FP
                    </div>
                </li>
				<li class = "active">
                    <a href="<%= request.getContextPath() + "/usuario/inicio-usuario" %>"><i class="fa fa-home"></i> <span class="nav-label">Início</span></a>
                </li>
                <li>
                    <a href="<%= request.getContextPath() + "/usuario/perfil" %>"><i class="fa fa-cog"></i> <span class="nav-label">Perfil</span></a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-car"></i> <span class="nav-label">Veículos</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="<%= request.getContextPath() + "/usuario/novo-veiculo" %>">Novo veículo</a></li>
                        <li><a href="<%= request.getContextPath() + "/usuario/veiculos" %>">Meus veículos</a></li>
                    </ul>
                </li>
				<li>
                    <a href="#"><i class="fa fa-search"></i> <span class="nav-label">Buscas</span> <span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="<%= request.getContextPath() + "/usuario/nova-busca" %>">Nova busca</a></li>
                        <li><a href="<%= request.getContextPath() + "/usuario/buscas" %>">Minhas buscas</a></li>
                    </ul>
                </li>
				<li>
                    <a href="<%= request.getContextPath() + "/usuario/orcamentos-aprovados" %>"><i class="fa fa-usd"></i> <span class="nav-label">Orçamentos Aprovados</span></a>
					
                </li>
            </ul>

        </div>
    </nav>

        <div id="page-wrapper" class="gray-bg">
        <div class="row border-bottom">
        <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
        </div>
            <ul class="nav navbar-top-links navbar-right">
                <li>
                    <span class="m-r-sm text-muted welcome-message">Bem-vindo ao Find Peças.</span>
                </li>
              
                <li>
                    <a href="<%= request.getContextPath() + "/logout" %>">
                        <i class="fa fa-sign-out"></i> Sair
                    </a>
                </li>
            </ul>

        </nav>
        </div>
            <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-lg-10">
                    <h2>Cadastro Usuário</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="index.html">Home</a>
                        </li>
                        <li class="active">
                            <strong>Cadastro Usuário</strong>
                        </li>
                    </ol>
                </div>
                <div class="col-lg-2">

                </div>
            </div>
        <div class="wrapper wrapper-content animated fadeInRight">
		  <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-content">
                            <form method="get" class="form-horizontal">
                                <div class="form-group"><label class="col-sm-2 control-label">Nome</label>

                                    <div class="col-sm-4"><input type="text" class="form-control"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
								
								<div class="form-group"><label class="col-sm-2 control-label">E-mail</label>
                                    <div class="col-sm-2">
										<input type="email" class="form-control">
									</div>
                                </div>
                                <div class="hr-line-dashed"></div>
								
                               <div class="form-group"><label class="col-sm-2 control-label">Senha</label>
                                    <div class="col-sm-2"><input type="password" class="form-control" name="password"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
								
								<div class="form-group"><label class="col-sm-2 control-label">Estado</label>
									<div class="col-sm-2">
										<select id="estadosSelect" onchange="carregarCidades(this.value)" data-placeholder="Escolha um estado..." class="chosen-select" style="width:350px;" tabindex="2">
											<option value="">- Escolha uma opção -</option>
											<c:forEach items="${estados}" var="estado">
												<option value="${estado.codigo}">${estado.nome}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="hr-line-dashed"></div>
								
								<div class="form-group"><label class="col-sm-2 control-label">Cidade</label>
									<div class="col-sm-2">	
										<select id="cidadeSelect" data-placeholder="Escolha um estado..." class="chosen-select" style="width:350px;" tabindex="2">
											
										</select>
									</div>
								</div>
								<div class="hr-line-dashed"></div>
								
                                <div class="form-group">
                                    <div class="col-sm-4 col-sm-offset-2">
                                        <button class="btn btn-white" type="reset">Cancelar</button>
                                        <button class="btn btn-primary" type="submit">Salvar</button>
                                    </div>
                                </div>
                            </form>
                       
					   </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer">
            <div class="pull-right">
                10GB of <strong>250GB</strong> Free.
            </div>
            <div>
                <strong>Copyright</strong> Example Company &copy; 2014-2015
            </div>
        </div>

        </div>
        </div>


    <!-- Mainly scripts 
    <script src="<c:url value="/resources/js/jquery-2.1.1.js"/>"></script>-->
    <script src="<c:url value="/resources/js/jquery-2.1.4.js"/>"></script>
    <script src="<c:url value="/resources/js/jquery-2.1.4.min.js"/>"></script>
    
    <script src="<c:url value="/resources/js/cidade-estado.js"/>"></script>
    
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/slimscroll/jquery.slimscroll.min.js"/>"></script>



    <!-- Custom and plugin javascript -->
    <script src="<c:url value="/resources/js/inspinia.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/pace/pace.min.js"/>"></script>

	<!-- Chosen -->
    <script src="<c:url value="/resources/js/plugins/chosen/chosen.jquery.js"/>"></script>
	
	   <!-- Input Mask-->
    <script src="<c:url value="/resources/js/plugins/jasny/jasny-bootstrap.min.js"/>"></script>
    <script>
            $(document).ready(function () {
                $('.i-checks').iCheck({
                    checkboxClass: 'icheckbox_square-green',
                    radioClass: 'iradio_square-green',
                });
            });
        </script>
	
    <!-- iCheck -->
    <script src="<c:url value="/resources/js/plugins/iCheck/icheck.min.js"/>"></script>
        <script>
            $(document).ready(function () {
                $('.i-checks').iCheck({
                    checkboxClass: 'icheckbox_square-green',
                    radioClass: 'iradio_square-green',
                });
            });
        </script>
		<!--
		<script>
		$(document).ready(function(){  
			   $('#estadosSelect').on('change', function(){  
			      var self = $(this);  
			      var selecionado = self.val(); // pega o ID do estado  
			      $.ajax({  
			         url:'/url/para/a/action',  
			         data:{estado:selecionado}, // Passa a variável ao server. O nome do parâmetro tem que ser estado, pois foi o nome colocado aqui.  
			         dataType:'json', // O Server vai retornar um JSON  
			         success:function(data){  
			            // Precisa transformar de json para objeto html  
			            var options = [];  
			            options.push(' <option>Selecione</option> '); // colocando a primeira option...  
			            for (var i = 0; i < data.length; i++) {  
			               options.push('<option value="'+data[i].id+'">'+data[i].nome+'</option>');  
			            }  
			              
			            // Agora precisa juntar esses options dentro da combo de cidades  
			            $('#cidadesSelect').html(options.join(''));  
			         },  
			         error:function(){  
			            alert('erro');  
			         }  
			      });  
			   });  
			});
        </script> -->
		
    

</body>

</html>
