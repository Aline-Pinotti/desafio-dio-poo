package br.com.dio.desafio.dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;	
	
	public Mentoria() {
		super();
	}

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
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
		return "Mentoria [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", data=" + getDataString() + "]";
	}

	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20;
	}
	
}
