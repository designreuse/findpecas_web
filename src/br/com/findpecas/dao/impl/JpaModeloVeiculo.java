package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IModeloVeiculoDAO;
import br.com.findpecas.model.ModeloVeiculo;

@Repository
public class JpaModeloVeiculo implements IModeloVeiculoDAO{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(ModeloVeiculo modeloVeiculo) {
		manager.persist(modeloVeiculo);
	}

	@Override
	public void editar(ModeloVeiculo modeloVeiculo) {
		manager.merge(modeloVeiculo);
	}

	@Override
	public List<ModeloVeiculo> listar() {
		return manager.createQuery("select u from ModeloVeiculo u").getResultList();
	}

	@Override
	public ModeloVeiculo buscarPorId(Integer id) {
		return manager.find(ModeloVeiculo.class, id);
	}

	@Override
	public void excluir(ModeloVeiculo modeloVeiculo) {}

}
