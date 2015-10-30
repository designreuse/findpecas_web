package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.ModeloVeiculo;


public interface IModeloVeiculoDAO extends IDAOGenerico<ModeloVeiculo> {
	
	List<ModeloVeiculo> listarPorFabricante(Fabricante fabricante);
	ModeloVeiculo buscarPorNome(String nome);
	List<ModeloVeiculo> buscarPorFabricante(Fabricante fabricante);

}
