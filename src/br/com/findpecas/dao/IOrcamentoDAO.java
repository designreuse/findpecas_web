package br.com.findpecas.dao;

import java.util.List;

import br.com.findpecas.model.Empresa;
import br.com.findpecas.model.Orcamento;
import br.com.findpecas.model.Usuario;
import br.com.findpecas.model.Veiculo;

public interface IOrcamentoDAO extends IDAOGenerico<Orcamento> {
	
	List<Orcamento> listarOrcamentosPorEmpresa(Empresa empresa);
	List<Orcamento> listarOrcamentosPorVeiculo(Veiculo veiculo);
	List<Orcamento> listarOrcamentosAprovadosDoUsuario(Usuario usuario);
	List<Orcamento> listarOrcamentosAprovadosDaEmpresa(Empresa empresa);

}
