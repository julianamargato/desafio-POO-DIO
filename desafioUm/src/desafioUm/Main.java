package desafioUm;

import java.time.LocalDate;

import desafioUm.br.com.dio.desafio.dominio.Curso;
import desafioUm.br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String [] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("JAVA");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("JAVASCRIPT");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria JAVA");
		mentoria.setDescricao("Sobre JAVA");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		
	}

}
