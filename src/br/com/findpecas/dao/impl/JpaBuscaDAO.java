package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IBuscaDAO;
import br.com.findpecas.model.Busca;

@Repository
public class JpaBuscaDAO implements IBuscaDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Busca busca) {
		manager.persist(busca);
	}

	@Override
	public void editar(Busca busca) {
		manager.merge(busca);
	}

	@Override
	public List<Busca> listar() {
		return manager.createQuery("select u from Busca u").getResultList();
	}

	@Override
	public Busca buscarPorId(Integer id) {
		return manager.find(Busca.class, id);
	}

	@Override
	public void excluir(Busca busca) {
	//	Busca buscaARemover = buscarPorId(busca.getCodigo());
	  //    manager.remove(buscaARemover);
	}

}
