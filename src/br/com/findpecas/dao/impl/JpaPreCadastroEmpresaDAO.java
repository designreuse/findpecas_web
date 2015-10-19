package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IPreCadastroEmpresaDAO;
import br.com.findpecas.model.Busca;
import br.com.findpecas.model.PreCadastroEmpresa;

@Repository
public class JpaPreCadastroEmpresaDAO implements IPreCadastroEmpresaDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(PreCadastroEmpresa preCadastroEmpresa) {
		manager.persist(preCadastroEmpresa);
	}

	@Override
	public void editar(PreCadastroEmpresa preCadastroEmpresa) {
		manager.merge(preCadastroEmpresa);
	}

	@Override
	public List<PreCadastroEmpresa> listar() {
		return manager.createQuery("select u from PreCadastroEmpresa u").getResultList();
	}

	@Override
	public PreCadastroEmpresa buscarPorId(Integer id) {
		return manager.find(PreCadastroEmpresa.class, id);
	}

	@Override
	public void excluir(PreCadastroEmpresa preCadastroEmpresa) {
		PreCadastroEmpresa preCadastroEmpresaARemover = buscarPorId(preCadastroEmpresa.getCodigo());
	    manager.remove(preCadastroEmpresaARemover);
	}

}
