package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.ITipoVeiculoDAO;
import br.com.findpecas.model.TipoVeiculo;

@Repository
public class JpaTipoVeiculoDAO implements ITipoVeiculoDAO{

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(TipoVeiculo tipoVeiculo) {
		manager.persist(tipoVeiculo);
	}

	@Override
	public void editar(TipoVeiculo tipoVeiculo) {
		manager.merge(tipoVeiculo);
	}

	@Override
	public List<TipoVeiculo> listar() {
		return manager.createQuery("select u from TipoVeiculo u").getResultList();
	}

	@Override
	public TipoVeiculo buscarPorId(Integer id) {
		return manager.find(TipoVeiculo.class, id);
	}

	@Override
	public void excluir(TipoVeiculo tipoVeiculo) {}
}
