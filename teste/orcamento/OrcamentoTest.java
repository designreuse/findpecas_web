package orcamento;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.findpecas.service.IOrcamentoService;

public class OrcamentoTest {
	
	@Autowired
	@Qualifier("orcamentoServiceImpl")
	private IOrcamentoService orcamentoService;

	@Before
	public void setUp() throws Exception {
	}
	
	// TESTES
	
	@Test
	public void novoOrcamento() {
		
	}
	
	@Test
	public void listarOrcamentosPorEmpresa() {
		
	}
	
	@Test
	public void listarOrcamentosPorVeiculo() {
		
	}
	
	@Test
	public void listarOrcamentosPorUsuario() {
		
	}
	
	@Test
	public void listarOrcamentosAprovadosDoUsuario() {
		
	}
	
	@Test
	public void listarOrcamentosAprovadosDaEmpresa() {
		
	}
	
	


}
