package com.pagina.desenhista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pagina.desenhista.model.Usuario;

@Controller
public class ControlaUsuarios {
	
	@RequestMapping("/formulario")
	public String executa() {
		return "cadastro";
	}
	@RequestMapping("/cadastrarUsuario")
	public ModelAndView cadastrar(Usuario usuario) {
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("mnome", usuario.getNome());
		modelView.addObject("msobrenome", usuario.getSobrenome());
		modelView.addObject("musername", usuario.getUsername());
		modelView.addObject("memail", usuario.getEmail());
		
		modelView.setViewName("perfil");
		return modelView;
	}
}
