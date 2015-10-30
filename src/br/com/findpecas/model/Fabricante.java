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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@NamedQuery(name="Fabricante.findAll", query="SELECT f FROM Fabricante f")
public class Fabricante  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_fabricante")
	private Integer codigo;

	private String nome;

	@ManyToMany
	@JoinTable(
		name="FABRICANTE_TIPO_VEICULO"
		, joinColumns={
			@JoinColumn(name="cod_fabricante")
			}
		, inverseJoinColumns={
			@JoinColumn(name="cod_tipo_veiculo")
			}
		)
	@JsonManagedReference
	private List<TipoVeiculo> tipoVeiculos;

	@OneToMany(mappedBy="fabricante")
	@JsonManagedReference
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

	@JsonIgnore
	public List<TipoVeiculo> getTipoVeiculos() {
		return this.tipoVeiculos;
	}

	public void setTipoVeiculos(List<TipoVeiculo> tipoVeiculos) {
		this.tipoVeiculos = tipoVeiculos;
	}

	@JsonIgnore
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