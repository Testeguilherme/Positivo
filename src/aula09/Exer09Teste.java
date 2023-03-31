package aula09;

import java.util.Scanner;

public class Exer09Teste {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
	
	Exer09Jogador jogador1 = new Exer09Jogador("Leonardo", 7, "Leo", 2, true);
	Exer09Jogador jogador2 = new Exer09Jogador("Guilherme", 10, "Gui", 5, false);
	Exer09Jogador jogador3 = new Exer09Jogador("Pedro", 23, "Pedrao", 3, false);
	Exer09Jogador jogador4 = new Exer09Jogador("Vitor", 9, "Vitao", 10, true);
	Exer09Jogador jogador5 = new Exer09Jogador("Daniel", 11, "Dan", 0, false);
	
	
	System.out.println("Digite o nome do jogador que deseja remover: ");
	String nome = scanner.next();
	
	Exer09Time time1 = new Exer09Time();
	
	time1.imprimeNomes();
	time1.adicionar(jogador1);
	time1.adicionar(jogador2);
	time1.adicionar(jogador3);
	time1.adicionar(jogador4);
	time1.adicionar(jogador5);
	
	time1.qtdeJogadores();
	time1.remover(nome);
	
	time1.qtdeJogadores();
	time1.jogadoresSuspensos();
	time1.totalCartoes();
	
	
	}
}
