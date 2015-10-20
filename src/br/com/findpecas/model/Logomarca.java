package br.com.findpecas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="Logomarca.findAll", query="SELECT l FROM Logomarca l")
public class Logomarca  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_logomarca")
	private Integer codigo;

	@Lob
	private byte[] imagem;

	@OneToOne
	@JoinColumn(name="cod_empresa")
	private Empresa empresa;

	public Logomarca() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public byte[] getImagem() {
		return this.imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}