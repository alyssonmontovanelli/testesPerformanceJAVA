package br.infnet.alysson.aplication;

import java.util.Arrays;
import java.util.Scanner;

import br.infnet.alysson.dominio.Aluno;
import br.infnet.alysson.dominio.Pessoa;
import br.infnet.alysson.dominio.Professor;
import br.infnet.alysson.dominio.auxiliar.Constante;

public class Aplication {
	
	private static Pessoa[] pessoas; //Criando vetor com o tipo "Pessoa"

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		pessoas = new Pessoa[Constante.TAMANHO];
		
		
		String opcao;
		
		int pos = 0; // PARA posicionar informações nos Arrays
		
		do{
			System.out.println("[1] Cadastrar Professor"); 
			System.out.println("[2] Cadastrar aluno"); 
			System.out.println("[3] Consultar situação de um docente/discente."); 
			System.out.println("[4] Consultar todos");
			System.out.println("[5] Sair");
			System.out.print("Digite uma das opções do menu: ");
			opcao = in.next();
			
			//SWITCH ( serve para condicionais de valores definidos do tipo "1","2", "3"... - if deve ser usado para "x>220";
			
			switch(opcao){
			case "1":
				if(pos < Constante.TAMANHO){
					
					Professor prof = new Professor(); //instanciando o obj do tipo Professor e dps colocando no vetor pessoas
					
					System.out.print("Informe o nome do Professor(a): ");						
					prof.setNome(in.next()); // prof[pos] = in.next();
					
					System.out.print("Informe a idade: ");						
					prof.setIdade(in.nextInt()); //[pos] = in.nextInt();
					
					System.out.print("Informe a matéria que ele(a) leciona: ");						
					prof.setMateria(in.next());
					
					System.out.print("Quantos anos de experiência ele(a) tem? ");						
					prof.setTempoServico(in.nextInt());
					
					System.out.print("Informe a matrícula de ensino: ");						
					prof.setMatricula(in.nextInt());
					
					pessoas[pos] = prof;
			
					System.out.println(prof.getNome() + " cadastrado com registro número: " + pos);
					
					pos++;
				
				}
				else{
					System.out.println("Impossível continuar o cadastramento, número de cadastro atingiu o limíte");
				}
				System.out.println(Arrays.toString(pessoas));
				break;
				
			case "2":
				if(pos < Constante.TAMANHO){
					
					Aluno alu = new Aluno();
					
					System.out.print("Informe o nome do aluno(a): ");						
					alu.setNome(in.next()); // prof[pos] = in.next();
					
					System.out.print("Informe a idade: ");						
					alu.setIdade(in.nextInt()); 
					
					System.out.print("Informe a turma que ele(a) pertence: ");						
					alu.setTurma(in.next());
					
					System.out.print("Qual a nota média? ");						
					alu.setMedia(in.nextFloat());
					
					System.out.print("Informe a matrícula de ensino: ");						
					alu.setMatricula(in.nextInt());
					
					pessoas[pos] = alu;
					
					System.out.println(alu.getNome() + " cadastrado com registro número: " + pos);
					
					pos++;
				
				}
				else{
					System.out.println("Impossível continuar o cadastramento, número de cadastro atingiu o limíte");
				}
				System.out.println(Arrays.toString(pessoas));
				break;
				
				
				
			case "3":
				int indice;
				
				System.out.println("Por favor, qual número registro procura?");
				indice = Integer.valueOf(in.nextInt());
				
				if(indice >= 0 && indice <= Constante.TAMANHO && pessoas[indice] != null){
					System.out.println(pessoas[indice]);	
				}
				else{
					System.out.println("Indice não possui usuário cadastrado");
				}
				break;
				
			case "4":
				
				for(int i = 0 ; i < pos ; i++ ){
					System.out.println("Cadastro número " + (i) + ": " + pessoas[i]);	
				}
				
				break;
				
			default:
				
				System.out.println("Opção inválida");
				
				break;
			}
			
			
		}while(!"5".equals(opcao)); // EQUALS serve para comparar string - não utilizar o "="
		
		System.out.println("Processamento finalizado!");
		
		
		in.close();
	}

}


