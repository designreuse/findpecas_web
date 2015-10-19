package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IMotivoExclusaoBusca;
import br.com.findpecas.model.MotivoExclusaoBusca;

@Repository
public class JpaMotivoExclusaoBusca implements IMotivoExclusaoBusca{
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(MotivoExclusaoBusca motivoExclusaoBusca) {
		manager.persist(motivoExclusaoBusca);
	}

	@Override
	public void editar(MotivoExclusaoBusca motivoExclusaoBusca) {
		manager.merge(motivoExclusaoBusca);
	}

	@Override
	public List<MotivoExclusaoBusca> listar() {
		return manager.createQuery("select u from MotivoExclusaoBusca u").getResultList();
	}

	@Override
	public MotivoExclusaoBusca buscarPorId(Integer id) {
		return manager.find(MotivoExclusaoBusca.class, id);
	}

	@Override
	public void excluir(MotivoExclusaoBusca motivoExclusaoBusca) {}
}
