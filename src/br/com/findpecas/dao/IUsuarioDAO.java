package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.Usuario;

public interface IUsuarioDAO extends IDAOGenerico<Usuario> {
	
	Usuario verificaSeExiste(String email, String senha);
	Usuario buscarPorEmail(String email);
	List<Usuario> listarUsuariosDesativados();
	public List<Usuario> listarUsuariosPorEstado(Estado estado);
	public List<Usuario> listarUsuariosPorRegiao(String regiao);
	public List<Usuario> listarUsuariosPorCidade(Cidade cidade);

}
