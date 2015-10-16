package br.com.findpecas.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user_permission")
@NamedQuery(name="UserPermission.findAll", query="SELECT u FROM UserPermission u")
public class UserPermission  {

	private String permission;

	@ManyToOne
	@JoinColumn(name="id")
	private User user;

	public UserPermission() {
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}