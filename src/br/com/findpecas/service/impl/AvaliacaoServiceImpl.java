package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IAvaliacaoDAO;
import br.com.findpecas.service.IAvaliacaoService;

@Service("avaliacaoServiceImpl")
public class AvaliacaoServiceImpl implements IAvaliacaoService {
	
	@Autowired
	private IAvaliacaoDAO avaliacaoDao;

}
