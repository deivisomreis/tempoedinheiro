package com.tempoedinheiro.dao;

import com.tempoedinheiro.model.Tarefas;
import com.tempoedinheiro.model.Usuario;

public interface TarefasInterface {
	void insert(Tarefas tarefas);
	void remove(Tarefas tarefas);
	void update(Tarefas  tarefas);
	Tarefas tarefa(Long id);
	Tarefas tarefas(Usuario usuario);
	
}
