package br.com.findpecas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Veiculo.findAll", query="SELECT v FROM Veiculo v")
public class Veiculo  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_veiculo")
	private Integer codigo;

	@Column(name="ano_veiculo")
	private int ano;

	@OneToMany(mappedBy="veiculo")
	private List<Busca> buscas;

	@ManyToOne
	@JoinColumn(name="cod_tipo_veiculo")
	private TipoVeiculo tipoVeiculo;

	@ManyToOne
	@JoinColumn(name="cod_modelo_veiculo")
	private ModeloVeiculo modeloVeiculo;

	@ManyToOne
	@JoinColumn(name="cod_usuario")
	private Usuario usuario;

	public Veiculo() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public List<Busca> getBuscas() {
		return this.buscas;
	}

	public void setBuscas(List<Busca> buscas) {
		this.buscas = buscas;
	}

	public Busca addBusca(Busca busca) {
		getBuscas().add(busca);
		busca.setVeiculo(this);

		return busca;
	}

	public Busca removeBusca(Busca busca) {
		getBuscas().remove(busca);
		busca.setVeiculo(null);

		return busca;
	}

	public TipoVeiculo getTipoVeiculo() {
		return this.tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public ModeloVeiculo getModeloVeiculo() {
		return this.modeloVeiculo;
	}

	public void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}