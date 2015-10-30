package br.com.findpecas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IEstadoDAO;
import br.com.findpecas.model.Estado;
import br.com.findpecas.service.IEstadoService;

@Service("estadoServiceImpl")
public class EstadoServiceImpl implements IEstadoService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IEstadoDAO estadoDao;

	// MÉTODOS --------------------
	
	@Override
	public List<Estado> listarEstados() {
		return estadoDao.listarEstados();
	}

	@Override
	public Estado buscarPorId(Integer id) {
		return estadoDao.buscarPorId(id);
	}

	@Override
	public Estado buscarPeloNome(String nome) {
		return estadoDao.buscarPeloNome(nome);
	}

	@Override
	public List<Estado> buscarPorRegiao(String regiao) {
		return estadoDao.buscarPorRegiao(regiao);
	}
	
}
