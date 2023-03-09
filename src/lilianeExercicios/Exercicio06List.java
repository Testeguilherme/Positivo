package lilianeExercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio06List {

	public static void main(String[] args) {

		
		Boolean system = true;
		List<String> lista = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		int cont = 0;
		
		System.out.println("Digite o sobrenome: ");
		String sobrenome = scanner.next();
		System.out.println(" ");
		System.out.println("Digite os nomes desejados(digite 'fim' para sair): ");
		
		while(system) {
			String nomes = scanner.nextLine();
			if(nomes.contains(sobrenome)) {
				lista.add(nomes);
				cont++;
			}
			if(nomes.contains("fim")){
				system = false;
			}
		}
		System.out.println(cont + " pessoas possuem o sobrenome indicado.");
		Iterator<String> iterator = lista.iterator();
		while(iterator.hasNext()) {
			System.out.println("Nome: " + iterator.next());
		}
	}

}
