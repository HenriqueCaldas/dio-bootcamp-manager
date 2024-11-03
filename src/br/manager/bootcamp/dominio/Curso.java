package br.manager.bootcamp.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super();
		super.setTitulo(titulo);
		super.setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	protected double calcularXP() {
		return XP_PADRAO * cargaHoraria
				;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]\n";
	}

	
	
	
}
