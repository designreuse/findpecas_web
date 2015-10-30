package br.com.findpecas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.ICidadeDAO;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;
import br.com.findpecas.service.ICidadeService;

@Service("cidadeServiceImpl")
public class CidadeServiceImpl implements ICidadeService {
	// MÉTODOS --------------------
	
	@Autowired
	private ICidadeDAO cidadeDao;

	// MÉTODOS --------------------

	@Override
	public Cidade buscarPorId(Integer id) {
		return cidadeDao.buscarPorId(id);
	}

	@Override
	public Cidade buscarPeloNome(String nome) {
		return cidadeDao.buscarPeloNome(nome);
	}

	@Override
	public List<Cidade> buscarPorEstado(Estado estado) {
		return cidadeDao.buscarPorEstado(estado);
	}

	@Override
	public List<Cidade> listarCidades() {
		return cidadeDao.listarCidades();
	}

}
