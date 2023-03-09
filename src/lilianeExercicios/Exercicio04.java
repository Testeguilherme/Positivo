package lilianeExercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva o número desejado: ");
		int num = scanner.nextInt();
		int soma = 0;
		
		if(num > 0) {
			for(int i = 0; i <= num; i+=2) {
				soma += i;
				System.out.println(i);
			}
		} else {
			System.out.println("Digite um número positivo na próxima.");
		}
		
		
		if(soma <= 0) {
			System.out.println("Não foi digitado um número válido, por isso não houve soma.");
		}else {
			System.out.println("Soma: " + soma);
		}
	}

}
