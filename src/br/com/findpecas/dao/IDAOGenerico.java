package br.com.findpecas.dao;

import java.util.List;

public interface IDAOGenerico<T> {
	
	/**
	 * Método que salva um objeto no banco.
	 * 
	 * @param t
	 */
	void adicionar(T t);
	
	/**
	 * Método que edita uma entidade persistida no banco.
	 * 
	 * @param t
	 */
	void editar(T t);
	
	/**
	 * Método que lista todos os registros de
	 * uma entidade salvos no banco.
	 * 
	 * @return
	 */
	List<T> listar();
	
	/**
	 * Método que busca uma entidade no banco por
	 * seu id.
	 * 
	 * @param id
	 * @return
	 */
	T buscarPorId(Integer id);
	
	/**
	 * Método que exclui uma entidade salva no banco.
	 * 
	 * @param t
	 */
	void excluir(T t);
	

}
