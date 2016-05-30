package com.tempoedinheiro.session;

import com.tempoedinheiro.model.Usuario;

public class UsuarioAware {
	
	public static boolean existUsuario(Object  obj){
		if(obj != null && obj instanceof Usuario){
			return true;
		}
		
		else
			return false;
	}

}
