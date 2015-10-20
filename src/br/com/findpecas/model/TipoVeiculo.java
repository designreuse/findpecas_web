package br.com.findpecas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_veiculo")
@NamedQuery(name="TipoVeiculo.findAll", query="SELECT t FROM TipoVeiculo t")
public class TipoVeiculo  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_tipo_veiculo")
	private Integer codigo;

	private String descricao;

	@ManyToMany(mappedBy="tipoVeiculos")
	private List<Empresa> empresas;

	@ManyToMany(mappedBy="tipoVeiculos")
	private List<Fabricante> fabricantes;

	@OneToMany(mappedBy="tipoVeiculo")
	private List<Veiculo> veiculos;

	public TipoVeiculo() {
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

	public List<Empresa> getEmpresas() {
		return this.empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Fabricante> getFabricantes() {
		return this.fabricantes;
	}

	public void setFabricantes(List<Fabricante> fabricantes) {
		this.fabricantes = fabricantes;
	}

	public List<Veiculo> getVeiculos() {
		return this.veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Veiculo addVeiculo(Veiculo veiculo) {
		getVeiculos().add(veiculo);
		veiculo.setTipoVeiculo(this);

		return veiculo;
	}

	public Veiculo removeVeiculo(Veiculo veiculo) {
		getVeiculos().remove(veiculo);
		veiculo.setTipoVeiculo(null);

		return veiculo;
	}

}