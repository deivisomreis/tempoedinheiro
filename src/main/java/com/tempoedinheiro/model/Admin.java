package com.tempoedinheiro.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ad_id;
	private String ad_nome;
	private String ad_senha;
	private String ad_email;
	private Date ad_acesso; //grava o ultimo acesso;
	
	public Long getAd_id() {
		return ad_id;
	}
	public void setAd_id(Long ad_id) {
		this.ad_id = ad_id;
	}
	public String getAd_nome() {
		return ad_nome;
	}
	public void setAd_nome(String ad_nome) {
		this.ad_nome = ad_nome;
	}
	public String getAd_senha() {
		return ad_senha;
	}
	public void setAd_senha(String ad_senha) {
		this.ad_senha = ad_senha;
	}
	public String getAd_email() {
		return ad_email;
	}
	public void setAd_email(String ad_email) {
		this.ad_email = ad_email;
	}
	public Date getAd_acesso() {
		return ad_acesso;
	}
	public void setAd_acesso(Date ad_acesso) {
		this.ad_acesso = ad_acesso;
	}
}
