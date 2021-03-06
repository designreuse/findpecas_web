<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Find Peças | Perfil</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/iCheck/custom.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    <script src="<c:url value="/resources/js/plugins/chosen/chosen.jquery.js"/>"></script>
	<link href="<c:url value="/resources/css/plugins/colorpicker/bootstrap-colorpicker.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/cropper/cropper.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/plugins/switchery/switchery.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/jasny/jasny-bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/nouslider/jquery.nouislider.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/datapicker/datepicker3.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/ionRangeSlider/ion.rangeSlider.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/ionRangeSlider/ion.rangeSlider.skinFlat.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/clockpicker/clockpicker.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins/daterangepicker/daterangepicker-bs3.css"/>" rel="stylesheet">


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
                            <li><a href="contacts.html">ConfiguraÃ§Ãµes</a></li>
                            <li><a href="mailbox.html">Mailbox</a></li>
                            <li class="divider"></li>
                            <li><a href="login.html">Sair</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        FP
                    </div>
                </li>
                <li>
                    <a href="<%= request.getContextPath() + "/usuario/inicio-usuario" %>"><i class="fa fa-home"></i> <span class="nav-label">Início</span></a>
                </li>
                <li class = "active">
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
                    <a href="<%= request.getContextPath() + "/logout" %>">
                        <i class="fa fa-sign-out"></i> Sair
                    </a>
                </li>
            </ul>

        </nav>
        </div>
            <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-lg-10">
                    <h2>Perfil</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="<%= request.getContextPath() + "/usuario/inicio-usuario" %>">Início</a>
                        </li>
                        <li class="active">
                            <strong>Perfil</strong>
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
						
						<div class="form-group"><label class="col-sm-2 control-label">Estado</label>
							<div class="col-sm-2">
								<select data-placeholder="Escolha um estado..." class="chosen-select" style="width:350px;" tabindex="2">
									<option value="">Select</option>
									<option value="${estado.nome}">${estado.nome}</option>
								</select>
							</div>
						</div>
						<div class="hr-line-dashed"></div>
						
						<div class="form-group"><label class="col-sm-2 control-label">Cidade</label>
							<div class="col-sm-2">	
								<select data-placeholder="Escolha um estado..." class="chosen-select" style="width:350px;" tabindex="2">
									<option value="">Select</option>
									<option value="${cidade.nome}">${cidade.nome}</option>
								</select>
							</div>
						</div>
						<div class="hr-line-dashed"></div>
						
						<div class="form-group"><label class="col-sm-2 control-label">Bairro</label>

							<div class="col-sm-4"><input type="text" class="form-control"></div>
						</div>
						<div class="hr-line-dashed"></div>
						
						 <div class="form-group"><label class="col-sm-2 control-label">Senha</label>
							<div class="col-sm-2"><input type="password" class="form-control" name="password"></div>
						</div>
						<div class="hr-line-dashed"></div>
						
						<div class="form-group"><label class="col-sm-2 control-label">Confirmar senha</label>
							<div class="col-sm-2"><input type="password" class="form-control" name="password"></div>
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

     <!-- Mainly scripts -->
    <script src="<c:url value="/resources/js/jquery-2.1.1.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/slimscroll/jquery.slimscroll.min.js"/>"></script>

    <!-- Custom and plugin javascript -->
    <script src="<c:url value="/resources/js/inspinia.js"/>"></script>
    <script src="<c:url value="/resources/js/plugins/pace/pace.min.js"/>"></script>
    <script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

	<!-- Chosen -->
    <script src="<c:url value="/resources/js/plugins/chosen/chosen.jquery.js"/>"></script>
	
	   <!-- Input Mask-->
    <script src="<c:url value="/resources/js/plugins/jasny/jasny-bootstrap.min.js"/>"></script>
	
    <!-- iCheck -->
    <script src="<c:url value="/resources/js/plugins/iCheck/icheck.min.js"/>"></script>





   <!-- JSKnob -->
   <script src="<c:url value="/resources/js/plugins/jsKnob/jquery.knob.js"/>"></script>


   <!-- Data picker -->
   <script src="<c:url value="/resources/js/plugins/datapicker/bootstrap-datepicker.js"/>"></script>

   <!-- NouSlider -->
   <script src="<c:url value="/resources/js/plugins/nouslider/jquery.nouislider.min.js"/>"></script>

   <!-- Switchery -->
   <script src="<c:url value="/resources/js/plugins/switchery/switchery.js"/>"></script>

    <!-- IonRangeSlider -->
    <script src="<c:url value="/resources/js/plugins/ionRangeSlider/ion.rangeSlider.min.js"/>"></script>

    <!-- iCheck -->
    <script src="<c:url value="/resources/js/plugins/iCheck/icheck.min.js"/>"></script>

    <!-- MENU -->
    <script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js"/>"></script>

    <!-- Color picker -->
    <script src="<c:url value="/resources/js/plugins/colorpicker/bootstrap-colorpicker.min.js"/>"></script>

    <!-- Clock picker -->
    <script src="<c:url value="/resources/js/plugins/clockpicker/clockpicker.js"/>"></script>

    <!-- Image cropper -->
    <script src="<c:url value="/resources/js/plugins/cropper/cropper.min.js"/>"></script>

    <!-- Date range use moment.js same as full calendar plugin -->
    <script src="<c:url value="/resources/js/plugins/fullcalendar/moment.min.js"/>"></script>

    <!-- Date range picker -->
    <script src="<c:url value="/resources/js/plugins/daterangepicker/daterangepicker.js"/>"></script>

    <script>
        $(document).ready(function(){

            var $image = $(".image-crop > img")
            $($image).cropper({
                aspectRatio: 1.618,
                preview: ".img-preview",
                done: function(data) {
                    // Output the result data for cropping image.
                }
            });

            var $inputImage = $("#inputImage");
            if (window.FileReader) {
                $inputImage.change(function() {
                    var fileReader = new FileReader(),
                            files = this.files,
                            file;

                    if (!files.length) {
                        return;
                    }

                    file = files[0];

                    if (/^image\/\w+$/.test(file.type)) {
                        fileReader.readAsDataURL(file);
                        fileReader.onload = function () {
                            $inputImage.val("");
                            $image.cropper("reset", true).cropper("replace", this.result);
                        };
                    } else {
                        showMessage("Please choose an image file.");
                    }
                });
            } else {
                $inputImage.addClass("hide");
            }

            $("#download").click(function() {
                window.open($image.cropper("getDataURL"));
            });

            $("#zoomIn").click(function() {
                $image.cropper("zoom", 0.1);
            });

            $("#zoomOut").click(function() {
                $image.cropper("zoom", -0.1);
            });

            $("#rotateLeft").click(function() {
                $image.cropper("rotate", 45);
            });

            $("#rotateRight").click(function() {
                $image.cropper("rotate", -45);
            });

            $("#setDrag").click(function() {
                $image.cropper("setDragMode", "crop");
            });

            $('#data_1 .input-group.date').datepicker({
                todayBtn: "linked",
                keyboardNavigation: false,
                forceParse: false,
                calendarWeeks: true,
                autoclose: true
            });

            $('#data_2 .input-group.date').datepicker({
                startView: 1,
                todayBtn: "linked",
                keyboardNavigation: false,
                forceParse: false,
                autoclose: true,
                format: "dd/mm/yyyy"
            });

            $('#data_3 .input-group.date').datepicker({
                startView: 2,
                todayBtn: "linked",
                keyboardNavigation: false,
                forceParse: false,
                autoclose: true
            });

            $('#data_4 .input-group.date').datepicker({
                minViewMode: 1,
                keyboardNavigation: false,
                forceParse: false,
                autoclose: true,
                todayHighlight: true
            });

            $('#data_5 .input-daterange').datepicker({
                keyboardNavigation: false,
                forceParse: false,
                autoclose: true
            });

            var elem = document.querySelector('.js-switch');
            var switchery = new Switchery(elem, { color: '#1AB394' });

            var elem_2 = document.querySelector('.js-switch_2');
            var switchery_2 = new Switchery(elem_2, { color: '#ED5565' });

            var elem_3 = document.querySelector('.js-switch_3');
            var switchery_3 = new Switchery(elem_3, { color: '#1AB394' });

            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green'
            });

            $('.demo1').colorpicker();

            var divStyle = $('.back-change')[0].style;
            $('#demo_apidemo').colorpicker({
                color: divStyle.backgroundColor
            }).on('changeColor', function(ev) {
                        divStyle.backgroundColor = ev.color.toHex();
                    });

            $('.clockpicker').clockpicker();

            $('input[name="daterange"]').daterangepicker();

            $('#reportrange span').html(moment().subtract(29, 'days').format('MMMM D, YYYY') + ' - ' + moment().format('MMMM D, YYYY'));

            $('#reportrange').daterangepicker({
                format: 'MM/DD/YYYY',
                startDate: moment().subtract(29, 'days'),
                endDate: moment(),
                minDate: '01/01/2012',
                maxDate: '12/31/2015',
                dateLimit: { days: 60 },
                showDropdowns: true,
                showWeekNumbers: true,
                timePicker: false,
                timePickerIncrement: 1,
                timePicker12Hour: true,
                ranges: {
                    'Today': [moment(), moment()],
                    'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                    'Last 7 Days': [moment().subtract(6, 'days'), moment()],
                    'Last 30 Days': [moment().subtract(29, 'days'), moment()],
                    'This Month': [moment().startOf('month'), moment().endOf('month')],
                    'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                },
                opens: 'right',
                drops: 'down',
                buttonClasses: ['btn', 'btn-sm'],
                applyClass: 'btn-primary',
                cancelClass: 'btn-default',
                separator: ' to ',
                locale: {
                    applyLabel: 'Submit',
                    cancelLabel: 'Cancel',
                    fromLabel: 'From',
                    toLabel: 'To',
                    customRangeLabel: 'Custom',
                    daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr','Sa'],
                    monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
                    firstDay: 1
                }
            }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
                $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
            });


        });
        var config = {
                '.chosen-select'           : {},
                '.chosen-select-deselect'  : {allow_single_deselect:true},
                '.chosen-select-no-single' : {disable_search_threshold:10},
                '.chosen-select-no-results': {no_results_text:'Oops, nothing found!'},
                '.chosen-select-width'     : {width:"95%"}
                }
            for (var selector in config) {
                $(selector).chosen(config[selector]);
            }

        $("#ionrange_1").ionRangeSlider({
            min: 0,
            max: 5000,
            type: 'double',
            prefix: "$",
            maxPostfix: "+",
            prettify: false,
            hasGrid: true
        });

        $("#ionrange_2").ionRangeSlider({
            min: 0,
            max: 10,
            type: 'single',
            step: 0.1,
            postfix: " carats",
            prettify: false,
            hasGrid: true
        });

        $("#ionrange_3").ionRangeSlider({
            min: -50,
            max: 50,
            from: 0,
            postfix: "Â°",
            prettify: false,
            hasGrid: true
        });

        $("#ionrange_4").ionRangeSlider({
            values: [
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
            ],
            type: 'single',
            hasGrid: true
        });

        $("#ionrange_5").ionRangeSlider({
            min: 10000,
            max: 100000,
            step: 100,
            postfix: " km",
            from: 55000,
            hideMinMax: true,
            hideFromTo: false
        });

        $(".dial").knob();

        $("#basic_slider").noUiSlider({
            start: 40,
            behaviour: 'tap',
            connect: 'upper',
            range: {
                'min':  20,
                'max':  80
            }
        });

        $("#range_slider").noUiSlider({
            start: [ 40, 60 ],
            behaviour: 'drag',
            connect: true,
            range: {
                'min':  20,
                'max':  80
            }
        });

        $("#drag-fixed").noUiSlider({
            start: [ 40, 60 ],
            behaviour: 'drag-fixed',
            connect: true,
            range: {
                'min':  20,
                'max':  80
            }
        });


    </script>

</body>

</html>
