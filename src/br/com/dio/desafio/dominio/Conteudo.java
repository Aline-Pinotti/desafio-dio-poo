package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10;
	
	private String titulo;
	private String descricao;
		
	
	protected Conteudo() {
		super();
	}



	protected Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public abstract double calcularXP();
}
