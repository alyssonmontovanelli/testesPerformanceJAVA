package br.infnet.alysson.dominio;

public class Aluno extends Pessoa{
	
	private String curso;
	private float media;
	private int matricula;
	
	
	public Aluno(){
		
	}
	
	public Aluno(String nome, int idade, String turma, float media, int matricula){
		super(nome, idade);
		this.curso = turma;
		this.media = media;
		this.matricula = matricula;
	}
	
	
	
	
	
	
	
	
	public String toString() {
		return "Aluno(a) " + super.toString() +"curso: " + curso + " / "
				+ "nota: " + media + " / "
				+ "matrícula: " + matricula;
	}
	
		
	//Getters / Setters
	public String getTurma() {
		return curso;
	}
	public void setTurma(String turma) {
		this.curso = turma;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
	

	
	

}
