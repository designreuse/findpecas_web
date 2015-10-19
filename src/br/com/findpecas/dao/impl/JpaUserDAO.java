package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.findpecas.dao.IUserDAO;
import br.com.findpecas.model.FormaPagamento;
import br.com.findpecas.model.User;

public class JpaUserDAO implements IUserDAO{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(User user) {
		manager.persist(user);
	}

	@Override
	public void editar(User user) {
		manager.merge(user);
	}

	@Override
	public List<User> listar() {
		return manager.createQuery("select u from User u").getResultList();
	}

	@Override
	public User buscarPorId(Integer id) {
		return manager.find(User.class, id);
	}

	@Override
	public void excluir(User user) {
		User userARemover = buscarPorId(user.getId());
	    manager.remove(userARemover);
	}

}
