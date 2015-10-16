package br.com.findpecas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpresaController {
	
	@RequestMapping("empresa/inicio-empresa")
	public String inicioUsuario() {
		return "empresa/inicio-empresa";
	}

}
