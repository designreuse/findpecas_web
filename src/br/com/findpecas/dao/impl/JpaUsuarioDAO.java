package br.com.findpecas.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.findpecas.dao.IUsuarioDAO;
import br.com.findpecas.model.Cidade;
import br.com.findpecas.model.Estado;
import br.com.findpecas.model.Usuario;

@Repository
public class JpaUsuarioDAO implements IUsuarioDAO{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adicionar(Usuario usuario) {
		manager.persist(usuario);
	}

	@Override
	public void editar(Usuario usuario) {
		manager.merge(usuario);
	}

	@Override
	public List<Usuario> listar() {
		return manager.createQuery("select u from Usuario u").getResultList();
	}

	@Override
	public Usuario buscarPorId(Integer id) {
		return manager.find(Usuario.class, id);
	}

	@Override
	public void excluir(Usuario usuario) {
		Usuario usuarioARemover = buscarPorId(usuario.getCodigo());
	      manager.remove(usuarioARemover);
	}

	@Override
	public Usuario verificaSeExiste(String email, String senha) {		
		String consulta = "select u from Usuario u where u.email = :email and u.senha = :senha";
		TypedQuery<Usuario> query =
		manager.createQuery(consulta, Usuario.class);
		query.setParameter("email", email);
		query.setParameter("senha", senha);
		
		Usuario usuario = query.getSingleResult();
		
		return usuario;
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		String consulta = "select u from Usuario u where u.email = :email";
		TypedQuery<Usuario> query =
		manager.createQuery(consulta, Usuario.class);
		query.setParameter("email", email);
		
		Usuario usuario = query.getSingleResult();
		
		return usuario;
		
	}

	@Override
	public List<Usuario> listarUsuariosDesativados() {
		
		return null;
	}

	@Override
	public List<Usuario> listarUsuariosPorEstado(Estado estado) {
	
		return null;
	}

	@Override
	public List<Usuario> listarUsuariosPorRegiao(String regiao) {
		
		return null;
	}

	@Override
	public List<Usuario> listarUsuariosPorCidade(Cidade cidade) { 
		
		return null;
	}

	
	

}
