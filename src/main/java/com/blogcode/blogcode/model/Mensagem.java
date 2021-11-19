package com.blogcode.blogcode.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.Nullable;

@Entity
public class Mensagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Nullable
	private String nome;
	
	@Nullable
	private String email;
	
	@Nullable
	private String titulomensagem;
	
	@Nullable
	private String mensagemcontato;
	
	@Enumerated(EnumType.STRING)
	private Duvida duvida;
	
	
	public Mensagem() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTitulomensagem() {
		return titulomensagem;
	}


	public void setTitulomensagem(String titulomensagem) {
		this.titulomensagem = titulomensagem;
	}


	public String getMensagemcontato() {
		return mensagemcontato;
	}


	public void setMensagemcontato(String mensagemcontato) {
		this.mensagemcontato = mensagemcontato;
	}


	public Duvida getDuvida() {
		return duvida;
	}


	public void setDuvida(Duvida duvida) {
		this.duvida = duvida;
	}


	@Override
	public String toString() {
		return "Mensagem [id=" + id + ", nome=" + nome + ", email=" + email + ", titulomensagem=" + titulomensagem
				+ ", mensagemcontato=" + mensagemcontato + ", duvida=" + duvida + "]";
	}

}
