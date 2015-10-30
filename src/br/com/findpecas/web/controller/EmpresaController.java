package br.com.findpecas.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import br.com.findpecas.model.Empresa;
import br.com.findpecas.service.IEmpresaService;
import br.com.findpecas.service.IFabricanteService;
import br.com.findpecas.service.IModeloVeiculoService;
import br.com.findpecas.service.ITipoNegocioService;
import br.com.findpecas.service.IVeiculoService;

@Controller
@SessionAttributes("empresa")
public class EmpresaController {
	// ATRIBUTOS ------------------
	
	private static final String CONTEXTO_EMPRESA = "empresa/";
	
	@Autowired
	@Qualifier("empresaServiceImpl")
	private IEmpresaService empresaService;
	
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
	
	// MÉTODOS ------------------
	
	@RequestMapping(CONTEXTO_EMPRESA + "inicio-empresa")
	public ModelAndView inicioEmpresa(
			@ModelAttribute("empresa") Empresa empresa) {
		ModelAndView mav = new ModelAndView(CONTEXTO_EMPRESA + "empresa");
		mav.getModel().put("empresa", empresa);
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_EMPRESA + "perfil-empresa")
	public ModelAndView perfilEmpresa() {
		ModelAndView mav = new ModelAndView(CONTEXTO_EMPRESA + "perfil-empresa");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_EMPRESA + "editar-perfil")
	public ModelAndView editarPerfilEmpresa() {
		ModelAndView mav = new ModelAndView(CONTEXTO_EMPRESA + "editar-perfil-empresa");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_EMPRESA + "orcamentos-realizados")
	public ModelAndView orcamentosRealizados() {
		ModelAndView mav = new ModelAndView(CONTEXTO_EMPRESA + "orcamentos-realizados");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_EMPRESA + "orcamentos-aprovados")
	public ModelAndView orcamentosAprovados() {
		ModelAndView mav = new ModelAndView(CONTEXTO_EMPRESA + "orcamentos-aprovados");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_EMPRESA + "novo-orcamento")
	public ModelAndView novoOrcamento() {
		ModelAndView mav = new ModelAndView(CONTEXTO_EMPRESA + "novo-orcamento");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_EMPRESA + "avaliacoes-recebidas")
	public ModelAndView avaliacoesRecebidas() {
		ModelAndView mav = new ModelAndView(CONTEXTO_EMPRESA + "avaliacoes-recebidas");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_EMPRESA + "buscas-usuarios")
	public ModelAndView visualizarBuscasUsuarios() {
		ModelAndView mav = new ModelAndView(CONTEXTO_EMPRESA + "buscas-usuarios");
		
		return mav;
	}	

}
