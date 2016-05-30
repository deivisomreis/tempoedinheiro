package com.tempoedinheiro.session;

import com.tempoedinheiro.model.Admin;

public class AdminAware {
	
	public static boolean existAdmin(Object  obj){
		if(obj != null && obj instanceof Admin)
			return true;
		
		else
			return false;
	}
}
