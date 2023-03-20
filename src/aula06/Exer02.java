package aula06;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva um número de 4 algarismos: ");
		String n = scanner.next();
		
		String parte1 = n.substring(0, 2);
		System.out.println("Parte 1: " + parte1);
		String parte2 = n.substring(2, 4);
		System.out.println("Parte 2: " + parte2);
		Integer num1 = Integer.parseInt(parte1);
		Integer num2 = Integer.parseInt(parte2);
		
		Integer numero = Integer.parseInt(n);
		System.out.println("Numero: "+ numero);
		
		Integer soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		Integer raizQuadrada = soma * soma;
		System.out.println("Raiz Quadrada: " + raizQuadrada);
		
	}
}
