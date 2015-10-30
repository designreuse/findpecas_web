package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IModeloVeiculoDAO;
import br.com.findpecas.model.Fabricante;
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

	@Override
	public List<ModeloVeiculo> listarPorFabricante(Fabricante fabricante) {
		String consulta = "select m from ModeloVeiculo m where m.fabricante = :fabricante";
		TypedQuery<ModeloVeiculo> query =
		manager.createQuery(consulta, ModeloVeiculo.class);
		query.setParameter("fabricante", fabricante);
		
		List<ModeloVeiculo> modeloVeiculos = query.getResultList();
		
		return modeloVeiculos;
	}

	@Override
	public ModeloVeiculo buscarPorNome(String nome) {
		String consulta = "select m from ModeloVeiculo m where m.nome = :nome";
		TypedQuery<ModeloVeiculo> query =
		manager.createQuery(consulta, ModeloVeiculo.class);
		query.setParameter("nome", nome);
		
		ModeloVeiculo modeloVeiculo = query.getSingleResult();
		
		return modeloVeiculo;
	}

	@Override
	public List<ModeloVeiculo> buscarPorFabricante(Fabricante fabricante) {
		String consulta = "select m from ModeloVeiculo m where m.fabricante = :fabricante";
		TypedQuery<ModeloVeiculo> query =
		manager.createQuery(consulta, ModeloVeiculo.class);
		query.setParameter("fabricante", fabricante);
		
		List<ModeloVeiculo> modelosVeiculo = query.getResultList();
		
		return modelosVeiculo;
	}

}
