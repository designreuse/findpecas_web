package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IBuscaDAO;
import br.com.findpecas.model.Busca;
import br.com.findpecas.service.IBuscaService;

@Service("buscaServiceImpl")
@Transactional
public class BuscaServiceImpl implements IBuscaService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IBuscaDAO buscaDao;

	// MÉTODOS --------------------
	
	@Override
	public void adicionar(Busca busca) {
		
	}

	@Override
	public void editar(Busca busca) {
		
	}

	@Override
	public Busca buscarPorId(Integer id) {
		
		return null;
	}

	@Override
	public void excluir(Busca busca) {
		
	}

}
