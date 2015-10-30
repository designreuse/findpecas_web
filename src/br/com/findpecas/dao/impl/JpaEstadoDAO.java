package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IEstadoDAO;
import br.com.findpecas.model.Estado;

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
		String consulta = "select e from Estado e where e.nome = :nome";
		TypedQuery<Estado> query =
				manager.createQuery(consulta, Estado.class);
				query.setParameter("cidade", nome);
				
		Estado estado = query.getSingleResult();
		return estado;
	}


	@Override
	public List<Estado> buscarPorRegiao(String regiao) {
		String consulta = "select e from Estado e where e.regiao = :regiao";
		TypedQuery<Estado> query = manager.createQuery(consulta, Estado.class);
				query.setParameter("regiao", regiao);
				
		List<Estado> estados = query.getResultList();
		
		return estados;
	}




}
