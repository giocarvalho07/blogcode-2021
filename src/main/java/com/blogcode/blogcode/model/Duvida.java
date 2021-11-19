package com.blogcode.blogcode.model;

public enum Duvida {
	
	DESENVOLVIMENTO_SOFTWARE("Desenvolvimento de software"),
	ANALISE_DE_DADOS("Analise de dados"),
	TUTORIAIS_YOUTUBE("Tutoriais do youtube"),
	ARTIGOS("Artigos"),
	SUPORTE("Suporte");
	
	private String duvida;

	private Duvida (String duvida) {
		this.duvida = duvida;
	}	

}
