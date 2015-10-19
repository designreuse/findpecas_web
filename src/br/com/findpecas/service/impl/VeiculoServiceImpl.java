package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IVeiculoDAO;
import br.com.findpecas.service.IVeiculoService;

@Service("veiculoServiceImpl")
public class VeiculoServiceImpl implements IVeiculoService {

	@Autowired
	private IVeiculoDAO veiculoDao;
}
