package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IBuscaDAO;
import br.com.findpecas.model.Busca;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.ModeloVeiculo;
import br.com.findpecas.model.MotivoExclusaoBusca;
import br.com.findpecas.model.TipoNegocio;
import br.com.findpecas.model.TipoVeiculo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

@Repository
public class JpaBuscaDAO implements IBuscaDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Busca busca) {
		manager.persist(busca);
	}

	@Override
	public void editar(Busca busca) {
		manager.merge(busca);
	}

	@Override
	public List<Busca> listar() {
		return manager.createQuery("select u from Busca u").getResultList();
	}

	@Override
	public Busca buscarPorId(Integer id) {
		return manager.find(Busca.class, id);
	}

	@Override
	public void excluir(Busca busca) {
		Busca buscaARemover = buscarPorId(busca.getCodigo());
	    manager.remove(buscaARemover);
	}

	@Override
	public List<Busca> listarBuscasPorEstado(Estado estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Busca> listarBuscasPorCidade(Cidade cidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Busca> listarBuscasPorRegiao(String regiao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Busca> listarBuscasPorTipoVeiculo(TipoVeiculo tipoVeiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Busca> listarBuscasPorTipoNegocio(TipoNegocio tipoNegocio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Busca> listarBuscasPorFabricanteVeiculo(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Busca> listarBuscasPorModeloVeiculo(ModeloVeiculo modeloVeiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Busca> listarBuscasPorMotivoExclusao(
			MotivoExclusaoBusca motivoExclusaoBusca) {
		// TODO Auto-generated method stub
		return null;
	}


}
