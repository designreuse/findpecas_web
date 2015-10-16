package br.com.findpecas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Avaliacao.findAll", query="SELECT a FROM Avaliacao a")
public class Avaliacao  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_avaliacao")
	private Integer codigo;

	private String observacao;

	@Column(name="valor_avaliacao")
	private String valorAvaliacao;

	@ManyToOne
	@JoinColumn(name="cod_empresa")
	private Empresa empresa;

	@ManyToOne
	@JoinColumn(name="cod_usuario")
	private Usuario usuario;

	public Avaliacao() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getValorAvaliacao() {
		return this.valorAvaliacao;
	}

	public void setValorAvaliacao(String valorAvaliacao) {
		this.valorAvaliacao = valorAvaliacao;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}