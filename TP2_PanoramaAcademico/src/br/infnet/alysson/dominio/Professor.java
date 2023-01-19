package br.infnet.alysson.dominio;

public class Professor extends Pessoa{
	
	private String materia;
	private int tempoServico;
	private int registro;
	
	
	public Professor(){
		
	}
	
	public Professor(String nome, int idade, String materia, int tempoServico, int registro){
		super(nome, idade);
		this.materia = materia;
		this.tempoServico = tempoServico;
		this.registro = registro;
	}
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		return "Professor(a): " + super.toString() + "matéria: " + materia + " / "
				+ "anos de experiência: " + tempoServico + " anos / "
				+ "registro: " + registro;
	}

	
	//Getters / Setters
	
	
	
	
	

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	public int getMatricula() {
		return registro;
	}

	public void setMatricula(int matricula) {
		this.registro = matricula;
	}
	
	
	
	
	
	
	
	

}
