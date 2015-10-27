package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.ICartaoDAO;
import br.com.findpecas.service.ICartaoService;

@Service("cartaoServiceImpl")
@Transactional
public class CartaoService implements ICartaoService {

	@Autowired
	private ICartaoDAO cartaoDao;
	
}
