package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IFabricanteDAO;
import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.Usuario;

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
		return manager.createQuery("select f from Fabricante f").getResultList();
	}

	@Override
	public Fabricante buscarPorId(Integer id) {
		return manager.find(Fabricante.class, id);
	}

	@Override
	public void excluir(Fabricante fabricante) {}

	@Override
	public Fabricante buscarPorNome(String nome) {
		String consulta = "select f from Fabricante f where f.nome = :nome";
		TypedQuery<Fabricante> query =
		manager.createQuery(consulta, Fabricante.class);
		query.setParameter("nome", nome);
		
		Fabricante fabricante = query.getSingleResult();
		
		return fabricante;
	}

}
