# dio-bootcamp-manager

# Gerenciador de Bootcamps

Este é um projeto em Java para gerenciar um sistema de Bootcamps, onde é possível cadastrar cursos, mentorias, bootcamps e gerenciar a participação de alunos, calculando o progresso.
## Estrutura do Projeto

O projeto é dividido nas seguintes classes principais:

- **Conteudo**: Classe abstrata que representa o conteúdo básico de um Bootcamp. Contém os métodos e atributos comuns entre cursos e mentorias, incluindo o título, a descrição e a experiência padrão (`XP_PADRAO`).
  - `calcularXP()`: Método abstrato que deve ser implementado pelas classes filhas para calcular a experiência adquirida.

- **Curso**: Extende a classe `Conteudo` e representa um curso dentro de um Bootcamp. Contém, além dos atributos herdados, a carga horária.
  - `calcularXP()`: Calcula a experiência com base na carga horária do curso.
  - `toString()`: Retorna uma string representando o curso com título, descrição e carga horária.

- **Mentoria**: Também extende `Conteudo`, representando uma mentoria dentro de um Bootcamp, que possui uma data.
  - `calcularXP()`: Calcula a experiência padrão multiplicada por um fator fixo.
  - `toString()`: Retorna uma string representando a mentoria com título, descrição e data.

- **Bootcamp**: Representa um Bootcamp que possui nome, descrição, data de início, data de fim, alunos matriculados e uma lista de conteúdos.
  - `getAlunosMatriculados()`: Retorna os alunos matriculados.
  - `getConteudos()`: Retorna os conteúdos disponíveis no Bootcamp.

- **Aluno**: Representa um aluno participante de um Bootcamp. Armazena o nome, conteúdos matriculados e conteúdos finalizados.
  - `matricularBootcamp()`: Adiciona o aluno ao bootcamp e inscreve-o em todos os conteúdos disponíveis.
  - `finalizarConteudoAtual()`: Finaliza o próximo conteúdo da lista de conteúdos matriculados.
  - `calcularXpTotal()`: Calcula a soma da experiência total dos conteúdos finalizados.

## Print do Sistema
![image](https://github.com/user-attachments/assets/6bb0ba98-a709-4fbf-bec4-aba748b29b2e)

## Exemplo de Uso

Para utilizar as classes do projeto, crie instâncias de `Curso` e `Mentoria`, adicione esses conteúdos a um `Bootcamp`, matricule um `Aluno` no Bootcamp e acompanhe o progresso do aluno ao finalizar conteúdos. Veja um exemplo simplificado:
		
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

