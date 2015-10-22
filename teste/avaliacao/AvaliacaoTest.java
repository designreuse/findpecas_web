package avaliacao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.findpecas.service.IAvaliacaoService;

public class AvaliacaoTest {
	
	@Autowired
	@Qualifier("avaliacaoServiceImpl")
	private IAvaliacaoService avaliacaoService;

	@Before
	public void setUp() throws Exception {
	}
	
	// TESTES
	
	@Test
	public void registrarAvaliacao() {
		
	}


}
