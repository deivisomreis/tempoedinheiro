package com.tempoedinheiro.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
	
	@RequestMapping("/usuariologin")
	public String login(){
		return "usuariologin";
	}
}
