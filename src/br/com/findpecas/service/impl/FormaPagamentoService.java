package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IFormaPagamentoDAO;
import br.com.findpecas.service.IFormaPagamentoService;

@Service("formaPagamentoServiceImpl")
public class FormaPagamentoService implements IFormaPagamentoService {

	@Autowired
	private IFormaPagamentoDAO formaPagamentoDao;
}
