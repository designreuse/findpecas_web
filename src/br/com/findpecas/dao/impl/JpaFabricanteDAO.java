package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IFabricanteDAO;
import br.com.findpecas.model.Fabricante;

@Repository
public class JpaFabricanteDAO implements IFabricanteDAO{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Fabricante fabricante) {
		manager.persist(fabricante);
	}

	@Override
	public void editar(Fabricante fabricante) {
		manager.merge(fabricante);
	}

	@Override
	public List<Fabricante> listar() {
		return manager.createQuery("select u from Fabricante u").getResultList();
	}

	@Override
	public Fabricante buscarPorId(Integer id) {
		return manager.find(Fabricante.class, id);
	}

	@Override
	public void excluir(Fabricante fabricante) {}

}
