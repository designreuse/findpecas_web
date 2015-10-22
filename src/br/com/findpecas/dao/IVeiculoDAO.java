package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Veiculo;

public interface IVeiculoDAO extends IDAOGenerico<Veiculo>{
	
	List<Veiculo> listarVeiculosPorUsuario();
	List<Veiculo> listarVeiculosPorModelo();
	List<Veiculo> listarVeiculosPorFabricante();
	List<Veiculo> listarBuscasDoVeiculo();
	List<Veiculo> listarBuscasAprovadasDoVeiculo();

}
