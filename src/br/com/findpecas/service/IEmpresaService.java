package br.com.findpecas.service;

import br.com.findpecas.model.Empresa;

public interface IEmpresaService {
	
	Empresa getByEmail(String email);

}
