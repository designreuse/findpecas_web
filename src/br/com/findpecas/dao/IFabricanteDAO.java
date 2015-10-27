package br.com.findpecas.dao;

import br.com.findpecas.model.Fabricante;

public interface IFabricanteDAO extends IDAOGenerico<Fabricante> {
	
	Fabricante buscarPorNome(String nome);

}
