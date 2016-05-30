package com.tempoedinheiro.dao;

import java.util.List;

public class UsuarioDAO implements UsuarioInterface {

	@Override
	public void insert(com.tempoedinheiro.model.Usuario usuario) {
		if(usuario  != null && !usuario.getUs_email().isEmpty() && !usuario.getUs_nome().isEmpty())

	}

	@Override
	public void remove(com.tempoedinheiro.model.Usuario usuario) {
		

	}

	@Override
	public void update(com.tempoedinheiro.model.Usuario usuario) {
		

	}

	@Override
	public com.tempoedinheiro.model.Usuario usuario(Long id) {
		
		return null;
	}

	@Override
	public com.tempoedinheiro.model.Usuario login(String usuario, String senha) {
		
		return null;
	}

	@Override
	public List<com.tempoedinheiro.model.Usuario> usuarios() {
		
		return null;
	}

}
