package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;

public interface ICidadeDAO {

	Cidade buscarPorId(Integer id);
	Cidade buscarPeloNome(String nome);
	List<Cidade> buscarPorEstado(Estado estado);
	List<Cidade> listarCidades();
	
}
