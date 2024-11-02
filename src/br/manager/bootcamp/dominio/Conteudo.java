package br.manager.bootcamp.dominio;

public abstract class Conteudo {
	
	private String titulo;
	private String descricao;
	

	protected String getTitulo() {
		return titulo;
	}
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	protected String getDescricao() {
		return descricao;
	}
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
