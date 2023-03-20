package aula06;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Double massaFinal = 0.0;
		Double massaInicial = 0d;
		Integer contador = 0;
		Integer contHoras = 0;
		
		System.out.println("Escreva a massa inicial do material: ");
		massaFinal = scanner.nextDouble();
		massaInicial = massaFinal;
		
		do {
			System.out.println("Massa final: " + massaFinal);
			contador++;
			massaFinal /= 2;
		}while(massaFinal > 0.5);
		
		contador -= 1;
		Integer segundos = contador * 50;
		System.out.println("Segundos: " + segundos);
		System.out.println("Contador: " + contador);
		Integer horas = segundos/3600;
		System.out.println("Horas: " + horas);
		segundos %= 3600;
		Integer minutos = segundos / 60;
		System.out.println("Minutos: " + minutos);
		segundos %= 60;
		System.out.println("Segundos: " + segundos);
		
		System.out.println("Massa inicial: " + massaInicial);
		System.out.println("Massa final: " + massaFinal);
		
		if(horas >= 0) {
			System.out.printf("%d horas, ", horas);
		} 
		if(minutos >= 0) {
			System.out.printf("%d minutos, e ", minutos);
		}
		if(segundos >= 0) {
			System.out.printf("%d segundos.", segundos);
		}
	}
}
