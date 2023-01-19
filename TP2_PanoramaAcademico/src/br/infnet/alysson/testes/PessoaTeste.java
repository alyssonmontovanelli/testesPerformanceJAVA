package br.infnet.alysson.testes;

import br.infnet.alysson.dominio.Pessoa;
import br.infnet.alysson.dominio.auxiliar.Constante;

public class PessoaTeste {

	public static void main(String[] args) {
		String[] nomes;
		nomes = new String[Constante.TAMANHO];

		int i = 0;
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Alysson");
		p1.setIdade(26);
		
		System.out.println(nomes[i] = p1.getNome());
		System.out.println(nomes.length);
		System.out.println(nomes[0]);
		
		
		
		
		
		
	}

}
