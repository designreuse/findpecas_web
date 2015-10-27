package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Fabricante;

public interface IFabricanteService {
	
	List<Fabricante> listarFabricantes();
	Fabricante buscarPorId(Integer id);
	Fabricante buscarPorNome(String nome);

}
