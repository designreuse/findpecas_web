package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Usuario;

public interface IUsuarioService {
	
	Usuario buscarPorEmail(String email);
	void adicionar(Usuario usuario);
	void editar(Usuario usuario);
	Usuario buscarPorId(Integer id);
	void excluir(Usuario usuario);
	List<Usuario> listar();
	List<Usuario> listarUsuariosDesativados();

}
