package com.tempoedinheiro.dao;

import java.util.List;

import com.tempoedinheiro.model.Admin;

public interface AdminInterface {
	void insert(Admin admin);
	void remove(Admin admin);
	void update(Admin admin);
	Admin admin(Long id);
	Admin login(String usuario, String senha);
	List<Admin> admins();
}
