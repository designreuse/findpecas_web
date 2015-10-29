function carregarCidades(estado){  
                $.get('cidadesPorEstado/' + estado, function(resposta){  
                    popularCidades(resposta);   
                });   
} 
          
function popularCidades(resposta){  
    var str = "";  
    for (var i = 0; i < resposta.length; i++){    
        str = str + '<option value="'+resposta[i].codigo+'">'+resposta[i].nome+'</option>';    
    }       
    $('#cidadeSelect').html(str);    
} 