package com.tempoedinheiro.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.tempoedinheiro.dao.AdminDAO;
import com.tempoedinheiro.model.Admin;

public class Teste {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		AdminDAO adminDAO = new AdminDAO();
		
		Admin b = adminDAO.login("deivisomreis@bol.com.br", "deivisomreis@bol.com.br");
		Date a = new Date();
		b.setAd_acesso(a);
		
		adminDAO.update(b);
		
		b = adminDAO.login("deivisomreis@bol.com.br", "deivisomreis@bol.com.br");
		
		System.out.println(b.getAd_id());
		System.out.println(b.getAd_nome());
		System.out.println(b.getAd_email());
		System.out.println(b.getAd_senha());
		
		try{
			System.out.println(sdf.format(b.getAd_acesso()));
		}
		catch(Exception  ex){
			System.out.println(ex.getMessage());
			System.out.println("Erro ao imprimir o acesso");
		}
		

	}

}
