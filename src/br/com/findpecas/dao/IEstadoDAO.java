package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Estado;

public interface IEstadoDAO {

	List<Estado> listarEstados();
	Estado buscarPorId(Integer id);
	Estado buscarPeloNome(String nome);
	List<Estado> buscarPorRegiao(String nome);
	
}
