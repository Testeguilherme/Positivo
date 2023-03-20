package aula06;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Integer massaFinal = 0;
		Integer massaInicial = 0;
		Integer contador = 0;
		Integer contHoras = 0;
		
		System.out.println("Escreva a massa inicial do material: ");
		massaFinal = scanner.nextInt();
		massaInicial = massaFinal;
		
		while(massaFinal > 0.5) {
			massaFinal /= 2;
			contador++;
		}
		
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
			System.out.print(horas + " horas, ");
		} 
		if(minutos > 0) {
			System.out.print(minutos + " minutos, e ");
		}
		if(segundos > 0) {
			System.out.print(segundos + " segundos.");
		}
		
	}
}
