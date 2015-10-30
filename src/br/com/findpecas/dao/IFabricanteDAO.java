package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.TipoVeiculo;

public interface IFabricanteDAO extends IDAOGenerico<Fabricante> {
	
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
