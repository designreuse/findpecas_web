package br.com.findpecas.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.findpecas.dao.impl.JpaCidadeDAO;
import br.com.findpecas.dao.impl.JpaEstadoDAO;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;

@Controller
@Transactional
public class HomeController {
	
	@Autowired
	private JpaCidadeDAO daoCidade;
	
	@Autowired
	private JpaEstadoDAO daoEstado;
	
	
	@RequestMapping("buscarEstado")
	public ModelAndView buscaEstado() {
		ModelAndView mav = new ModelAndView("teste-estado");
		
		Cidade cidade = daoCidade.listarCidades().get(5);
		mav.getModel().put("cidade", cidade);
		
		return mav;
		
	}
	
	
	@RequestMapping("buscaListaCidades")
	public ModelAndView buscaListaCidades() {
		ModelAndView mav = new ModelAndView("teste-estado");
		
		
		Estado estado = daoEstado.buscarPorId(16);
		
		
		List cidades = estado.getCidades();
		mav.getModel().put("cidades", cidades);
		
		return mav;
		
	}
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("inicio")
	public String inicio() {
		return "index";
	}
	

}
