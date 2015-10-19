package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IBuscaDAO;
import br.com.findpecas.service.IBuscaService;

@Service("buscaServiceImpl")
public class BuscaServiceImpl implements IBuscaService {
	
	@Autowired
	private IBuscaDAO buscaDao;

}
