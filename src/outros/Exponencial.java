package outros;

import java.util.Scanner;

public class Exponencial {
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite: ");
			Integer num1 = scanner.nextInt();
			Integer num2 = scanner.nextInt();
			
			Integer result = num1;
			for(int i = 1; i < num2; i++) {
				result = result * num1;
			}
			System.out.println("Resultado: " + result);
	}
}
