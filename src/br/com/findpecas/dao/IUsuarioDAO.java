package br.com.findpecas.dao;

import br.com.findpecas.model.Usuario;

public interface IUsuarioDAO extends IDAOGenerico<Usuario> {
	
	Usuario verificaSeExiste(String email, String senha);

	Usuario buscarPorEmail(String email);

}
