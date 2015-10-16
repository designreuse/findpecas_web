package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.ICidadeDAO;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.Fabricante;

@Repository
public class JpaCidadeDAO implements ICidadeDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public Cidade buscarPorId(Integer id) {
		return manager.find(Cidade.class, id);
	}


	@Override
	public Cidade buscarPeloNome(String nome) {
		return null;
	}


	@Override
	public List<Cidade> buscarPorEstado(Estado estado) {
		return null;
	}


	@Override
	public List<Cidade> listarCidades() {
		return manager.createQuery("select u from Cidade u").getResultList();
	}




}
