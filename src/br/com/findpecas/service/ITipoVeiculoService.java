package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.TipoVeiculo;

public interface ITipoVeiculoService {
	
	/**
	 * 
	 * @param tipoVeiculo
	 */
	void adicionar(TipoVeiculo tipoVeiculo);
	
	/**
	 * 
	 * @param tipoVeiculo
	 */
	void editar(TipoVeiculo tipoVeiculo);
	
	/**
	 * 
	 * @return
	 */
	List<TipoVeiculo> listar();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	TipoVeiculo buscarPorId(Integer id);
	
	/**
	 * 
	 * @param tipoVeiculo
	 */
	void excluir(TipoVeiculo tipoVeiculo);

}
