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
@NamedQuery(name="Contato.findAll", query="SELECT c FROM Contato c")
public class Contato  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_contato")
	private Integer codigo;

	private String numero;

	@ManyToOne
	@JoinColumn(name="cod_empresa")
	private Empresa empresa;

	public Contato() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}