package com.tempoedinheiro.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long us_id;
	private String us_nome;
	private String us_email;
	private String us_senha;
	private Date us_cadastro;
	private Date us_acesso; // registra ultimo acesso;
	public Long getUs_id() {
		return us_id;
	}
	public void setUs_id(Long us_id) {
		this.us_id = us_id;
	}
	public String getUs_nome() {
		return us_nome;
	}
	public void setUs_nome(String us_nome) {
		this.us_nome = us_nome;
	}
	public String getUs_email() {
		return us_email;
	}
	public void setUs_email(String us_email) {
		this.us_email = us_email;
	}
	public String getUs_senha() {
		return us_senha;
	}
	public void setUs_senha(String us_senha) {
		this.us_senha = us_senha;
	}
	public Date getUs_cadastro() {
		return us_cadastro;
	}
	public void setUs_cadastro(Date us_cadastro) {
		this.us_cadastro = us_cadastro;
	}
	public Date getUs_acesso() {
		return us_acesso;
	}
	public void setUs_acesso(Date us_acesso) {
		this.us_acesso = us_acesso;
	}
}
