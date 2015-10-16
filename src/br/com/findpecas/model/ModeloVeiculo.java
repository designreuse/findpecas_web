package br.com.findpecas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="modelo_veiculo")
@NamedQuery(name="ModeloVeiculo.findAll", query="SELECT m FROM ModeloVeiculo m")
public class ModeloVeiculo  {

	@Id
	@Column(name="cod_modelo_veiculo")
	private Integer codigo;

	private String nome;

	@ManyToOne
	@JoinColumn(name="cod_fabricante")
	private Fabricante fabricante;

	@OneToMany(mappedBy="modeloVeiculo")
	private List<Veiculo> veiculos;

	public ModeloVeiculo() {
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

	public Fabricante getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public List<Veiculo> getVeiculos() {
		return this.veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Veiculo addVeiculo(Veiculo veiculo) {
		getVeiculos().add(veiculo);
		veiculo.setModeloVeiculo(this);

		return veiculo;
	}

	public Veiculo removeVeiculo(Veiculo veiculo) {
		getVeiculos().remove(veiculo);
		veiculo.setModeloVeiculo(null);

		return veiculo;
	}

}