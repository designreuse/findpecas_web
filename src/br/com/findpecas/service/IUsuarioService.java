package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Usuario;

public interface IUsuarioService {
	
	/**
	 * Método responsável por buscar um Usuário por
	 * seu e-mail.
	 * 
	 * @param email
	 * @return
	 */
	Usuario buscarPorEmail(String email);
	
	/**
	 * Método que adiciona um usuário 
	 * no banco de dados.
	 * 
	 * @param usuario
	 */
	void adicionar(Usuario usuario);
	
	/**
	 * 
	 * 
	 * @param usuario
	 */
	void editar(Usuario usuario);
	
	/**
	 * 
	 * 
	 * @param id
	 * @return Usuario
	 */
	Usuario buscarPorId(Integer id);
	
	/**
	 * 
	 * 
	 * @param usuario
	 */
	void excluir(Usuario usuario);
	
	/**
	 * 
	 * 
	 * @return List<Usuario>
	 */
	List<Usuario> listar();
	
	/**
	 * 
	 * 
	 * @return List<Usuario>
	 */
	List<Usuario> listarUsuariosDesativados();

}
