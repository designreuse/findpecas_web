package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.ITipoNegocioDAO;
import br.com.findpecas.model.TipoNegocio;

@Repository
public class JpaTipoNegocioDAO implements ITipoNegocioDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(TipoNegocio tipoNegocio) {
		manager.persist(tipoNegocio);
	}

	@Override
	public void editar(TipoNegocio tipoNegocio) {
		manager.merge(tipoNegocio);
	}

	@Override
	public List<TipoNegocio> listar() {
		return manager.createQuery("select t from TipoNegocio t").getResultList();
	}

	@Override
	public TipoNegocio buscarPorId(Integer id) {
		return manager.find(TipoNegocio.class, id);
	}

	@Override
	public void excluir(TipoNegocio tipoNegocio) {}

}
