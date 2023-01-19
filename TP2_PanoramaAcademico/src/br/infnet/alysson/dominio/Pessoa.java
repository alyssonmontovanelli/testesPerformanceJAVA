package br.infnet.alysson.dominio;

import br.infnet.alysson.dominio.auxiliar.Constante;

public class Pessoa {
	
	public String[] nomes;
	public int[] idades;

	private String nome;
	private int idade;

	
	public Pessoa(){
	
	}
	
	public Pessoa(String nomeInfo, int idadeInfo, String funcaoInfo){
		this.nome = nomeInfo;
		this.idade = idadeInfo;
	}
	
	
	//indice  vetores
	
	private int nomesIndice = 0;
	private int idadesIndice = 0;
	
	//Methods
	public void atribuirValores(){
		int i = this.idade;
		String n = this.nome;
		nomes[nomesIndice] = n;
		idades[idadesIndice] = i;
		nomesIndice++;
		idadesIndice++;
	}
	
	
	
	
	public String toString() {
		return nome + " - " + idade + " - " + nomes;
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
