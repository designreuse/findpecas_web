package br.com.findpecas.web.controller;

import java.util.Calendar;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.findpecas.dao.impl.JpaCidadeDAO;
import br.com.findpecas.dao.impl.JpaUsuarioDAO;
import br.com.findpecas.model.Usuario;

@Controller
@Transactional
public class LoginController {
	
	@Autowired
	private JpaUsuarioDAO dao;
	
	
	@RequestMapping(value = "/logar", method = RequestMethod.POST)
	public String logar(@RequestParam("login") String login, @RequestParam("senha") String senha, 
			HttpSession session) throws Exception {
		String retorno = null;

		
		
		return retorno;
	}
	
	@RequestMapping("login")
	public ModelAndView login(@RequestParam(value = "error", required = false) String error){
		ModelAndView mav = new ModelAndView("login");
		if (error != null) {
			mav.addObject("error", "E-mail ou senha inválidos!");
		}
		return mav;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/login";
	}
	

}
