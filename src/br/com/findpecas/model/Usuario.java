package br.com.findpecas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario  {

	@Id
	@Column(name="cod_usuario")
	private Integer codigo;

	private String bairro;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_ult_acesso")
	private Date dtUltAcesso;

	private String email;

	private int isAtivo;

	private String nome;

	private String senha;

	@OneToMany(mappedBy="usuario")
	private List<Avaliacao> avaliacaos;

	@OneToMany(mappedBy="usuario")
	private List<Busca> buscas;

	@ManyToOne
	@JoinColumn(name="cod_cidade")
	private Cidade cidade;

	@OneToOne
	@JoinColumn(name="cod_user")
	private User user;

	@OneToMany(mappedBy="usuario")
	private List<Veiculo> veiculos;

	public Usuario() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Date getDtUltAcesso() {
		return this.dtUltAcesso;
	}

	public void setDtUltAcesso(Date dtUltAcesso) {
		this.dtUltAcesso = dtUltAcesso;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsAtivo() {
		return this.isAtivo;
	}

	public void setIsAtivo(int isAtivo) {
		this.isAtivo = isAtivo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Avaliacao> getAvaliacaos() {
		return this.avaliacaos;
	}

	public void setAvaliacaos(List<Avaliacao> avaliacaos) {
		this.avaliacaos = avaliacaos;
	}

	public Avaliacao addAvaliacao(Avaliacao avaliacao) {
		getAvaliacaos().add(avaliacao);
		avaliacao.setUsuario(this);

		return avaliacao;
	}

	public Avaliacao removeAvaliacao(Avaliacao avaliacao) {
		getAvaliacaos().remove(avaliacao);
		avaliacao.setUsuario(null);

		return avaliacao;
	}

	public List<Busca> getBuscas() {
		return this.buscas;
	}

	public void setBuscas(List<Busca> buscas) {
		this.buscas = buscas;
	}

	public Busca addBusca(Busca busca) {
		getBuscas().add(busca);
		busca.setUsuario(this);

		return busca;
	}

	public Busca removeBusca(Busca busca) {
		getBuscas().remove(busca);
		busca.setUsuario(null);

		return busca;
	}

	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Veiculo> getVeiculos() {
		return this.veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Veiculo addVeiculo(Veiculo veiculo) {
		getVeiculos().add(veiculo);
		veiculo.setUsuario(this);

		return veiculo;
	}

	public Veiculo removeVeiculo(Veiculo veiculo) {
		getVeiculos().remove(veiculo);
		veiculo.setUsuario(null);

		return veiculo;
	}

}