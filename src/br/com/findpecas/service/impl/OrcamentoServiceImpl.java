package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IOrcamentoDAO;
import br.com.findpecas.service.IOrcamentoService;

@Service("orcamentoServiceImpl")
public class OrcamentoServiceImpl implements IOrcamentoService {
	
	@Autowired
	private IOrcamentoDAO orcamentoDao;

}
