package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IEstadoDAO;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.Fabricante;

@Repository
public class JpaEstadoDAO implements IEstadoDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public Estado buscarPorId(Integer id) {
		
		return manager.find(Estado.class, id);
	}


	@Override
	public List<Estado> listarEstados() {
		return manager.createQuery("select u from Estado u").getResultList();
	}


	@Override
	public Estado buscarPeloNome(String nome) {
		return null;
	}


	@Override
	public List<Estado> buscarPorRegiao(String nome) {
		return null;
	}




}
