package br.com.findpecas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Cidade.findAll", query="SELECT c FROM Cidade c")
public class Cidade  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_cidade")
	private Integer codigo;

	private String nome;

	private String uf;

	@ManyToOne
	@JoinColumn(name="cod_estado")
	private Estado estado;

	@OneToMany(mappedBy="cidade")
	private List<Endereco> enderecos;

	@OneToMany(mappedBy="cidade")
	private List<PreCadastroEmpresa> preCadastroEmpresas;

	@OneToMany(mappedBy="cidade")
	private List<Usuario> usuarios;

	public Cidade() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Endereco> getEnderecos() {
		return this.enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Endereco addEndereco(Endereco endereco) {
		getEnderecos().add(endereco);
		endereco.setCidade(this);

		return endereco;
	}

	public Endereco removeEndereco(Endereco endereco) {
		getEnderecos().remove(endereco);
		endereco.setCidade(null);

		return endereco;
	}

	public List<PreCadastroEmpresa> getPreCadastroEmpresas() {
		return this.preCadastroEmpresas;
	}

	public void setPreCadastroEmpresas(List<PreCadastroEmpresa> preCadastroEmpresas) {
		this.preCadastroEmpresas = preCadastroEmpresas;
	}

	public PreCadastroEmpresa addPreCadastroEmpresa(PreCadastroEmpresa preCadastroEmpresa) {
		getPreCadastroEmpresas().add(preCadastroEmpresa);
		preCadastroEmpresa.setCidade(this);

		return preCadastroEmpresa;
	}

	public PreCadastroEmpresa removePreCadastroEmpresa(PreCadastroEmpresa preCadastroEmpresa) {
		getPreCadastroEmpresas().remove(preCadastroEmpresa);
		preCadastroEmpresa.setCidade(null);

		return preCadastroEmpresa;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setCidade(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setCidade(null);

		return usuario;
	}

}