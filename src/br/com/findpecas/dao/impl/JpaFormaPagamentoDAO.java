package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.findpecas.dao.IFormaPagamentoDAO;
import br.com.findpecas.model.Cartao;
import br.com.findpecas.model.FormaPagamento;

public class JpaFormaPagamentoDAO implements IFormaPagamentoDAO{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(FormaPagamento formaPagamento) {
		manager.persist(formaPagamento);
	}

	@Override
	public void editar(FormaPagamento formaPagamento) {
		manager.merge(formaPagamento);
	}

	@Override
	public List<FormaPagamento> listar() {
		return manager.createQuery("select f from FormaPagamento f").getResultList();
	}

	@Override
	public FormaPagamento buscarPorId(Integer id) {
		return manager.find(FormaPagamento.class, id);
	}

	@Override
	public void excluir(FormaPagamento formaPagamento) {
		FormaPagamento formaPagamentoARemover = buscarPorId(formaPagamento.getCodigo());
	    manager.remove(formaPagamentoARemover);
	}

}
