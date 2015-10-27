package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.ModeloVeiculo;


public interface IModeloVeiculoService {
	
	List<ModeloVeiculo> listarModeloVeiculos();
	List<ModeloVeiculo> listarPorFabricante(Fabricante fabricante);
	ModeloVeiculo buscarPorId(Integer id);
	ModeloVeiculo buscarPorNome(String nome);

}
