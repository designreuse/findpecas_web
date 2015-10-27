package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.ILogomarcaDAO;
import br.com.findpecas.service.ILogomarcaService;

@Service("logomarcaServiceImpl")
@Transactional
public class LogomarcaService implements ILogomarcaService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private ILogomarcaDAO logomarcaDao;
	
	// MÉTODOS --------------------
}
