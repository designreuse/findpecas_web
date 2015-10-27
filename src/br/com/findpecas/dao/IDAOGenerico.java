package br.com.findpecas.dao;

import java.util.List;

public interface IDAOGenerico<T> {
	
	/**
	 * M�todo que salva um objeto no banco.
	 * 
	 * @param t
	 */
	void adicionar(T t);
	
	/**
	 * M�todo que edita uma entidade persistida no banco.
	 * 
	 * @param t
	 */
	void editar(T t);
	
	/**
	 * M�todo que lista todos os registros de
	 * uma entidade salvos no banco.
	 * 
	 * @return
	 */
	List<T> listar();
	
	/**
	 * M�todo que busca uma entidade no banco por
	 * seu id.
	 * 
	 * @param id
	 * @return
	 */
	T buscarPorId(Integer id);
	
	/**
	 * M�todo que exclui uma entidade salva no banco.
	 * 
	 * @param t
	 */
	void excluir(T t);
	

}
