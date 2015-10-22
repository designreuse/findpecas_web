package usuario;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.findpecas.service.IUserService;

public class UsuarioTest {
	
	@Autowired
	@Qualifier("usuarioServiceImpl")
	private IUserService usuarioService;
	
	@Before
	public void setUp() throws Exception {
	}

	// TESTES
	
	@Test
	public void novoUsuario() {
		
	}

	@Test
	public void alterarNomeUsuario() {
		
	}
	
	@Test
	public void alterarBairroUsuario() {
		
	}
	
	@Test
	public void desativarUsuario() {
		
	}
	
	@Test
	public void listarUsuarios() {
		
	}
	
	@Test
	public void buscarUsuario() {
		
	}
	
	@Test
	public void cidadeDoUsuario() {
		
	}
	
	@Test
	public void estadoDoUsuario() {
		
	}
	
	@Test
	public void regiaoDoUsuario() {
		
	}
	
	@Test
	public void listarUsuariosPorEstado() {
		
	}
	
	@Test
	public void listarUsuariosPorRegiao() {
		
	}
	
	@Test
	public void alterarSenhaUsuario() {
		
	}
	
	@Test
	public void alterarLoginUsuario() {
		
	}
	
	@Test
	public void usuariosDesativados() {
		
	}
}
