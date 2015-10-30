package br.com.findpecas.web.util;

import java.util.List;  
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.ModeloVeiculo;
import br.com.findpecas.model.TipoVeiculo;
import br.com.findpecas.service.IFabricanteService;
import br.com.findpecas.service.IModeloVeiculoService;
import br.com.findpecas.service.ITipoVeiculoService;

@RestController
public class FabricanteModeloController {
	
	@Autowired
	@Qualifier("tipoVeiculoServiceImpl")
	private ITipoVeiculoService tipoVeiculoService;
	
	@Autowired
	@Qualifier("fabricanteServiceImpl")
	private IFabricanteService fabricanteService;
	
	@Autowired
	@Qualifier("modeloVeiculoServiceImpl")
	private IModeloVeiculoService modeloVeiculoService;
	
	/**
	 * 
	 * @param estado
	 * @param map
	 * @return
	 */
	@ResponseBody  
    @RequestMapping(value = {"usuario/modelosPorFabricante", "empresa/modelosPorFabricante"})    
    public List<ModeloVeiculo> retornaModelosVeiculo(@RequestParam(value="fabricanteId") String idFabricante,
    												 ModelMap map) {  
		Integer id = Integer.parseInt(idFabricante);
		Fabricante fabricante = fabricanteService.buscarPorId(id);
		List<ModeloVeiculo> modelos = fabricante.getModeloVeiculos();

        return modelos;
    }
	
	/**
	 *  
	 * @param estado
	 * @param map
	 * @return
	 */
	@ResponseBody     
    @RequestMapping(value = {"usuario/fabricantesPorTipoDeVeiculo", "empresa/fabricantesPorTipoDeVeiculo"})    
    public List<Fabricante> retornaFabricantes(@RequestParam(value="idTipoVeiculo") String idTipoVeiculo, ModelMap map) {  
		Integer id = Integer.parseInt(idTipoVeiculo);
		TipoVeiculo tipoVeiculo = tipoVeiculoService.buscarPorId(id);
		List<Fabricante> fabricantes = tipoVeiculo.getFabricantes();

        return fabricantes;
    }

}
