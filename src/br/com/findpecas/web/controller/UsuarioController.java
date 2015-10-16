package br.com.findpecas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

	
	@RequestMapping("usuario/inicio-usuario")
	public String inicioUsuario() {
		return "usuario/inicio-usuario";
	}
	
	@RequestMapping("usuario/veiculos")
	public ModelAndView listaDeVeiculos() {
		ModelAndView mav = new ModelAndView("lista-veiculos");
		
		return mav;
	}
	
	@RequestMapping("usuario/perfil")
	public ModelAndView perfilDoUsuario() {
		ModelAndView mav = new ModelAndView("");
		
		return mav;
	}
	
	@RequestMapping("usuario/novo-veiculo")
	public ModelAndView novoVeiculo() {
		ModelAndView mav = new ModelAndView("cadastro-veiculo-usuario");
		
		return mav;
	}
	
	@RequestMapping("usuario/nova-busca")
	public ModelAndView novaBuscaUsuario() {
		ModelAndView mav = new ModelAndView("");
		
		return mav;
	}
	
	@RequestMapping("usuario/buscas")
	public ModelAndView buscasDoUsuario() {
		ModelAndView mav = new ModelAndView("lista-buscas-usuario");
		
		return mav;
	}
	
	@RequestMapping("usuario/veiculo-buscas")
	public ModelAndView buscasDoUsuarioPorVeiculo() {
		ModelAndView mav = new ModelAndView("lista-buscas-veiculo");
		
		return mav;
	}
	
	@RequestMapping("usuario/orcamentos-aprovados")
	public ModelAndView orcamentosAprovados() {
		ModelAndView mav = new ModelAndView("");
		
		return mav;
	}

	
}
