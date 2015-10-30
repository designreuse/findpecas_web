function carregarCidades(estado){  
	$.getJSON(
            "cidadesPorEstado", 
            {idEstado: $('#estadosSelect').val()},
            function(data) {
                 var html = '';
                 var len = data.length;
                 for(var i=0; i<len; i++){
                      html += '<option value="' + data[i].codigo + '">' + data[i].nome + '</option>';
                  }
                 $('#cidadesSelect').html(html);
            }
         );  
} 