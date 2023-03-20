package aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer04ArrayList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		Integer contadorFila = 0;
		
		System.out.println("\n Escolha uma opção: \n\n"
				 + "1- Entrar \n"
				 + "2- Sair \n");
		Integer num = scanner.nextInt();
		
		while(num == 1) {
			System.out.println("\n Escolha a opção que deseja executar: \n\n"
					 + "1 - Adicionar um paciente.\n"
					 + "2 - Atender um paciente.\n"
					 + "3 - Desistência de um paciente. \n"
					 + "4 - Verificar a posição de um paciente na fila. \n"
					 + "5 - Verificar o tamanho da fila. \n"
					 + "6 - Imprimir a fila. \n"
					 + "7 - Sair. ");
			Integer number = scanner.nextInt();
			
			switch (number) {
			case 1: {
				System.out.println("\nDigite o nome do paciente para adicionar na fila: \n");
				String nome = scanner.nextLine();
				lista.add(nome);
				break;
			}
			case 2: {
				System.out.println("\nPrimeiro paciente da fila atendido! \n");
					lista.remove(0);
				break;
			}
			case 3: {
				System.out.println("\nDigite o nome do paciente que desistiu da fila:\n");
				String nome = scanner.nextLine();
				lista.remove(nome);
				System.out.println("\nPaciente excluido da fila! \n");
				break;
			}
			case 4: {
				System.out.println("\nDigite o nome do paciente para verificar sua posição na fila:\n");
				String nome = scanner.nextLine();
				System.out.println(lista.indexOf(nome));
				break;
			}
			case 5: {
				while(contadorFila < lista.size()) {
					contadorFila++;
				}
				System.out.println("\n A fila possui: " + contadorFila + " pacientes.");
				break;
			}
			case 6: {
				for(String pacientes : lista) {
					System.out.println("[" + pacientes + "]");
				}
				break;
			}
			default:
				num = 2;
			}
		}
	}
}
