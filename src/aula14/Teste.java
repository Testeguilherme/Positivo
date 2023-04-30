package aula14;

import java.util.Scanner;

import aula10.DesafioContato;

public class Teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Pessoa p = new Pessoa();
		PessoaFisica pf1 = new PessoaFisica("Guilherme", "Rua do lado", 2000.0, "06271243123-98");
		PessoaFisica pf2 = new PessoaFisica("Harry Potter", "Rua de frente", 3000.0, "19124124812-70");
		PessoaJuridica pj1 = new PessoaJuridica("Hogwarts Ltda", "La longe", 10000.0, "3151684-90/124");
		PessoaJuridica pj2 = new PessoaJuridica("Jubileu Ltda", "Aqui perto", 20000.0, "78127412-65/109");
		
		ReceitaFederal rf = new ReceitaFederal();
//		rf.adiciona(pj1);
//		rf.adiciona(pj2);
		rf.adiciona(pf1);
		rf.adiciona(pf2);
		

		rf.imprimeLista();
		
//		System.out.println("Escolha uma opção: \n" 
//				+ "1- Entrar \n" 
//				+ "2- Sair \n");
//
//		Integer num = scanner.nextInt();
//		while (num == 1) {
//			System.out.println("\n Escolha a opção que deseja executar: \n" 
//					+ "1- Adicionar uma pessoa na lista\n"
//					+ "2- Remover uma pessoa da lista\n" 
//					+ "3- Exibir a quantidade de Pessoas Físicas: \n"
//					+ "4- Exibir a quantidade de Pessoas Jurídicas:\n" 
//					+ "5- Calcular o imposto de uma Pessoa Física/Jurídica: \n" 
//					+ "6- Imprimir toda a lista: \n" 
//					+ "7- Sair");
//			Integer number = scanner.nextInt();
//
//			switch (number) {
//			case 1: {
//				
//				break;
//			}
//			case 2: {
//				
//				break;
//			}
//			case 3: {
//				break;
//			}
//			case 4: {
//				break;
//			}
//			case 5: {
//				break;
//			}
//			case 6: {
//				rf.imprimeLista();
//				break;
//			}
//			default:
//				num = 2;
//			}
//		}
	}

}
