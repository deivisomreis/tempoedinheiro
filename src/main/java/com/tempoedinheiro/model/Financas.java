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
public class Financas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long fi_id;
	private String fi_nome;
	private String fi_descricao;
	private Date fi_cadastro;
	private boolean fi_status;
	private Date fi_pagamento;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario fi_usuario;

	public Long getFi_id() {
		return fi_id;
	}

	public void setFi_id(Long fi_id) {
		this.fi_id = fi_id;
	}

	public String getFi_nome() {
		return fi_nome;
	}

	public void setFi_nome(String fi_nome) {
		this.fi_nome = fi_nome;
	}

	public String getFi_descricao() {
		return fi_descricao;
	}

	public void setFi_descricao(String fi_descricao) {
		this.fi_descricao = fi_descricao;
	}

	public Date getFi_cadastro() {
		return fi_cadastro;
	}

	public void setFi_cadastro(Date fi_cadastro) {
		this.fi_cadastro = fi_cadastro;
	}

	public boolean isFi_status() {
		return fi_status;
	}

	public void setFi_status(boolean fi_status) {
		this.fi_status = fi_status;
	}

	public Date getFi_pagamento() {
		return fi_pagamento;
	}

	public void setFi_pagamento(Date fi_pagamento) {
		this.fi_pagamento = fi_pagamento;
	}

	public Usuario getFi_usuario() {
		return fi_usuario;
	}

	public void setFi_usuario(Usuario fi_usuario) {
		this.fi_usuario = fi_usuario;
	}	
}
