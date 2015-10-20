package br.com.findpecas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="Cartao.findAll", query="SELECT c FROM Cartao c")
public class Cartao  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_cartao")
	private Integer codigo;

	private String descricao;

	@Column(name="qtd_max_parcelas")
	private int qtdMaxParcelas;

	@OneToOne
	@JoinColumn(name="cod_forma_pag")
	private FormaPagamento formaPagamento;

	public Cartao() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdMaxParcelas() {
		return this.qtdMaxParcelas;
	}

	public void setQtdMaxParcelas(int qtdMaxParcelas) {
		this.qtdMaxParcelas = qtdMaxParcelas;
	}

	public FormaPagamento getFormaPagamento() {
		return this.formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}