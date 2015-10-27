package br.com.findpecas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.ITipoNegocioDAO;
import br.com.findpecas.model.TipoNegocio;
import br.com.findpecas.service.ITipoNegocioService;

@Service("tipoNegocioServiceImpl")
@Transactional
public class TipoNegocioServiceImpl implements ITipoNegocioService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private ITipoNegocioDAO tipoNegocioDao;
	
	// MÉTODOS --------------------
	
	@Override
	public List<TipoNegocio> listarTiposNegocio() {
		return tipoNegocioDao.listar();
	}

}
