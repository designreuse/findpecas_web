package br.com.findpecas.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import br.com.findpecas.dao.ICidadeDAO;
import br.com.findpecas.dao.IEstadoDAO;
import br.com.findpecas.model.Busca;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.ModeloVeiculo;
import br.com.findpecas.model.TipoNegocio;
import br.com.findpecas.model.Usuario;
import br.com.findpecas.model.Veiculo;
import br.com.findpecas.service.IFabricanteService;
import br.com.findpecas.service.IModeloVeiculoService;
import br.com.findpecas.service.ITipoNegocioService;
import br.com.findpecas.service.IUsuarioService;
import br.com.findpecas.service.IVeiculoService;

@Controller
@SessionAttributes("usuario")
public class UsuarioController {
	// ATRIBUTOS ------------------
	
	public static final String CONTEXTO_USUARIO = "usuario/";
	@Autowired
	@Qualifier("usuarioServiceImpl")
	private IUsuarioService usuarioService;
	
	@Autowired
	@Qualifier("veiculoServiceImpl")
	private IVeiculoService veiculoService;
	
	@Autowired
	@Qualifier("fabricanteServiceImpl")
	private IFabricanteService fabricanteService;
	
	@Autowired
	@Qualifier("modeloVeiculoServiceImpl")
	private IModeloVeiculoService modeloVeiculoService;
	
	@Autowired
	@Qualifier("tipoNegocioServiceImpl")
	private ITipoNegocioService tipoNegocioService;
	
	@Autowired
	private ICidadeDAO cidadeDao;
	
	@Autowired
	private IEstadoDAO estadoDao;

	
	// M�TODOS ------------------
	
	/**
	 * 
	 * 
	 * @param usuario
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "inicio-usuario")
	public ModelAndView inicioUsuario(
			@ModelAttribute("usuario") Usuario usuario) {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "inicio-usuario");
		List<Estado> estados = estadoDao.listarEstados();
		
		mav.getModel().put("usuario", usuario);
		mav.addObject("estados", estados);
		
		return mav;
	}
	
	/**
	 * Exibe os ve�culos do usu�rio
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "veiculos")
	public ModelAndView listaDeVeiculos(
			@ModelAttribute("usuario") Usuario usuario) {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "lista-veiculos");
		List<Veiculo> veiculos = usuario.getVeiculos();
		
		mav.getModel().put("veiculos", veiculos);
		
		return mav;
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "perfil")
	public ModelAndView perfilDoUsuario(
			@ModelAttribute("usuario") Usuario usuario) {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "perfil-usuario");
		
		
		return mav;
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "novo-veiculo")
	public ModelAndView novoVeiculo() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "novo-veiculo");
		List<Fabricante> fabricantes = fabricanteService.listarFabricantes();
		List<ModeloVeiculo> modelos = modeloVeiculoService.listarModeloVeiculos();
		
		mav.addObject("fabricantes", fabricantes);
		mav.addObject("modelos", modelos);
		
		return mav;
	}
	
	/**
	 * 
	 * 
	 * @param veiculo
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "adicionar-veiculo")
	public String adicionarVeiculo(Veiculo veiculo) {
	
		
		return "redirect:usuario/veiculos";
	}
	
	/**
	 * 
	 * 
	 * @param busca
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "adicionar-busca")
	public ModelAndView adicionarBusca(
			@ModelAttribute("usuario") Usuario usuario, Busca busca) {
	
		
		return buscasDoUsuario();
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "nova-busca")
	public ModelAndView novaBuscaUsuario(
			@ModelAttribute("usuario") Usuario usuario) {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "nova-busca");
		List<Veiculo> veiculos = usuario.getVeiculos();
		List<TipoNegocio> tiposNegocio = tipoNegocioService.listarTiposNegocio();
		
		mav.addObject("veiculos", veiculos);
		mav.addObject("tiposNegocio", tiposNegocio);
		
		return mav;
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "buscas")
	public ModelAndView buscasDoUsuario() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "lista-buscas-usuario");
		
		return mav;
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "veiculo-buscas")
	public ModelAndView buscasDoUsuarioPorVeiculo(Veiculo veiculo, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "lista-buscas-veiculo");
		
		return mav;
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "excluir-veiculo")
	public String excluirVeiculo(Veiculo veiculo) {
		
		
		return "redirect:usuario/veiculos";
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "editar-veiculo")
	public ModelAndView editarVeiculo(Veiculo veiculo) {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "editar-veiculo");
		
		return mav;
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(CONTEXTO_USUARIO + "orcamentos-aprovados")
	public ModelAndView orcamentosAprovados(
			@ModelAttribute("usuario") Usuario usuario) {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "orcamentos-aprovados");
		
		return mav;
	}

	/**
	 * 
	 * @param estado
	 * @param map
	 * @return
	 */
	@ResponseBody  
    @RequestMapping(value = "/cidadesPorEstado/{estado}")  
    public List<Cidade> retornaCidades(@PathVariable Integer idEstado, ModelMap map) {  
		Estado estado = estadoDao.buscarPorId(idEstado);
        return cidadeDao.buscarPorEstado(estado);
    }  
	
	/*
	@RequestMapping("/url/para/a/action")  
	public void getCidades(Integer idEstado) {  
		Estado estado = estadoDao.buscarPorId(idEstado);
	   List<Cidade> cidades = cidadeDao.buscarPorEstado(estado); // Carrega as cidades que est�o nesse estado...  
	   result.use(Results.json()).withoutRoot().from(cidades).serialize(); // Transforma a lista em JSON  
	}*/
	
}
