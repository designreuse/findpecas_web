package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Busca;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.ModeloVeiculo;
import br.com.findpecas.model.MotivoExclusaoBusca;
import br.com.findpecas.model.TipoNegocio;
import br.com.findpecas.model.TipoVeiculo;

public interface IBuscaDAO extends IDAOGenerico<Busca> {
	
	List<Busca> listarBuscasPorEstado(Estado estado);
	List<Busca> listarBuscasPorCidade(Cidade cidade);
	List<Busca> listarBuscasPorRegiao(String regiao);
	List<Busca> listarBuscasPorTipoVeiculo(TipoVeiculo tipoVeiculo);
	List<Busca> listarBuscasPorTipoNegocio(TipoNegocio tipoNegocio);
	List<Busca> listarBuscasPorFabricanteVeiculo(Fabricante fabricante);
	List<Busca> listarBuscasPorModeloVeiculo(ModeloVeiculo modeloVeiculo);
	List<Busca> listarBuscasPorMotivoExclusao(MotivoExclusaoBusca motivoExclusaoBusca);
}
