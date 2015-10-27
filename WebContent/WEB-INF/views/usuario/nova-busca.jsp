<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Find Peças | Nova Busca</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/iCheck/custom.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
	
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
                             </span> <span class="text-muted text-xs block">Art Director <b class="caret"></b></span> </span> </a>
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
                <li>
                    <a href="#"><i class="fa fa-car"></i> <span class="nav-label">Veículos</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="<%= request.getContextPath() + "/usuario/novo-veiculo" %>">Novo veículo</a></li>
                        <li><a href="<%= request.getContextPath() + "/usuario/veiculos" %>">Meus veículos</a></li>
                    </ul>
                </li>
				<li class = "active">
                    <a href="#"><i class="fa fa-search"></i> <span class="nav-label">Buscas</span> <span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li class = "active"><a href="<%= request.getContextPath() + "/usuario/nova-busca" %>">Nova busca</a></li>
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
            <form role="search" class="navbar-form-custom" action="search_results.html">
                <div class="form-group">
                    <input type="text" placeholder="Search for something..." class="form-control" name="top-search" id="top-search">
                </div>
            </form>
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
                    <h2>Nova Busca</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="<%= request.getContextPath() + "/usuario/inicio-usuario" %>">Início</a>
                        </li>
                        <li class="active">
                            <strong>Nova Busca</strong>
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
                            <form method="POST" class="form-horizontal" action="<%= request.getContextPath() + "/usuario/adicionar-busca" %>">
                            	<div class="form-group"><label class="col-sm-2 control-label">Veículo:</label>
                                    <div class="col-sm-6">
										<select data-placeholder="Escolha um fabricante..." class="form-control m-b" style="width:350px;" tabindex="2" required>
											<option value="">- Escolha uma opção -</option>
											<c:forEach items="${veiculos}" var="veiculo">
												<option value="${veiculo.codigo}">${veiculo.modeloVeiculo.nome}</option>
											</c:forEach>
										</select>
									</div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group"><label class="col-sm-2 control-label">Tipo de item:</label>
                                    <div class="col-sm-6">
										<select data-placeholder="Escolha um fabricante..." class="form-control m-b" style="width:350px;" tabindex="2" required>
											<option value="">- Escolha uma opção -</option>
											<c:forEach items="${tiposNegocio}" var="tipoNegocio">
												<option value="${tipoNegocio.codigo}">${tipoNegocio.descricao}</option>
											</c:forEach>
										</select>
									</div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group"><label class="col-sm-2 control-label">Item:</label>
                                    <div class="col-sm-4"><input type="text" class="form-control" required></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group"><label class="col-sm-2 control-label">Detalhamento</label>

                                    <div class="col-sm-4"><textarea class="form-control" cols="10" rows="3"  name="password"></textarea></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group"><label class="col-sm-2 control-label">Quantidade:</label>
                                    <div class="col-sm-4"><input type="text" class="form-control" required></div>
                                </div>
								<div class="hr-line-dashed"></div>	                             
                                <div class="form-group">
                                    <div class="col-sm-4 col-sm-offset-2">
                                        <button class="btn btn-primary" type="submit">Salvar</button>
                                        <a href=javascript:history.back(1)><button class="btn btn-white" type="reset">Cancelar</button></a>
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
        <script>
            $(document).ready(function () {
                $('.i-checks').iCheck({
                    checkboxClass: 'icheckbox_square-green',
                    radioClass: 'iradio_square-green',
                });
            });
        </script>
</body>

</html>
