package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.ICidadeDAO;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;

@Repository
public class JpaCidadeDAO implements ICidadeDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public Cidade buscarPorId(Integer id) {
		return manager.find(Cidade.class, id);
	}


	@Override
	public Cidade buscarPeloNome(String nome) {
		String consulta = "select c from Cidade c where c.nome = :nome";
		TypedQuery<Cidade> query =
				manager.createQuery(consulta, Cidade.class);
				query.setParameter("cidade", nome);
				
		Cidade cidade = query.getSingleResult();
		return cidade;
	}


	@Override
	public List<Cidade> buscarPorEstado(Estado estado) {
		String consulta = "select c from Cidade c where c.estado = :estado";
		TypedQuery<Cidade> query = manager.createQuery(consulta, Cidade.class);
				query.setParameter("estado", estado);
				
		List<Cidade> cidades = query.getResultList();
		
		return cidades;
	}


	@Override
	public List<Cidade> listarCidades() {
		return manager.createQuery("select c from Cidade c").getResultList();
	}




}
