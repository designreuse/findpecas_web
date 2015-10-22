package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IOrcamentoDAO;
import br.com.findpecas.model.Empresa;
import br.com.findpecas.model.Orcamento;
import br.com.findpecas.model.Usuario;
import br.com.findpecas.model.Veiculo;

@Repository
public class JpaOrcamentoDAO implements  IOrcamentoDAO{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Orcamento orcamento) {
		manager.persist(orcamento);
	}

	@Override
	public void editar(Orcamento orcamento) {
		manager.merge(orcamento);
	}

	@Override
	public List<Orcamento> listar() {
		return manager.createQuery("select u from Orcamento u").getResultList();
	}

	@Override
	public Orcamento buscarPorId(Integer id) {
		return manager.find(Orcamento.class, id);
	}

	@Override
	public void excluir(Orcamento orcamento) {}

	@Override
	public List<Orcamento> listarOrcamentosPorEmpresa(Empresa empresa) {
		
		return null;
	}

	@Override
	public List<Orcamento> listarOrcamentosPorVeiculo(Veiculo veiculo) {

		return null;
	}

	@Override
	public List<Orcamento> listarOrcamentosAprovadosDoUsuario(Usuario usuario) {
		
		return null;
	}

	@Override
	public List<Orcamento> listarOrcamentosAprovadosDaEmpresa(Empresa empresa) {
		
		return null;
	}

	

}
