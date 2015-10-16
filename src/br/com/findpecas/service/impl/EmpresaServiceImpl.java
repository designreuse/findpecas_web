package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IEmpresaDAO;
import br.com.findpecas.dao.IUsuarioDAO;
import br.com.findpecas.model.Empresa;
import br.com.findpecas.model.Usuario;
import br.com.findpecas.service.IEmpresaService;
import br.com.findpecas.service.IUsuarioService;

@Service("empresaServiceImpl")
public class EmpresaServiceImpl implements IEmpresaService{

	@Autowired
	private IEmpresaDAO empresaDao;
	
	@Override
	public Empresa getByEmail(String email) {
		return empresaDao.buscarPorEmail(email);
	}

}
