package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;
		
	public Curso() {
		super();
	}

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);		
		this.cargaHoraria = cargaHoraria;
	}
		
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * this.cargaHoraria;
	}

}
