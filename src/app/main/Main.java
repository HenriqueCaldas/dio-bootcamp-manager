package app.main;

import java.time.LocalDate;

import br.manager.bootcamp.dominio.Curso;
import br.manager.bootcamp.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Java Básico", "Aprenda java do início", 12);
		
		System.out.println(curso);
		
		Mentoria mentoria = new Mentoria("Api java do zero", "Aprenda a criar uma api em java do zero", LocalDate.now());
		
		System.out.println(mentoria);
	}

}
