package br.com.findpecas.web.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;
import br.com.findpecas.service.ICidadeService;
import br.com.findpecas.service.IEstadoService;

@RestController
public class CidadeEstadoController {
	
	@Autowired
	@Qualifier("cidadeServiceImpl")
	private ICidadeService cidadeService;
	
	@Autowired
	@Qualifier("estadoServiceImpl")
	private IEstadoService estadoService;

	/**
	 * 
	 * @param estado
	 * @param map
	 * @return
	 */
	@ResponseBody  
    @RequestMapping(value = {"usuario/cidadesPorEstado", "empresa/cidadesPorEstado"})    
    public List<Cidade> retornaCidades(@RequestParam(value="idEstado") String idEstado, ModelMap map) {  
		Integer id = Integer.parseInt(idEstado);
		Estado estado = estadoService.buscarPorId(id);
		List<Cidade> cidades = estado.getCidades();

        return cidades;
    } 
}
