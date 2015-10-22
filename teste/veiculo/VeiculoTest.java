package veiculo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.findpecas.service.IVeiculoService;

public class VeiculoTest {
	
	@Autowired
	@Qualifier("veiculoServiceImpl")
	private IVeiculoService veiculoService;
	
	@Before
	public void setUp() throws Exception {
	}
	
	// TESTES
	
	@Test
	public void novoVeiculo() {
		
	}
	
	@Test
	public void removerVeiculo() {
		
	}
	
	@Test
	public void listarVeiculosPorUsuario() {
		
	}
	
	@Test
	public void listarVeiculosPorModelo() {
		
	}
	
	@Test
	public void listarVeiculosPorFabricante() {
		
	}
	
	@Test
	public void listarBuscasDoVeiculo() {
		
	}
	
	@Test
	public void listarBuscasAprovadasDoVeiculo() {
		
	}



}
