package aula06;

import java.util.Scanner;
public class Exer05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Integer matriz[][] = new Integer[2][2];
		Integer valores = 0;

		for(int i = 0; i < matriz.length; ++i) {
			for(int j = 0; j < matriz.length; ++j) {
				System.out.println("Informe o valor da linha " + i + ", coluna "+ j + ": ");
				Integer valor1 = scanner.nextInt();
				matriz[i][j] = valor1;
			}
		}
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 2; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
		
	}
}
