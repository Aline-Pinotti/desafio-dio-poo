package br.com.dio.desafio.dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Mentoria {
	private String titulo;
	private String descricao;
	private LocalDate data;	
	
	public Mentoria() {
		super();
	}

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
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
	
	public LocalDate getData() {
		return data;
	}
	
	public String getDataString() {
		SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
	    try {	    	
	        return out.format(in.parse(data.toString()));
	    } catch (ParseException Ex) {
	        return "Erro na conversão da data: " + Ex.getMessage();
	    }	
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + getDataString() + "]";
	}
	
}
