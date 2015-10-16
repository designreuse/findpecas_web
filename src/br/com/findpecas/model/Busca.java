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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="Busca.findAll", query="SELECT b FROM Busca b")
public class Busca  {

	@Id
	@Column(name="cod_busca")
	private Integer codigo;

	private String detalhamento;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_publicacao")
	private Date dtPublicacao;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_ult_altr")
	private Date dtUltAltr;

	@Column(name="nome_item")
	private String nomeItem;

	private int quantidade;

	private String status;

	@ManyToOne
	@JoinColumn(name="cod_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="cod_tipo_negocio")
	private TipoNegocio tipoNegocio;

	@ManyToOne
	@JoinColumn(name="cod_veiculo")
	private Veiculo veiculo;

	@OneToMany(mappedBy="busca")
	private List<MotivoExclusaoBusca> motivoExclusaoBuscas;

	@OneToMany(mappedBy="busca")
	private List<Orcamento> orcamentos;

	public Busca() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDetalhamento() {
		return this.detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public Date getDtPublicacao() {
		return this.dtPublicacao;
	}

	public void setDtPublicacao(Date dtPublicacao) {
		this.dtPublicacao = dtPublicacao;
	}

	public Date getDtUltAltr() {
		return this.dtUltAltr;
	}

	public void setDtUltAltr(Date dtUltAltr) {
		this.dtUltAltr = dtUltAltr;
	}

	public String getNomeItem() {
		return this.nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Veiculo getVeiculo() {
		return this.veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public TipoNegocio getTipoNegocio() {
		return this.tipoNegocio;
	}

	public void setTipoNegocio(TipoNegocio tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public List<MotivoExclusaoBusca> getMotivoExclusaoBuscas() {
		return this.motivoExclusaoBuscas;
	}

	public MotivoExclusaoBusca addMotivoExclusaoBusca(MotivoExclusaoBusca motivoExclusaoBusca) {
		getMotivoExclusaoBuscas().add(motivoExclusaoBusca);
		motivoExclusaoBusca.setBusca(this);

		return motivoExclusaoBusca;
	}

	public MotivoExclusaoBusca removeMotivoExclusaoBusca(MotivoExclusaoBusca motivoExclusaoBusca) {
		getMotivoExclusaoBuscas().remove(motivoExclusaoBusca);
		motivoExclusaoBusca.setBusca(null);

		return motivoExclusaoBusca;
	}

	public List<Orcamento> getOrcamentos() {
		return this.orcamentos;
	}

	public void setOrcamentos(List<Orcamento> orcamentos) {
		this.orcamentos = orcamentos;
	}

	public Orcamento addOrcamento(Orcamento orcamento) {
		getOrcamentos().add(orcamento);
		orcamento.setBusca(this);

		return orcamento;
	}

	public Orcamento removeOrcamento(Orcamento orcamento) {
		getOrcamentos().remove(orcamento);
		orcamento.setBusca(null);

		return orcamento;
	}

}