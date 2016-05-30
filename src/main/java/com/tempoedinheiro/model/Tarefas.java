package com.tempoedinheiro.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tarefas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ta_id;
	private String ta_nome;
	private String ta_descricao;
	private Date  ta_cadastrado;
	private boolean ta_status;
	private Date ta_finalizado;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario ta_usuario;

	public Long getTa_id() {
		return ta_id;
	}

	public void setTa_id(Long ta_id) {
		this.ta_id = ta_id;
	}

	public String getTa_nome() {
		return ta_nome;
	}

	public void setTa_nome(String ta_nome) {
		this.ta_nome = ta_nome;
	}

	public String getTa_descricao() {
		return ta_descricao;
	}

	public void setTa_descricao(String ta_descricao) {
		this.ta_descricao = ta_descricao;
	}

	public Date getTa_cadastrado() {
		return ta_cadastrado;
	}

	public void setTa_cadastrado(Date ta_cadastrado) {
		this.ta_cadastrado = ta_cadastrado;
	}

	public boolean isTa_status() {
		return ta_status;
	}

	public void setTa_status(boolean ta_status) {
		this.ta_status = ta_status;
	}

	public Date getTa_finalizado() {
		return ta_finalizado;
	}

	public void setTa_finalizado(Date ta_finalizado) {
		this.ta_finalizado = ta_finalizado;
	}

	public Usuario getTa_usuario() {
		return ta_usuario;
	}

	public void setTa_usuario(Usuario ta_usuario) {
		this.ta_usuario = ta_usuario;
	}
}
