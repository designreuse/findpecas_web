package br.com.findpecas.web.controller;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.findpecas.service.IBuscaService;

@Controller
public class BuscaController {
	
	@Autowired
	//@Qualifier("buscaServiceImpl")
	private IBuscaService buscaService;
}
