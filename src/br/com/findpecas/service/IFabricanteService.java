package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.TipoVeiculo;

public interface IFabricanteService {
	
	/**
	 * 
	 * @return
	 */
	List<Fabricante> listarFabricantes();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Fabricante buscarPorId(Integer id);
	
	/**
	 * 
	 * @param nome
	 * @return
	 */
	Fabricante buscarPorNome(String nome);
	
	/**
	 * 
	 * @param tipoVeiculo
	 * @return
	 */
	List<Fabricante> listarPorTipoVeiculo(TipoVeiculo tipoVeiculo);

}
