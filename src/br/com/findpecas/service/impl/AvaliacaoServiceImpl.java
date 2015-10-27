package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IAvaliacaoDAO;
import br.com.findpecas.service.IAvaliacaoService;

@Service("avaliacaoServiceImpl")
@Transactional
public class AvaliacaoServiceImpl implements IAvaliacaoService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IAvaliacaoDAO avaliacaoDao;
	
	// MÉTODOS --------------------

}
