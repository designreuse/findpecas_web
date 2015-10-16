<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Find Peças | Minhas buscas</title>

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
                <li >
                    <a href="layouts.html"><i class="fa fa-home"></i> <span class="nav-label">InÃ­cio</span></a>
                </li>
                <li>
                    <a href="layouts.html"><i class="fa fa-cog"></i> <span class="nav-label">Perfil</span></a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-car"></i> <span class="nav-label">VeÃ­culos</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="graph_flot.html">Novo veÃ­culo</a></li>
                        <li><a href="graph_morris.html">Meus veÃ­culos</a></li>
                    </ul>
                </li>
				<li class = "active">
                    <a href="index.html"><i class="fa fa-search"></i> <span class="nav-label">Buscas</span> <span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="index.html">Nova busca</a></li>
                        <li class = "active"><a href="dashboard_2.html">Minhas buscas</a></li>
                    </ul>
                </li>
				<li>
                    <a href="layouts.html"><i class="fa fa-usd"></i> <span class="nav-label">OrÃ§amentos Aprovados</span></a>
					
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
                    <a href="login.html">
                        <i class="fa fa-sign-out"></i> Sair
                    </a>
                </li>
            </ul>

        </nav>
        </div>
            <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-lg-10">
                    <h2>Minhas buscas</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="index.html">InÃ­cio</a>
                        </li>

                        <li class="active">
                            <strong>Buscas de usuÃ¡rios</strong>
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
							<input type="text" class="form-control input-sm m-b-xs" id="filtro_empresa"
                                   placeholder="Escreva aqui para filtrar sua pesquisa">
                            <table class="footable table table-stripped toggle-arrow-tiny" data-page-size="10" data-filter=#filtro_empresa>
                                <thead>
                                <tr>

									<th></th>
                                    <th data-toggle="true">Item</th>
                                    <th>Tipo de veÃ­culo</th>
                                    <th>Estado</th>
									<th>Cidade</th>
									
                                    <th data-hide="all">Nome usuÃ¡rio</th>
                                    <th data-hide="all">E-mail</th>
									<th data-hide="all">Fabricante</th>
									<th data-hide="all">Modelo</th>
									<th data-hide="all">Ano do veÃ­culo</th>
									<th data-hide="all">Data de publicaÃ§Ã£o</th>
                                    <th data-hide="all">ObservaÃ§Ã£o</th>
                                    
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
									<td><input type="radio"   class="i-checks" name="input[]"></td>
                                    <td>Embreagem</td>
                                    <td>Carro</td>
                                    <td>Pernambuco</td>
                                    <td>Olinda</td>
                                    <td><span class="pie">Thiago  Henrique</span></td>
                                    <td>thiagonascimento95@hotmail.com</td>
									<td>Fiat</td>
									<td>Palio</td>
									<td>2010</td>
									<td>29/08/2015</td>
									<td>Preciso de uma embreagem para um carro do tipo tal e do ano mil novecentos e bolinha</td>
                                </tr>
                                <tr>
									<td><input type="radio"   class="i-checks" name="input[]"></td>
                                    <td>Correia</td>
                                    <td>Carro</td>
                                    <td>Pernambuco</td>
                                    <td>Recife</td>
                                    <td><span class="pie">Ana Maria</span></td>
                                    <td>thiagonascimento95@hotmail.com</td>
									<td>Chevrolet</td>
									<td>Celta</td>
									<td>2012</td>
									<td>29/08/2015</td>
									<td>Preciso de uma embreagem para um carro do tipo tal e do ano mil novecentos e bolinha</td>
                                </tr>
                                <tr>
									<td><input type="radio"   class="i-checks" name="input[]"></td>
                                    <td>Kit de peÃ§as para rodas e jantes</td>
                                    <td>Carro</td>
                                    <td>Pernambuco</td>
                                    <td>Recife</td>
                                    <td><span class="pie">Lucas Bomfim</span></td>
                                    <td>thiagonascimento95@hotmail.com</td>
									<td>Ford</td>
									<td>Ka</td>
									<td>2011</td>
									<td>29/08/2015</td>
									<td>Preciso de uma embreagem para um carro do tipo tal e do ano mil novecentos e bolinha</td>
                                </tr>
                               
                                </tbody>
                                <tfoot>
                                <tr>
                                    <td colspan="5">
                                        <ul class="pagination pull-right"></ul>
                                    </td>
                                </tr>
								<tr>
								<td colspan="5"  align="center">
									<button class="btn btn-white" type="submit">Voltar</button>
									<button class="btn btn-primary" type="submit">Detalhar</button>
									<button class="btn btn-primary" type="submit">Enviar OrÃ§amento</button>
									</td>
								</tr>
								
								
                                </tfoot>
                            </table>
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
