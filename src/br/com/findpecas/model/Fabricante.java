package br.com.findpecas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Fabricante.findAll", query="SELECT f FROM Fabricante f")
public class Fabricante  {

	@Id
	@Column(name="cod_fabricante")
	private Integer codigo;

	private String nome;

	@ManyToMany
	@JoinTable(
		name="fabricante_tipo_veiculo"
		, joinColumns={
			@JoinColumn(name="cod_fabricante")
			}
		, inverseJoinColumns={
			@JoinColumn(name="cod_tipo_veiculo")
			}
		)
	private List<TipoVeiculo> tipoVeiculos;

	@OneToMany(mappedBy="fabricante")
	private List<ModeloVeiculo> modeloVeiculos;

	public Fabricante() {
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

	public List<TipoVeiculo> getTipoVeiculos() {
		return this.tipoVeiculos;
	}

	public void setTipoVeiculos(List<TipoVeiculo> tipoVeiculos) {
		this.tipoVeiculos = tipoVeiculos;
	}

	public List<ModeloVeiculo> getModeloVeiculos() {
		return this.modeloVeiculos;
	}

	public void setModeloVeiculos(List<ModeloVeiculo> modeloVeiculos) {
		this.modeloVeiculos = modeloVeiculos;
	}

	public ModeloVeiculo addModeloVeiculo(ModeloVeiculo modeloVeiculo) {
		getModeloVeiculos().add(modeloVeiculo);
		modeloVeiculo.setFabricante(this);

		return modeloVeiculo;
	}

	public ModeloVeiculo removeModeloVeiculo(ModeloVeiculo modeloVeiculo) {
		getModeloVeiculos().remove(modeloVeiculo);
		modeloVeiculo.setFabricante(null);

		return modeloVeiculo;
	}

}