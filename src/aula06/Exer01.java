package aula06;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer cont = 0;
		Double num = 0d;
		Double soma = 0d;
		Double media = 0d;
		Double maior = 0d;
		Double menor =  0d;
		System.out.println("Digite o número desejado (caso queira sair, digite um número negativo): ");
		
		do{
			num = scanner.nextDouble();

			if(num > 0) {
				if(num > maior) {
					maior = num;
				} 
				
				if(num < menor){
					menor = num;
				}
			}
			System.out.println("Maior: "+ maior);

			System.out.println("Menor: " + menor);
			
			
			if(num > 0) {
				soma += num;
				cont++;
			}
			
		}while(num > 0);
		
			media = soma/cont;
			System.out.println("Contador: " + cont);
			System.out.println("Soma: " + soma);
			System.out.println("Média: " + media);
			System.out.println("Maior: " + maior);
			System.out.println("Menor: " + menor);
	}
}
