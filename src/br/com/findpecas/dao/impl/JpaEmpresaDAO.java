package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IEmpresaDAO;
import br.com.findpecas.model.Empresa;
import br.com.findpecas.model.Usuario;

@Repository
public class JpaEmpresaDAO implements IEmpresaDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Empresa empresa) {
		manager.persist(empresa);
	}

	@Override
	public void editar(Empresa empresa) {
		manager.merge(empresa);
	}

	@Override
	public List<Empresa> listar() {
		return manager.createQuery("select u from Empresa u").getResultList();
	}

	@Override
	public Empresa buscarPorId(Integer id) {
		return manager.find(Empresa.class, id);
	}

	@Override
	public void excluir(Empresa empresa) {
		//Empresa empresaARemover = buscarPorId(empresa.getCodigo());
	      //manager.remove(empresaARemover);
	}

	@Override
	public Empresa buscarPorEmail(String email) {
		String consulta = "select e from Empresa e where e.email = :email";
		TypedQuery<Empresa> query =
		manager.createQuery(consulta, Empresa.class);
		query.setParameter("email", email);
		
		Empresa empresa = query.getSingleResult();
		
		return empresa;
		
	}

}
