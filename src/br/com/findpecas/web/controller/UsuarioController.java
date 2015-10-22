package br.com.findpecas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {
	
	public static final String CONTEXTO_USUARIO = "usuario/";

	@RequestMapping(CONTEXTO_USUARIO + "inicio-usuario")
	public String inicioUsuario() {
		return "usuario/inicio-usuario";
	}
	
	@RequestMapping(CONTEXTO_USUARIO + "veiculos")
	public ModelAndView listaDeVeiculos() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "lista-veiculos");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_USUARIO + "perfil")
	public ModelAndView perfilDoUsuario() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "perfil-usuario");
		
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_USUARIO + "novo-veiculo")
	public ModelAndView novoVeiculo() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "novo-veiculo");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_USUARIO + "nova-busca")
	public ModelAndView novaBuscaUsuario() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "nova-busca");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_USUARIO + "buscas")
	public ModelAndView buscasDoUsuario() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "lista-buscas-usuario");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_USUARIO + "veiculo-buscas")
	public ModelAndView buscasDoUsuarioPorVeiculo() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "lista-buscas-veiculo");
		
		return mav;
	}
	
	@RequestMapping(CONTEXTO_USUARIO + "orcamentos-aprovados")
	public ModelAndView orcamentosAprovados() {
		ModelAndView mav = new ModelAndView(CONTEXTO_USUARIO + "orcamentos-aprovados");
		
		return mav;
	}

	
}
