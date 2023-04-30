package aula16;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Concurso concurso = new Concurso();
		Candidato c1 = new Candidato("Guilherme", "0127348121-90");
		Candidato c2 = new Candidato("Leonardo", "3463433344-83");
		Candidato c3 = new Candidato("Victor", "17171717171-98");
		concurso.listaCandidatos.add(c1);
		concurso.listaCandidatos.add(c2);
		concurso.listaCandidatos.add(c3);
		String nota = null;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(c1.getNome() + " digite uma alternativa:");
			nota = scanner.next();
			if(nota.equals("a") || nota.equals("b") || nota.equals("c") || nota.equals("d") || nota.equals("e")) {
				c1.lista[i] = nota;
			}else {
				System.out.println("Digite uma alternativa válida!");
				i--;
			}
		}
		System.out.println("");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(c2.getNome() + " digite uma alternativa:");
			nota = scanner.next();
			if(nota.equals("a") || nota.equals("b") || nota.equals("c") || nota.equals("d") || nota.equals("e")) {
				c2.lista[i] = nota;
			}else {
				System.out.println("Digite uma alternativa válida!");
				i--;
			}
		}
		System.out.println("");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(c3.getNome() + " digite uma alternativa:");
			nota = scanner.next();
			if(nota.equals("a") || nota.equals("b") || nota.equals("c") || nota.equals("d") || nota.equals("e")) {
				c3.lista[i] = nota;
			}else {
				System.out.println("Digite uma alternativa válida!");
				i--;
			}
		}
		
		
		concurso.corrigirTodasAsProvas();
		

		
		
	}
}
