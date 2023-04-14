package lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer01 {
	
	public Integer fatorial(Integer number) {
		int soma = number;
		for(int i = 1; i < number; i++) {
			soma = soma * (number - i);
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
