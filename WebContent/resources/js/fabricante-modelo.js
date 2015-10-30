function carregarFabricantes(){  
	$('#fabricantesSelect').html("");
	$('#modelosSelect').html("");
	$.getJSON(
            "fabricantesPorTipoDeVeiculo", 
            {idTipoVeiculo: $('#tipoVeiculoSelect').val()},
            function(data) {
                 var html = '';
                 var len = data.length;
                 for(var i=0; i<len; i++){
                      html += '<option value="' + data[i].codigo + '">' + data[i].nome + '</option>';
                  }
                 $('#fabricantesSelect').html(html);
            }
         );  
} 

function carregarModelos(){  
	$.getJSON(
            "modelosPorFabricante", 
            {fabricanteId: $('#fabricantesSelect').val()},
            function(data) {
                 var html = '';
                 var len = data.length;
                 for(var i=0; i<len; i++){
                      html += '<option value="' + data[i].codigo + '">' + data[i].nome + '</option>';
                  }
                 $('#modelosSelect').html(html);
            }
         );  
} 

