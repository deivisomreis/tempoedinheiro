package com.tempoedinheiro.dao;

import java.util.List;

import com.tempoedinheiro.model.Usuario;

public interface UsuarioInterface {
	
	void insert(Usuario usuario);
	void remove(Usuario usuario);
	void update(Usuario usuario);
	Usuario usuario(Long id);
	Usuario login(String usuario, String senha);
	List<Usuario> usuarios();
}
