package aula09;

import java.util.Scanner;

public class Exer08Teste {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Exer08Pessoa pessoa1 = new Exer08Pessoa("Guilherme", 24, 70.0, 1.75);
		Exer08Pessoa pessoa2 = new Exer08Pessoa("Joaquin", 30, 70.0, 1.75);
		Exer08Pessoa pessoa3 = new Exer08Pessoa("Hunger", 25, 70.0, 1.75);
		Exer08Pessoa pessoa4 = new Exer08Pessoa("Pedrin", 25, 110.0, 1.75);
		Exer08Corrida corrida = new Exer08Corrida("Hoje", "13h");
		
		corrida.adicionar(pessoa1);
		corrida.adicionar(pessoa2);
		corrida.adicionar(pessoa3);
		corrida.adicionar(pessoa4);
		
		System.out.println("Informe a idade desejada: ");
		Integer idade = scanner.nextInt();
		
		System.out.println();
		corrida.dataHora();
		System.out.println();
		
		corrida.idadeMaior(idade);
		
		System.out.println();
		corrida.imc();
		
		
	}
}
