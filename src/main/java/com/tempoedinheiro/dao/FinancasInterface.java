package com.tempoedinheiro.dao;

import com.tempoedinheiro.model.Financas;
import com.tempoedinheiro.model.Usuario;

public interface FinancasInterface {
	void insert(Financas financa);
	void remove(Financas financa);
	void update(Financas financa);
	Financas financa(Long id);
	Financas financas(Usuario usuario);
	
}
