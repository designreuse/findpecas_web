package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.ICartaoDAO;
import br.com.findpecas.model.Cartao;
import br.com.findpecas.model.Logomarca;

@Repository
public class JpaCartaoDAO implements ICartaoDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Cartao cartao) {
		manager.persist(cartao);
	}

	@Override
	public void editar(Cartao cartao) {
		manager.merge(cartao);
	}

	@Override
	public List<Cartao> listar() {
		return manager.createQuery("select c from Cartao c").getResultList();
	}

	@Override
	public Cartao buscarPorId(Integer id) {
		return manager.find(Cartao.class, id);
	}

	@Override
	public void excluir(Cartao cartao) {
		Cartao cartaoARemover = buscarPorId(cartao.getCodigo());
	    manager.remove(cartaoARemover);
	}

}
