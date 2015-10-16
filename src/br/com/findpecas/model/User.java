package br.com.findpecas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User  {

	@Id
	private Integer id;

	private int active;

	private String login;

	private String password;

	private String validation;

	@OneToOne(mappedBy="user")
	private Empresa empresa;

	@OneToMany(mappedBy="user")
	private List<UserPermission> userPermissions;

	@OneToOne(mappedBy="user")
	private Usuario usuario;

	public User() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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


	public List<UserPermission> getUserPermissions() {
		return this.userPermissions;
	}

	public void setUserPermissions(List<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}

	public UserPermission addUserPermission(UserPermission userPermission) {
		getUserPermissions().add(userPermission);
		userPermission.setUser(this);

		return userPermission;
	}

	public UserPermission removeUserPermission(UserPermission userPermission) {
		getUserPermissions().remove(userPermission);
		userPermission.setUser(null);

		return userPermission;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}