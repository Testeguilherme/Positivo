package aula06;

public class Exer03 {
	public static void main(String[] args) {
		
		Integer alturaChico = 150;
		Integer alturaZe = 110;
		Integer contador = 0;
		
		while(alturaChico >= alturaZe) {
			alturaChico += 2;
			alturaZe += 3;
			contador++;
		}
		System.out.println("Contador: " + contador);
		System.out.println("Altura Chico: " + alturaChico);
		System.out.println("Altura Zé: " + alturaZe);
		System.out.println("Foram necessários " + contador + " anos para Zé passar a altura de Chico.");
	}
}
