package br.com.findpecas.model;

import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_empresa")
	private Integer codigo;

	private String cnpj;

	private String descricao;

	private String email;

	@Column(name="horario_func")
	private String horarioFunc;

	private String nome;

	@OneToMany(mappedBy="empresa")
	private List<Avaliacao> avaliacoes;

	@OneToMany(mappedBy="empresa", cascade = CascadeType.ALL)
	private List<Contato> contatos;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cod_user")
	private User user;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name="EMPRESA_TIPO_VEICULO"
		, joinColumns={
			@JoinColumn(name="cod_empresa")
			}
		, inverseJoinColumns={
			@JoinColumn(name="cod_tipo_veiculo")
			}
		)
	private List<TipoVeiculo> tipoVeiculos;

	@OneToMany(mappedBy="empresa", cascade = CascadeType.ALL)
	private List<Endereco> enderecos;

	@OneToMany(mappedBy="empresa", cascade = CascadeType.ALL)
	private List<FormaPagamento> formaPagamentos;

	@OneToOne(mappedBy="empresa", cascade = CascadeType.ALL)
	private Logomarca logomarca;

	@OneToMany(mappedBy="empresa")
	private List<Orcamento> orcamentos;

	@ManyToMany(mappedBy="empresas", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<TipoNegocio> tipoNegocios;

	public Empresa() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHorarioFunc() {
		return this.horarioFunc;
	}

	public void setHorarioFunc(String horarioFunc) {
		this.horarioFunc = horarioFunc;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Avaliacao> getAvaliacoes() {
		return this.avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacaos) {
		this.avaliacoes = avaliacaos;
	}

	public Avaliacao addAvaliacao(Avaliacao avaliacao) {
		getAvaliacoes().add(avaliacao);
		avaliacao.setEmpresa(this);

		return avaliacao;
	}

	public Avaliacao removeAvaliacao(Avaliacao avaliacao) {
		getAvaliacoes().remove(avaliacao);
		avaliacao.setEmpresa(null);

		return avaliacao;
	}

	public List<Contato> getContatos() {
		return this.contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Contato addContato(Contato contato) {
		getContatos().add(contato);
		contato.setEmpresa(this);

		return contato;
	}

	public Contato removeContato(Contato contato) {
		getContatos().remove(contato);
		contato.setEmpresa(null);

		return contato;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<TipoVeiculo> getTipoVeiculos() {
		return this.tipoVeiculos;
	}

	public void setTipoVeiculos(List<TipoVeiculo> tipoVeiculos) {
		this.tipoVeiculos = tipoVeiculos;
	}

	public List<Endereco> getEnderecos() {
		return this.enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Endereco addEndereco(Endereco endereco) {
		getEnderecos().add(endereco);
		endereco.setEmpresa(this);

		return endereco;
	}

	public Endereco removeEndereco(Endereco endereco) {
		getEnderecos().remove(endereco);
		endereco.setEmpresa(null);

		return endereco;
	}

	public List<FormaPagamento> getFormaPagamentos() {
		return this.formaPagamentos;
	}

	public void setFormaPagamentos(List<FormaPagamento> formaPagamentos) {
		this.formaPagamentos = formaPagamentos;
	}

	public FormaPagamento addFormaPagamento(FormaPagamento formaPagamento) {
		getFormaPagamentos().add(formaPagamento);
		formaPagamento.setEmpresa(this);

		return formaPagamento;
	}

	public FormaPagamento removeFormaPagamento(FormaPagamento formaPagamento) {
		getFormaPagamentos().remove(formaPagamento);
		formaPagamento.setEmpresa(null);

		return formaPagamento;
	}

	public Logomarca getLogomarca() {
		return this.logomarca;
	}

	public void setLogomarcas(Logomarca logomarca) {
		this.logomarca = logomarca;
	}

	public List<Orcamento> getOrcamentos() {
		return this.orcamentos;
	}

	public void setOrcamentos(List<Orcamento> orcamentos) {
		this.orcamentos = orcamentos;
	}

	public Orcamento addOrcamento(Orcamento orcamento) {
		getOrcamentos().add(orcamento);
		orcamento.setEmpresa(this);

		return orcamento;
	}

	public Orcamento removeOrcamento(Orcamento orcamento) {
		getOrcamentos().remove(orcamento);
		orcamento.setEmpresa(null);

		return orcamento;
	}

	public List<TipoNegocio> getTipoNegocios() {
		return this.tipoNegocios;
	}

	public void setTipoNegocios(List<TipoNegocio> tipoNegocios) {
		this.tipoNegocios = tipoNegocios;
	}

}