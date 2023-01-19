package br.infnet.alysson.dominio;

import br.infnet.alysson.dominio.auxiliar.Constante;

public class Pessoa {
	
	private String nome;
	private int idade;

	
	public Pessoa(){
	
	}
	
	public Pessoa(String nomeInfo, int idadeInfo){
		this.nome = nomeInfo;
		this.idade = idadeInfo;
	}
	
	
	//indice  vetores
	
	//Methods
	
	
	
	
	
	public String toString() {
		return nome + " / " + "idade: " + idade + " / ";
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
