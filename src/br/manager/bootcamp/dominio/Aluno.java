package br.manager.bootcamp.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Aluno {
	
	private String nome;
	private Set<Conteudo> conteudosMatriculados = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosFinalizados = new LinkedHashSet<Conteudo>();
	
	public Aluno(String nome) {
		this.nome = nome;
		
	}
	
	public void matricularBootcamp(Bootcamp bootcamp) {
		this.conteudosMatriculados.addAll(bootcamp.getConteudos());
		inscreverAlunoNoBootcamp(bootcamp);
	}
	
	private void inscreverAlunoNoBootcamp(Bootcamp bootcamp) {
		bootcamp.getAlunosMatriculados().add(this);
	}
	
	public void finalizarConteudoAtual() {
		Optional<Conteudo> conteudoFinalizado = this.conteudosMatriculados.stream().findFirst();
		if(conteudoFinalizado.isPresent()) {
			this.conteudosFinalizados.add(conteudoFinalizado.get());
			this.conteudosMatriculados.remove(conteudoFinalizado.get());
		} else {
			System.err.println("Você não possui disciplinas matriculadas");
		}
	}
	
	public double calcularXpTotal() {
		return this.conteudosFinalizados.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosMatriculados() {
		return conteudosMatriculados;
	}

	public void setConteudosMatriculados(Set<Conteudo> conteudosMatriculados) {
		this.conteudosMatriculados = conteudosMatriculados;
	}

	public Set<Conteudo> getConteudosFinalizados() {
		return conteudosFinalizados;
	}

	public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
		this.conteudosFinalizados = conteudosFinalizados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosFinalizados, conteudosMatriculados, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(conteudosFinalizados, other.conteudosFinalizados)
				&& Objects.equals(conteudosMatriculados, other.conteudosMatriculados)
				&& Objects.equals(nome, other.nome);
	}
	
}
