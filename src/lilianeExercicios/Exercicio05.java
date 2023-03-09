package lilianeExercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int soma = 0;
		int cont = 0;

		do {
			System.out.println("Escreva o número desejado: ");
			num = scanner.nextInt();
			soma += num;
			if(num != 0) {
				cont++;
			}
		}while(num !=0);
		
		System.out.println("Soma: " + soma);
		System.out.println("Cont: " + cont);
		System.out.println("Média: " + soma/cont);

	}

}
