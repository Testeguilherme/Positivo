package aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer03ArrayList {
	
	

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		Integer soma = 0;
		Integer contadorMedia = 0;
		System.out.println("\n Escolha a opção que deseja executar: \n\n"
						 + "1- Entrar \n"
						 + "2- Sair \n");
		Integer num = scanner.nextInt();
		while(num == 1) {
			System.out.println("\n Escolha a opção que deseja executar: \n\n"
					 + "1- Adicionar um número.\n"
					 + "2- Remover um número.\n"
					 + "3- Verificar a posição de um número. \n"
					 + "4- Modificar o número de uma determinada posição. \n"
					 + "5- Exibir a média dos valores. \n"
					 + "6- Exibir os números da lista. \n"
					 + "7- Sair. ");
			Integer number = scanner.nextInt();
			
			switch (number) {
			case 1: {
				System.out.println("\n Digite o número que deseja adicionar: ");
				Integer numero = scanner.nextInt();
				lista.add(numero);
				break;
			}
			case 2: {
				System.out.println("\n Digite o número que deseja remover: ");
				Integer numero = scanner.nextInt();
				lista.remove(numero);
				break;
			}
			case 3: {
				System.out.println("\n Digite o número que deseja verificar a posição: ");
				Integer numero = scanner.nextInt();
				for(int i = 0; i < lista.size(); i++) {
					if(lista.get(i).equals(numero) == true) {
						System.out.println("\n O número " + numero + " está na posição: " + i);
					}
				}
				break;
			}
			case 4: {
				System.out.println("\n Digite a posição que deseja modificar na lista: ");
				Integer posicao = scanner.nextInt();
				System.out.println("\n Digite o valor que deseja inserir na lista: ");
				Integer numero = scanner.nextInt();
				lista.set(posicao, numero);
				break;
			}
			case 5: {
				for(Integer item : lista) {
					soma += item;
					contadorMedia++;
				}
				System.out.println("\n A soma dos valores é: " + soma);
				System.out.println("\n A média dos valores é: " + soma/contadorMedia);
				break;
			}
			case 6: {
				for(Integer item : lista) {
					System.out.print("[" + item + "]");
				}
				System.out.println("\n");
				break;
			}
			default:
				num = 2;
			}
		}
	}
}
