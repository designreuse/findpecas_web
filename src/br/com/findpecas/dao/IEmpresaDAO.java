package br.com.findpecas.dao;

import br.com.findpecas.model.Empresa;

public interface IEmpresaDAO extends IDAOGenerico<Empresa> {
	Empresa buscarPorEmail(String email);
}
