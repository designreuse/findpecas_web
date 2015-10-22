package empresa;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.findpecas.service.IEmpresaService;

public class EmpresaTest {

	@Autowired
	@Qualifier("empresaServiceImpl")
	private IEmpresaService empresaService;
	
	@Before
	public void setUp() throws Exception {
	}

	// TESTES
	
	@Test
	public void novoPreCadastroEmpresa() {
		
	}
	
	@Test
	public void novaEmpresa() {
		
	}
	
	@Test
	public void alterarNomeEmpresa() {
		
	}
	
	@Test
	public void alterarLoginEmpresa() {
		
	}
	
	@Test
	public void alterarHorarioFuncionamentoEmpresa() {
		
	}
	
	@Test
	public void alterarDescricaoEmpresa() {
		
	}
	
	@Test
	public void alterarCNPJEmpresa() {
		
	}
	
	@Test
	public void buscarEmpresaPorNome() {
		
	}
	
	@Test
	public void listarEmpresasPorEstado() {
		
	}
	
	@Test
	public void listarEmpresasPorRegiao() {
		
	}
	
	@Test
	public void listarEmpresasPorCidade() {
		
	}
	
	@Test
	public void listarEmpresasPorTipoDeNegocio() {
		
	}
	
	@Test
	public void listarEmpresasPorTipoDeVeiculo() {
		
	}
	
	@Test
	public void listarEmpresasPorAvaliacao() {
		
	}
	
	@Test
	public void enderecoDaEmpresa() {
		
	}
	
	@Test
	public void contatosDaEmpresa() {
		
	}
	
	@Test
	public void formasDePagementoDaEmpresa() {
		
	}
	
	@Test
	public void empresasDesativadas() {
		
	}
	

}
