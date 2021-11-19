package com.blogcode.blogcode.model;

public enum Categoria {

	BACKEND("Backend"),
	FRONTEND("Frontend"),
	BANCO_DE_DADOS("Banco de dados"),
	CLOUD("Cloud"),
	IOT("Internet das coisas - IOT"),
	STARTUPS("Startups"),
	PRODUTOS_DIGITAIS("Produtos digitais"),
	UX_UI("Ux & Ui"),
	METODOLOGIA_AGIL("Metodologia ágil"),
	MICROSERVICOS("Microserviços - APIS"),
	BIG_DATA("Big data"),
	ANALISE_DE_DADOS("Analise de dados"),
	IA("Inteligencia artificial");
	
	private String categoria;

	private Categoria (String categoria) {
		this.categoria = categoria;
	}	
}