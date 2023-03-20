package aula06;

import java.util.Scanner;

public class Exer06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a velocidade do motorista em km/h: ");
		Double velocidade = scanner.nextDouble();
		System.out.println("Digite a velocidade máxima da pista em km/h: ");
		Double velocidadePista = scanner.nextDouble();
		
		Double multaLeve = velocidadePista + (velocidadePista * 0.2);
		Double multaMedia = velocidadePista + (velocidadePista * 0.5);
		System.out.println("Multa leve: " + multaLeve);
		System.out.println("Multa media: " + multaMedia);
		
		if(velocidade > velocidadePista && velocidade <= multaLeve){
			System.out.println("A multa deve ser de R$130,16");
		} else if(velocidade > multaLeve && velocidade <= multaMedia) {
			System.out.println("A multa deve ser de R$195,23");
		}else {
			System.out.println("A multa deve ser de R$880,41");
		}
	}
}
