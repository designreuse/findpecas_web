package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Estado;

public interface IEstadoService {
	
	/**
	 * 
	 * @return
	 */
	List<Estado> listarEstados();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Estado buscarPorId(Integer id);
	
	/**
	 * 
	 * @param nome
	 * @return
	 */
	Estado buscarPeloNome(String nome);
	
	/**
	 * 
	 * @param nome
	 * @return
	 */
	List<Estado> buscarPorRegiao(String regiao);

}
