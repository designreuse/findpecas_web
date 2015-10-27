package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IPreCadastroEmpresaDAO;

@Service("preCadastroEmoresaServiceImpl")
@Transactional
public class PreCadastroEmpresaServiceImpl {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IPreCadastroEmpresaDAO preCadastroEmpresaDao;
	
	// MÉTODO --------------------

}
