package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.ILogomarcaDAO;
import br.com.findpecas.service.ILogomarcaService;

@Service("logomarcaServiceImpl")
public class LogomarcaService implements ILogomarcaService {

	@Autowired
	private ILogomarcaDAO logomarcaDao;
}
