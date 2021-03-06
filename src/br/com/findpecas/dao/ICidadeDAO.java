package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;

public interface ICidadeDAO {

	/**
	 * 
	 * @param id
	 * @return
	 */
	Cidade buscarPorId(Integer id);
	
	/**
	 * 
	 * @param nome
	 * @return
	 */
	Cidade buscarPeloNome(String nome);
	
	/**
	 * 
	 * @param estado
	 * @return
	 */
	List<Cidade> buscarPorEstado(Estado estado);
	
	/**
	 * 
	 * @return
	 */
	List<Cidade> listarCidades();
	
}
