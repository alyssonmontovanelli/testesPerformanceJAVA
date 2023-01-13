package br.infnet.alysson.tp;

import java.util.Scanner;

public class ControleAcademico {
	
	private static String[] nomes;
	private static float[] av1;
	private static float[] av2;
	
	static Scanner in = new Scanner(System.in);
	
	private static void verifica(){
		int indice;
		
		System.out.print("Informe o código de cadastro do aluno: ");
		indice = in.nextInt();
		if(nomes[indice] != null){
			float media = (av1[indice] + av2[indice]) / 2;
			String situacao;
			if(10 >= media && media> 7){
				situacao = "Aprovado";
			}
			else if(media<=7 && media>4){
				situacao = "Prova final";
			}
			else{
				situacao = "Reprovado";
			}
			System.out.println("Nome: " + nomes[indice] + 
					" / Nota da AV1: " + av1[indice] + 
					" / Nota da AV2: " + av2[indice] +
					" / Média final: " + media +
					" / Situação: " + situacao);
			indice++;
		}
		else{
			System.out.println("Informe um registro válido.");
		}
	}
	
	private static void informaTurma(int tamanho){
		System.out.println("Boletim Final da turma:");
		for(int i = 0 ; i < tamanho ; i++){
			
			float media = (av1[i] + av2[i]) / 2;
			String situacao;
			if(10 >= media && media> 7){
				situacao = "Aprovado";
			}
			else if(media<=7 && media>4){
				situacao = "Prova final";
			}
			else{
				situacao = "Reprovado";
			}
			
			System.out.println("Nome: " + nomes[i] + 
					" / Nota da AV1: " + av1[i] + 
					" / Nota da AV2: " + av2[i] +
					" / Média final: " + media +
					" / Situação: " + situacao);
		}
	}
	
	public static void main(String[] args) {
		final int LIMITE = 100;
		
		nomes = new String[LIMITE];
		av1 = new float[LIMITE];
		av2 = new float[LIMITE];
		
		Scanner in = new Scanner(System.in);
		String opcao;
		int posicao = 0;
		do {
			System.out.println(" ");
			System.out.println("Controle acadêmico");
			System.out.println("[1] - Efeturar registro de novo aluno");
			System.out.println("[2] - Consultar boletim de um aluno");
			System.out.println("[3] - Consultar notas da turma");
			System.out.println("[4] - Sair");
			System.out.print("Escolha uma das opções acima: ");
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				System.out.print("Informe o nome do aluno: ");
				nomes[posicao] = in.next();
				
				System.out.print("De 0 a 10, informe a nota que este aluno tirou na avaliação 1 (AV1): ");
				av1[posicao] = in.nextFloat();
				
				System.out.println("E a nota da avaliação 2 (AV2), de 0 a 10: ");
				av2[posicao] = in.nextFloat();
				
				System.out.println("Informações do aluno " + nomes[posicao] + " registradas com o código número " + posicao);
				
				posicao++;

				break;
				//-------------------------------------------------------
			case "2":
				
				verifica();
				
				break;
				
			case "3":
				
				informaTurma(posicao);
				
				break;

			default:
				System.out.println("Por favor, escolha uma opção válida.");
				break;
			}			
		} while (!"4".equalsIgnoreCase(opcao));
		System.out.println("Processamento encerrado com sucesso!");
		
		in.close();
	}

}
