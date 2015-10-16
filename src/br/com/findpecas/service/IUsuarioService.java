package br.com.findpecas.service;

import br.com.findpecas.model.Usuario;

public interface IUsuarioService {
	
	Usuario getByEmail(String email);

}
