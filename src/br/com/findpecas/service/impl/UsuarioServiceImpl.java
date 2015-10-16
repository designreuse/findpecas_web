package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IUsuarioDAO;
import br.com.findpecas.model.Usuario;
import br.com.findpecas.service.IUsuarioService;

@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@Override
	public Usuario getByEmail(String email) {
		return usuarioDao.buscarPorEmail(email);
	}

}
