package br.com.findpecas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpresaController {
	
	private static final String CONTEXTO_EMPRESA = "empresa/";
	
	@RequestMapping(CONTEXTO_EMPRESA + "inicio-empresa")
	public String inicioUsuario() {
		return "empresa/inicio-empresa";
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
