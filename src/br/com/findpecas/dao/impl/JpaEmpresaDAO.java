package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IEmpresaDAO;
import br.com.findpecas.model.Avaliacao;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Empresa;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.TipoNegocio;
import br.com.findpecas.model.TipoVeiculo;
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
	public void excluir(Empresa empresa) {}

	@Override
	public Empresa buscarPorEmail(String email) {
		String consulta = "select e from Empresa e where e.email = :email";
		TypedQuery<Empresa> query =
		manager.createQuery(consulta, Empresa.class);
		query.setParameter("email", email);
		
		Empresa empresa = query.getSingleResult();
		
		return empresa;
		
	}

	@Override
	public List<Empresa> listarEmpresasPorEstado(Estado estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> listarEmpresasPorRegiao(String regiao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> listarEmpresasPorCidade(Cidade cidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> listarEmpresasPorTipoDeNegocio(TipoNegocio tipoNegocio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> listarEmpresasPorTipoDeVeiculo(TipoVeiculo tipoVeiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> listarEmpresasPorAvaliacao(Avaliacao avaliacao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> listarempresasDesativadas() {
		// TODO Auto-generated method stub
		return null;
	}



}
