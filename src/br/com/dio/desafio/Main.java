package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("curso Java", "descrição curso java", 8);
		Curso curso2 = new Curso("curso JavaScript", "descrição curso java script", 4);
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria("mentoria de java", "descrição da mentoria de java", LocalDate.now());
		System.out.println(mentoria);
		
		System.out.println(curso1.getTitulo());


	}

}
