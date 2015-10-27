package br.com.findpecas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IFabricanteDAO;
import br.com.findpecas.model.Fabricante;
import br.com.findpecas.service.IFabricanteService;

@Transactional
@Service("fabricanteServiceImpl")
public class FabricanteServiceImpl implements IFabricanteService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IFabricanteDAO fabricanteDao;
	
	// MÉTODOS --------------------

	/**
	 * 
	 */
	@Override
	public List<Fabricante> listarFabricantes() {
		return fabricanteDao.listar();
	}

	/**
	 * 
	 */
	@Override
	public Fabricante buscarPorId(Integer id) {
		return fabricanteDao.buscarPorId(id);
	}

	/**
	 * 
	 */
	@Override
	public Fabricante buscarPorNome(String nome) {
		return fabricanteDao.buscarPorNome(nome);
	}

}
