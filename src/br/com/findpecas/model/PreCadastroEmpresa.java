package br.com.findpecas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pre_cadastro_empresa")
@NamedQuery(name="PreCadastroEmpresa.findAll", query="SELECT p FROM PreCadastroEmpresa p")
public class PreCadastroEmpresa  {

	@Id
	@Column(name="cod_pre_cadastro_empresa")
	private Integer codigo;

	private String contato;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_pre_cadastro")
	private Date dtPreCadastro;

	private String email;

	@Column(name="nome_contato")
	private String nomeContato;

	@Column(name="nome_empresa")
	private String nomeEmpresa;

	@ManyToOne
	@JoinColumn(name="cod_cidade")
	private Cidade cidade;

	public PreCadastroEmpresa() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Date getDtPreCadastro() {
		return this.dtPreCadastro;
	}

	public void setDtPreCadastro(Date dtPreCadastro) {
		this.dtPreCadastro = dtPreCadastro;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeContato() {
		return this.nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getNomeEmpresa() {
		return this.nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}