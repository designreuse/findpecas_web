package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.findpecas.dao.IVeiculoDAO;
import br.com.findpecas.model.Veiculo;

public class JpaVeiculoDAO implements IVeiculoDAO {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Veiculo veiculo) {
		manager.persist(veiculo);
	}

	@Override
	public void editar(Veiculo veiculo) {
		manager.merge(veiculo);
	}

	@Override
	public List<Veiculo> listar() {
		return manager.createQuery("select u from Veiculo u").getResultList();
	}

	@Override
	public Veiculo buscarPorId(Integer id) {
		return manager.find(Veiculo.class, id);
	}

	@Override
	public void excluir(Veiculo veiculo) {
		//Veiculo veiculoARemover = buscarPorId(veiculo.getCodigo());
	      //manager.remove(veiculoARemover);
	}
	
}