package br.com.findpecas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="Orcamento.findAll", query="SELECT o FROM Orcamento o")
public class Orcamento  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_orcamento")
	private Integer codigo;

	private String detalhamento;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_publicacao")
	private Date dtPublicacao;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_ult_altr")
	private Date dtUltAltr;

	private String status;

	private BigDecimal valor;

	@ManyToOne
	@JoinColumn(name="cod_busca")
	private Busca busca;

	@ManyToOne
	@JoinColumn(name="cod_empresa")
	private Empresa empresa;

	public Orcamento() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDetalhamento() {
		return this.detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public Date getDtPublicacao() {
		return this.dtPublicacao;
	}

	public void setDtPublicacao(Date dtPublicacao) {
		this.dtPublicacao = dtPublicacao;
	}

	public Date getDtUltAltr() {
		return this.dtUltAltr;
	}

	public void setDtUltAltr(Date dtUltAltr) {
		this.dtUltAltr = dtUltAltr;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Busca getBusca() {
		return this.busca;
	}

	public void setBusca(Busca busca) {
		this.busca = busca;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}