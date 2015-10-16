package br.com.findpecas.web.util;

import java.io.IOException;
import java.security.Principal;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import br.com.findpecas.model.Empresa;
import br.com.findpecas.model.Usuario;
import br.com.findpecas.service.IEmpresaService;
import br.com.findpecas.service.IUsuarioService;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Autowired
    @Qualifier("usuarioServiceImpl")
    private IUsuarioService usuarioServiceImpl;
	
	@Autowired
    @Qualifier("empresaServiceImpl")
    private IEmpresaService empresaServiceImpl;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
										HttpServletResponse response, 
										Authentication authentication) throws IOException,
																			  ServletException {
		HttpSession session = request.getSession();  
		
		UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();  
		String email = user.getUsername();	
		
		Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_USUARIO")) {
        	Usuario authUser = (Usuario) usuarioServiceImpl.getByEmail(email);
    		
            session.setAttribute("usuario", authUser);  
            session.setAttribute("authorities", authentication.getAuthorities());  
        	
            response.sendRedirect("usuario/inicio-usuario");
            //set our response to OK status  
            response.setStatus(HttpServletResponse.SC_OK);  
        }
        else if (roles.contains("ROLE_EMPRESA")) {
        	Empresa authUser = (Empresa) empresaServiceImpl.getByEmail(email);
    		
            session.setAttribute("empresa", authUser);  
            session.setAttribute("authorities", authentication.getAuthorities());  
            
            response.sendRedirect("empresa/inicio-empresa");
           //set our response to OK status  
            response.setStatus(HttpServletResponse.SC_OK);
        }
        else if (roles.contains("ROLE_ADMIN")) {
            response.sendRedirect("admin/inicio-admin");
        }

        
        
		
	}

}
