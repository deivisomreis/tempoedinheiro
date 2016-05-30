package com.tempoedinheiro.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreePagesController {

	@RequestMapping("/home")
	public String home(){
		return "home";
	}
}
