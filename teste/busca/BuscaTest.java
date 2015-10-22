package busca;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.findpecas.service.IBuscaService;

public class BuscaTest {
	
	@Autowired
	@Qualifier("buscaServiceImpl")
	private IBuscaService buscaService;	

	@Before
	public void setUp() throws Exception {
	}

	// TESTES
	
	@Test
	public void novaBusca() {
		
	}
	
	@Test
	public void editarBusca() {
		
	}
	
	@Test
	public void removerBusca() {
		
	}
	
	@Test
	public void motivoExlusaoDaBusca() {
		
	}
	
	@Test
	public void listarBuscas() {
		
	}
	
	@Test
	public void listarBuscasPorEstado() {
		
	}
	
	@Test
	public void listarBuscasPorCidade() {
		
	}
	
	@Test
	public void listarBuscasPorRegiao() {
		
	}
	
	@Test
	public void listarBuscasPorTipoVeiculo() {
		
	}
	
	@Test
	public void listarBuscasPorTipoNegocio() {
		
	}
	
	@Test
	public void listarBuscasPorFabricanteVeiculo() {
		
	}
	
	@Test
	public void listarBuscasPorModeloVeiculo() {
		
	}
	
	@Test
	public void listarBuscasPorMotivoExclusao() {
		
	}
	

}
