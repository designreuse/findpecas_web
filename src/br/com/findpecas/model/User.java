package br.com.findpecas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_user")
	private int codigo;

	private int active;

	private String login;

	private String password;

	private String validation;

	@OneToOne(mappedBy="user")
	private Empresa empresa;

	@ManyToMany
	@JoinTable(
		name="USER_PERMISSION"
		, joinColumns={
			@JoinColumn(name="cod_user")
			}
		, inverseJoinColumns={
			@JoinColumn(name="cod_permission")
			}
		)
	private List<Permission> permissions;

	@OneToMany(mappedBy="user")
	private List<Usuario> usuarios;

	public User() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getValidation() {
		return this.validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Permission> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setUser(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setUser(null);

		return usuario;
	}

}