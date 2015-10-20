package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.ILogomarcaDAO;
import br.com.findpecas.model.Logomarca;
import br.com.findpecas.model.Veiculo;

@Repository
public class JpaLogomarcaDAO implements ILogomarcaDAO {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Logomarca logomarca) {
		manager.persist(logomarca);
	}

	@Override
	public void editar(Logomarca logomarca) {
		manager.merge(logomarca);
	}

	@Override
	public List<Logomarca> listar() {
		return manager.createQuery("select u from Logomarca u").getResultList();
	}

	@Override
	public Logomarca buscarPorId(Integer id) {
		return manager.find(Logomarca.class, id);
	}

	@Override
	public void excluir(Logomarca logomarca) {
		Logomarca logomarcaARemover = buscarPorId(logomarca.getCodigo());
	    manager.remove(logomarcaARemover);
	}
}
