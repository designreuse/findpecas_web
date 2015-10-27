<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Find Peças | Lista de veículos</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/iCheck/custom.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
	
    <!-- FooTable -->
    <link href="<c:url value="/resources/css/plugins/footable/footable.core.css"/>" rel="stylesheet">

   

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
                            <li><a href="profile.html">Profile</a></li>
                            <li><a href="contacts.html">Contacts</a></li>
                            <li><a href="mailbox.html">Mailbox</a></li>
                            <li class="divider"></li>
                            <li><a href="login.html">Logout</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        FP
                    </div>
                </li>
                 <li>
                    <a href="<%= request.getContextPath() + "/usuario/inicio-usuario" %>"><i class="fa fa-home"></i> <span class="nav-label">Início</span></a>
                </li>
                <li>
                    <a href="<%= request.getContextPath() + "/usuario/perfil" %>"><i class="fa fa-cog"></i> <span class="nav-label">Perfil</span></a>
                </li>
                <li class = "active">
                    <a href="#"><i class="fa fa-car"></i> <span class="nav-label">Veículos</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="<%= request.getContextPath() + "/usuario/novo-veiculo" %>">Novo veículo</a></li>
                        <li class = "active"><a href="<%= request.getContextPath() + "/usuario/veiculos" %>">Meus veículos</a></li>
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
                    <a href="<%= request.getContextPath() + "/logout" %>">
                        <i class="fa fa-sign-out"></i> Sair
                    </a>
                </li>
            </ul>

        </nav>
        </div>
            <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-lg-10">
                    <h2>Meus veículos</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="<%= request.getContextPath() + "/usuario/inicio-usuario" %>">Início</a>
                        </li>

                        <li class="active">
                            <strong>Meus veículos</strong>
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
                    	<c:forEach items="${veiculos}" var="veiculo">
	                        <div class="ibox-content">
	                            <div class="row">
	                                <div class="col-lg-12">
	                                    <div class="m-b-md">
	                                        <a href="#" class="btn btn-white btn-xs pull-right">Editar veículo</a>
	                                        <h2>${veiculo.modeloVeiculo.nome}</h2>
	                                    </div>
	                                    <dl class="dl-horizontal">
	                                        <dt>Status:</dt> <dd><span class="label label-primary">Active</span></dd>
	                                    </dl>
	                                </div>
	                            </div>
	                            <div class="row">
	                                <div class="col-lg-5">
	                                    <dl class="dl-horizontal">
	
	                                        <dt>Created by:</dt> <dd>Alex Smith</dd>
	                                        <dt>Messages:</dt> <dd>  162</dd>
	                                        <dt>Client:</dt> <dd><a href="#" class="text-navy"> Zender Company</a> </dd>
	                                        <dt>Version:</dt> <dd> 	v1.4.2 </dd>
	                                    </dl>
	                                </div>
	                                <div class="col-lg-7" id="cluster_info">
	                                    <dl class="dl-horizontal" >
	
	                                        <dt>Last Updated:</dt> <dd>16.08.2014 12:15:57</dd>
	                                        <dt>Created:</dt> <dd> 	10.07.2014 23:36:57 </dd>
	                                        <dt>Participants:</dt>
	                                        <dd class="project-people">
	                                        <a href=""><img alt="image" class="img-circle" src="img/a3.jpg"></a>
	                                        <a href=""><img alt="image" class="img-circle" src="img/a1.jpg"></a>
	                                        <a href=""><img alt="image" class="img-circle" src="img/a2.jpg"></a>
	                                        <a href=""><img alt="image" class="img-circle" src="img/a4.jpg"></a>
	                                        <a href=""><img alt="image" class="img-circle" src="img/a5.jpg"></a>
	                                        </dd>
	                                    </dl>
	                                </div>
	                                <div class="col-sm-4 col-sm-offset-2">
                                        <button class="btn btn-primary" type="submit">Nova busca</button>
                                        <button class="btn btn-primary" type="submit">Ver buscas</button>
                                        <button class="btn btn-primary" type="submit">Editar</button>
                                        <button class="btn btn-white" type="reset">Excluir</button>
                                	</div>
	                            </div>
	                        </div>
                        </c:forEach>
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



    <!-- Mainly scripts -->
    <script src="<c:url value="/resources/js/jquery-2.1.1.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/slimscroll/jquery.slimscroll.min.js"/>"></script>

    <!-- Custom and plugin javascript -->
    <script src="<c:url value="/resources/js/inspinia.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/pace/pace.min.js"/>"></script>
    
     <!-- iCheck -->
    <script src="<c:url value="/resources/js/plugins/iCheck/icheck.min.js"/>"></script>
    
    <!-- FooTable -->
    <script src="<c:url value="/resources/js/plugins/footable/footable.all.min.js"/>"></script>

    <!-- Page-Level Scripts -->
    <script>
        $(document).ready(function() {

            $('.footable').footable();
            $('.footable2').footable();

        });

    </script>
	
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
