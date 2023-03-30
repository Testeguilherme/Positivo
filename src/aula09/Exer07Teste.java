package aula09;

import java.util.Scanner;

public class Exer07Teste {
	public static void main(String[] args) {
		
		Exer07 teste = new Exer07();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n Escolha uma opção: \n\n"
				 + "1- Entrar \n"
				 + "2- Sair \n");
		Integer num = scanner.nextInt();
		
		while(num == 1) {
			System.out.println("\n Escolha a opção que deseja executar: \n\n"
					 + "1 - Adicionar um item na lista.\n"
					 + "2 - Remover um item da lista.\n"
					 + "3 - Buscar um item na lista. \n"
					 + "4 - Exibir o tamanho da lista. \n"
					 + "5 - Imprimir a lista. \n"
					 + "6 - Sair.  \n");
			Integer number = scanner.nextInt();
			
			switch (number) {
			case 1: {
				System.out.println("\nDigite o elemento para adicionar na lista: \n");
				Integer numero = scanner.nextInt();
				teste.adiciona(numero);
				break;
			}
			case 2: {
				System.out.println("\nDigite o elemento para remover da lista: \n");
				Integer numero = scanner.nextInt();
				teste.remove(numero);
				break;
			}
			case 3: {
				System.out.println("\nDigite o elemento para buscar na lista: \n");
				Integer numero = scanner.nextInt();
				teste.busca(numero);;
				break;
			}
			case 4: {
				teste.tamanho();
				break;
			}
			case 5: {
				teste.imprime();
				break;
			}
			default:
				num = 2;
			}
		}
	}
}
