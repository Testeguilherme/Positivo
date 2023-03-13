package VetorEMatrizes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListExer04 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		Integer num = 0;
		Integer number = 0;
		
		System.out.println("Digite os 10 numeros: ");
		
		for(int i = 0; i < 10; i++) {
			num = scanner.nextInt();
			lista.add(num);
		}
		
		Iterator<Integer> iterator = lista.iterator();
		
		while(iterator.hasNext()) {
			number = iterator.next();
			if(lista.contains(number)) {
				lista2.add(number);
			}
		}
		
		Iterator<Integer> iterator2 = lista2.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
