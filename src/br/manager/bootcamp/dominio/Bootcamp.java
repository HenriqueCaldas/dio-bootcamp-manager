package br.manager.bootcamp.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String descricao;
	private LocalDate dataInicio = LocalDate.now();
	private LocalDate datafim = dataInicio.plusDays(45);
	private Set<Aluno> alunosMatriculados = new HashSet<Aluno>();
	private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
	
	
	public Bootcamp(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDatafim() {
		return datafim;
	}
	public void setDatafim(LocalDate datafim) {
		this.datafim = datafim;
	}
	public Set<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	public void setAlunosMatriculados(Set<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(alunosMatriculados, conteudos, dataInicio, datafim, descricao, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(alunosMatriculados, other.alunosMatriculados)
				&& Objects.equals(conteudos, other.conteudos) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(datafim, other.datafim) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(nome, other.nome);
	}
	
	
	
}
