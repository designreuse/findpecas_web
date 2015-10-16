package br.com.findpecas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="motivo_exclusao_busca")
@NamedQuery(name="MotivoExclusaoBusca.findAll", query="SELECT m FROM MotivoExclusaoBusca m")
public class MotivoExclusaoBusca  {

	@Id
	@Column(name="cod_mot_excl_busca")
	private Integer codigo;

	private String descricao;

	@Column(name="qtd_dias")
	private int qtdDias;

	@ManyToOne
	@JoinColumn(name="cod_busca")
	private Busca busca;

	public MotivoExclusaoBusca() {
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

	public int getQtdDias() {
		return this.qtdDias;
	}

	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}

	public Busca getBusca() {
		return this.busca;
	}

	public void setBusca(Busca busca) {
		this.busca = busca;
	}

}