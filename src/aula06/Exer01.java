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
		boolean system = true;
		System.out.println("Digite os números desejados (caso queira sair, digite um número negativo): ");
		
		do{
			num = scanner.nextDouble();
			
			if(system) {
				maior = num;
				menor = num;
			}
			
			system = false;
			
			if(num > 0) {
				if(maior < num) {
					maior = num;
				} 
					
				if(menor > num){
					menor = num;
				}
			}
				
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
