package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IFormaPagamentoDAO;
import br.com.findpecas.service.IFormaPagamentoService;

@Service("formaPagamentoServiceImpl")
@Transactional
public class FormaPagamentoService implements IFormaPagamentoService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IFormaPagamentoDAO formaPagamentoDao;
	
	// MÉTODOS --------------------
	
}
