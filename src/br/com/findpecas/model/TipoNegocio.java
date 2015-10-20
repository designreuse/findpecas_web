package br.com.findpecas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_negocio")
@NamedQuery(name="TipoNegocio.findAll", query="SELECT t FROM TipoNegocio t")
public class TipoNegocio  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_tipo_negocio")
	private Integer codigo;

	private String descricao;

	@OneToMany(mappedBy="tipoNegocio")
	private List<Busca> buscas;

	@ManyToMany
	@JoinTable(
		name="tipo_negocio_empresa"
		, joinColumns={
			@JoinColumn(name="cod_tipo_negocio")
			}
		, inverseJoinColumns={
			@JoinColumn(name="cod_empresa")
			}
		)
	private List<Empresa> empresas;

	public TipoNegocio() {
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

	public List<Busca> getBuscas() {
		return this.buscas;
	}

	public void setBuscas(List<Busca> buscas) {
		this.buscas = buscas;
	}

	public Busca addBusca(Busca busca) {
		getBuscas().add(busca);
		busca.setTipoNegocio(this);

		return busca;
	}

	public Busca removeBusca(Busca busca) {
		getBuscas().remove(busca);
		busca.setTipoNegocio(null);

		return busca;
	}

	public List<Empresa> getEmpresas() {
		return this.empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

}