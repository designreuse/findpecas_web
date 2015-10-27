package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IVeiculoDAO;
import br.com.findpecas.service.IVeiculoService;

@Service("veiculoServiceImpl")
@Transactional
public class VeiculoServiceImpl implements IVeiculoService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IVeiculoDAO veiculoDao;
	
	// MÉTODOS --------------------
	
}
