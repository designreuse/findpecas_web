package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IEmpresaDAO;
import br.com.findpecas.dao.IUsuarioDAO;
import br.com.findpecas.model.Empresa;
import br.com.findpecas.model.Usuario;
import br.com.findpecas.service.IEmpresaService;
import br.com.findpecas.service.IUsuarioService;

@Service("empresaServiceImpl")
@Transactional
public class EmpresaServiceImpl implements IEmpresaService{
	// ATRIBUTOS ------------------
	
	@Autowired
	private IEmpresaDAO empresaDao;
	
	// MÉTODOS --------------------
	
	@Override
	public Empresa getByEmail(String email) {
		return empresaDao.buscarPorEmail(email);
	}

}
