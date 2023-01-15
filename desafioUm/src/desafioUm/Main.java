package desafioUm;

import java.time.LocalDate;

import desafioUm.br.com.dio.desafio.dominio.Bootcamp;
import desafioUm.br.com.dio.desafio.dominio.Curso;
import desafioUm.br.com.dio.desafio.dominio.Dev;
import desafioUm.br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String [] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("JAVA");
		curso1.setProfessor("Antonio Carlos");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("JAVASCRIPT");
		curso2.setProfessor("Roberta Silva");
		curso2.setCargaHoraria(4);		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria JAVA");
		mentoria.setDescricao("Sobre JAVA");
		mentoria.setProfessor("Antonio Carlos");
		mentoria.setData(LocalDate.now());
		
		System.out.println("Cursos e mentorias disponiveis para inscrição: \n");
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		System.out.println(" \n Alunos já inscritos e seus progressos: \n" );
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Aprendendo java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNomeString("Juliana");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Aluno: " +dev1.getNomeString());
		System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("-----");
		System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());		
		System.out.println("Conteudos Concluidos" + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());

		System.out.println("\n__________________________________________________________\n");

		
		Dev dev2 = new Dev();
		dev2.setNomeString("Paula");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Aluno: " + dev2.getNomeString());
		System.out.println("Conteudos Inscritos" + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		System.out.println("-----");
		System.out.println("Conteudos Inscritos" + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());

		
	}

}
