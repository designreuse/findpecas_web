package br.com.findpecas.util;

import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import br.com.findpecas.model.Usuario;

public class FPAuthenticationProvider 

//implements AuthenticationProvider
{
/*
	@Override
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		
		UsernamePasswordAuthenticationToken token=
				(UsernamePasswordAuthenticationToken) auth;
				String username = token.getName();
				String senha = token.getCredentials().toString();
				Usuario usuario = getDaoUsuario().getUsuario(username, senha);
				/*
				Não encontrei um usuário, retornar null indica
				uma autenticação falha.
				
				if (usuario == null) return null;
				List<PermissaoUsuario> permissoes = getDaoPermissao().
				getPermissoesUsuario(usuario);
				SFAuthentication resultado =
				new SFAuthentication(usuario, permissoes);
				resultado.setAuthenticated(usuario != null);
				return resultado;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		
		return (UsernamePasswordAuthenticationToken.
				class.isAssignableFrom(authentication));
	}*/

}
