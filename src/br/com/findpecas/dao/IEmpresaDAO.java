package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Avaliacao;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Empresa;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.TipoNegocio;
import br.com.findpecas.model.TipoVeiculo;

public interface IEmpresaDAO extends IDAOGenerico<Empresa> {
	
	Empresa buscarPorEmail(String email);
	List<Empresa> listarEmpresasPorEstado(Estado estado);
	List<Empresa> listarEmpresasPorRegiao(String regiao);
	List<Empresa> listarEmpresasPorCidade(Cidade cidade);
	List<Empresa> listarEmpresasPorTipoDeNegocio(TipoNegocio tipoNegocio);
	List<Empresa> listarEmpresasPorTipoDeVeiculo(TipoVeiculo tipoVeiculo);
	List<Empresa> listarEmpresasPorAvaliacao(Avaliacao avaliacao);
	List<Empresa> listarempresasDesativadas();
}
