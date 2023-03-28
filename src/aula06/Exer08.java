package aula06;

import java.util.Scanner;

public class Exer08 {
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o nome: ");
			String nome = scanner.nextLine();
			String[] partes = nome.split(" ");
		
			for(int i = 0; i < partes.length; i++) {
				if(partes[i].length() > 2) {
					char result1 = partes[i].charAt(0);
					System.out.print(result1 + ". "); 
				}else {
					System.out.print(partes[i] + " ");
				}
			}
	}
}
