package br.com.findpecas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.ITipoVeiculoDAO;
import br.com.findpecas.model.TipoVeiculo;
import br.com.findpecas.service.ITipoVeiculoService;

@Service("tipoVeiculoServiceImpl")
@Transactional
public class TipoVeiculoServiceImpl implements ITipoVeiculoService {

	@Autowired
	private ITipoVeiculoDAO tipoVeiculoDao;
	
	@Override
	public void adicionar(TipoVeiculo tipoVeiculo) {
		tipoVeiculoDao.adicionar(tipoVeiculo);
	}

	@Override
	public void editar(TipoVeiculo tipoVeiculo) {
		tipoVeiculoDao.editar(tipoVeiculo);
		
	}

	@Override
	public List<TipoVeiculo> listar() {
		return tipoVeiculoDao.listar();
	}

	@Override
	public TipoVeiculo buscarPorId(Integer id) {
		return tipoVeiculoDao.buscarPorId(id);
	}

	@Override
	public void excluir(TipoVeiculo tipoVeiculo) {
		tipoVeiculoDao.excluir(tipoVeiculo);
	}

}
