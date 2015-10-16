package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;





import br.com.findpecas.dao.IAvaliacaoDAO;
import br.com.findpecas.model.Avaliacao;

@Repository
public class JpaAvaliacaoDAO implements IAvaliacaoDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Avaliacao avaliacao) {
		manager.persist(avaliacao);
	}

	@Override
	public void editar(Avaliacao avaliacao) {
		manager.merge(avaliacao);
	}

	@Override
	public List<Avaliacao> listar() {
		return manager.createQuery("select u from Avaliacao u").getResultList();
	}

	@Override
	public Avaliacao buscarPorId(Integer id) {
		return manager.find(Avaliacao.class, id);
	}

	@Override
	public void excluir(Avaliacao avaliacao) {
	//	Avaliacao avaliacaoARemover = buscarPorId(avaliacao.getCodigo());
	//      manager.remove(avaliacaoARemover);
	}

}
