package lista02;

import java.util.ArrayList;

public class Exer01 {
	
	public Integer fatorial(Integer number) {
		Integer numero1 = number;
		Integer numero2 = numero1 - 1;
		Integer cont = numero1;
		Integer soma = 0;
		
		for(int i = 0; i < cont; i++) {
			if(numero2 > 0) {
				soma = numero1 * numero2;
				numero1 = soma;
				numero2--;
			}
		}
		return soma;
	}
	
	public Double exponencial(Double num1, Double num2) {
		Double result = Math.pow(num1, num2);
		return result;
	}
	
	public Integer exponencialLaço(Integer num1, Integer num2) {
		Integer result = num1;
		for(int i = 1; i < num2; i++) {
			result = result * num1;
		}
		return result;
	}
	
	public Integer maior(int[] lista) {
		Integer maior = 0;
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] > maior) {
				maior = lista[i];
			}
		}
		return maior;
	}
}
