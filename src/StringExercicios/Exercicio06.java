package StringExercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Boolean system = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o sobrenome: ");
		String sobrenome = scanner.next();
		int cont = 0;
		
		System.out.println(" ");
		System.out.println("Digite os nomes desejados(digite 'fim' para sair): ");
		
		while(system) {
			String nomes = scanner.nextLine();
			if(nomes.contains(sobrenome)) {
				cont++;
			}
			if(nomes.contains("fim")){
				system = false;
			}
		}
		System.out.println(cont + " pessoas possuem o sobrenome indicado.");
	}

}
