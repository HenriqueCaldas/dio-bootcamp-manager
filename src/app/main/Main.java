package app.main;

import java.time.LocalDate;

import br.manager.bootcamp.dominio.Aluno;
import br.manager.bootcamp.dominio.Bootcamp;
import br.manager.bootcamp.dominio.Conteudo;
import br.manager.bootcamp.dominio.Curso;
import br.manager.bootcamp.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Conteudo cursoLogicaProgramacao = new Curso("Lógica de Programação", "Aprenda LP", 10);
		Conteudo cursoJavaBasico = new Curso("Java Basico", "Aprenda java do básico", 14);
		Conteudo mentoriaConstruaAPI = new Mentoria("API", "Aprenda API", LocalDate.now());
		
		Bootcamp bootcampClaro = new Bootcamp("BootCamp Claro", "Java developer Claro");
		bootcampClaro.getConteudos().add(cursoLogicaProgramacao);
		bootcampClaro.getConteudos().add(cursoJavaBasico);
		bootcampClaro.getConteudos().add(mentoriaConstruaAPI);
		
		
		
		Aluno luis = new Aluno("Luis");
		luis.matricularBootcamp(bootcampClaro);
		System.out.println("Lista de conteúdos em Andamento:\nAluno:" + luis.getNome() + "\n" + luis.getConteudosMatriculados());
		System.out.println("Lista Conteudos finalizados: " + luis.getConteudosFinalizados());
		System.out.println("Total XP = " + luis.calcularXpTotal());
		System.out.println("=======//===============//=======");
		
		Aluno tonyStark = new Aluno("Tony Stark");
		tonyStark.matricularBootcamp(bootcampClaro);
		System.out.println("Lista de conteúdos em Andamento:\nAluno:" + tonyStark.getNome() + "\n" + tonyStark.getConteudosMatriculados());
		System.out.println("Lista Conteudos finalizados: " + tonyStark.getConteudosFinalizados());
		System.out.println("Total XP = " + tonyStark.calcularXpTotal());
		System.out.println("=======//===============//=======");
		
		
		luis.finalizarConteudoAtual();
		luis.finalizarConteudoAtual();
		tonyStark.finalizarConteudoAtual();
		
		System.out.println("Lista de conteúdos em Andamento:\nAluno:" + luis.getNome() + "\n" + luis.getConteudosMatriculados());
		System.out.println("Lista Conteudos finalizados: " + luis.getConteudosFinalizados());
		System.out.println("Total XP = " + luis.calcularXpTotal());
		System.out.println("=======//===============//=======");
		
		System.out.println("Lista de conteúdos em Andamento:\nAluno:" + tonyStark.getNome() + "\n" + tonyStark.getConteudosMatriculados());
		System.out.println("Lista Conteudos finalizados: " + tonyStark.getConteudosFinalizados());
		System.out.println("Total XP = " + tonyStark.calcularXpTotal());
		System.out.println("=======//===============//=======");
		
		
		
		
	}

}
