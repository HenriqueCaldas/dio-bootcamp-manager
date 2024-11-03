package br.manager.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		super.setTitulo(titulo);
		super.setDescricao(descricao);
		this.data = data;
	}

	@Override
	protected double calcularXP() {
		return XP_PADRAO * 20d;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", data=" + data + "]\n";
	}

}
