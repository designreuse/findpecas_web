package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IOrcamentoDAO;
import br.com.findpecas.service.IOrcamentoService;

@Service("orcamentoServiceImpl")
@Transactional
public class OrcamentoServiceImpl implements IOrcamentoService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IOrcamentoDAO orcamentoDao;
	
	// M�TODOS --------------------

}
