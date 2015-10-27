package br.com.findpecas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IModeloVeiculoDAO;
import br.com.findpecas.model.Fabricante;
import br.com.findpecas.model.ModeloVeiculo;
import br.com.findpecas.service.IModeloVeiculoService;

@Service("modeloVeiculoServiceImpl")
@Transactional
public class ModeloVeiculoServiceImpl implements IModeloVeiculoService {

	@Autowired
	private IModeloVeiculoDAO modeloVeiculoDao;
	
	@Override
	public List<ModeloVeiculo> listarModeloVeiculos() {
		return modeloVeiculoDao.listar();
	}

	@Override
	public ModeloVeiculo buscarPorId(Integer id) {
		
		return modeloVeiculoDao.buscarPorId(id);
	}

	@Override
	public ModeloVeiculo buscarPorNome(String nome) {
		return modeloVeiculoDao.buscarPorNome(nome);
	}

	@Override
	public List<ModeloVeiculo> listarPorFabricante(Fabricante fabricante) {
		return modeloVeiculoDao.listarPorFabricante(fabricante);
	}

}
