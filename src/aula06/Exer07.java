package aula06;

import java.util.Random;
import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random(); 
		
		Integer numeroSorteado = rnd.nextInt(100);
		Integer numeroUsuario = 0;
		Integer contador = 0;
		System.out.println("Numero sorteado: " + numeroSorteado);
		System.out.println("Informe um número: ");
		
		do{
			System.out.println("");
			numeroUsuario = scanner.nextInt();
			
			if(numeroUsuario < numeroSorteado) {
				System.out.println("O número informado é MENOR que o número sorteado");
			} else if(numeroUsuario > numeroSorteado){
				System.out.println("O número informado é MAIOR que o número sorteado");
			}
			if(numeroUsuario == numeroSorteado) {
				System.out.println("VOCÊ ACERTOU!!!!");
			}else {
				System.out.println("\nTente novamente.");
			}
			contador++;
		}while(numeroUsuario != numeroSorteado);
		
		System.out.println("Você precisou de " + contador + " chances para acertar.");
	}
}
