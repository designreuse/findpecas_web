package br.com.findpecas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IUsuarioDAO;
import br.com.findpecas.model.Usuario;
import br.com.findpecas.service.IUsuarioService;

@Service("usuarioServiceImpl")
@Transactional
public class UsuarioServiceImpl implements IUsuarioService{
	// ATRIBUTOS ------------------
	
	@Autowired
	private IUsuarioDAO usuarioDao;
	
	// MÉTODOS ------------------
	
	@Override
	public Usuario buscarPorEmail(String email) {
		return usuarioDao.buscarPorEmail(email);
	}


	@Override
	public void adicionar(Usuario usuario) {
	
		
	}

	@Override
	public void editar(Usuario usuario) {

		
	}

	@Override
	public Usuario buscarPorId(Integer id) {
		
		return null;
	}

	@Override
	public void excluir(Usuario usuario) {
		
		
	}

	@Override
	public List<Usuario> listar() {
		
		return null;
	}


	@Override
	public List<Usuario> listarUsuariosDesativados() {
		
		return null;
	}



}
