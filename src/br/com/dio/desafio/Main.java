package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Devs;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("curso Java", "descrição curso java", 8);
		Conteudo curso2 = new Curso("curso JavaScript", "descrição curso java script", 4);		
			
		Mentoria mentoria = new Mentoria("mentoria de java", "descrição da mentoria de java", LocalDate.now());
		Conteudo mentoria2 = new Mentoria("mentoria de javascript", "descrição da mentoria de javascript", LocalDate.now());
		
		
		Set<Conteudo> conteudos = new LinkedHashSet<>();
		conteudos.add(curso1);
		conteudos.add(curso2);
		conteudos.add(mentoria);
		conteudos.add(mentoria2);
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer", conteudos);
		
		Devs devCamila = new Devs("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Instritos Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("Conteúdos Instritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("XP: " + devCamila.calcularTotalXP());
		
		System.out.println("");
		
		Devs devJoao = new Devs("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Instritos João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
		System.out.println("Conteúdos Instritos João: " + devJoao.getConteudosInscritos());
		System.out.println("XP: " + devJoao.calcularTotalXP());

	}

}
