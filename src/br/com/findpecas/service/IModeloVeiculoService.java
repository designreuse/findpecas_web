package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.ModeloVeiculo;


public interface IModeloVeiculoService {
	
	/**
	 * 
	 * @return
	 */
	List<ModeloVeiculo> listarModeloVeiculos();
	
	/**
	 * 
	 * @param fabricante
	 * @return
	 */
	List<ModeloVeiculo> listarPorFabricante(Fabricante fabricante);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	ModeloVeiculo buscarPorId(Integer id);
	
	/**
	 * 
	 * @param nome
	 * @return
	 */
	ModeloVeiculo buscarPorNome(String nome);

}
