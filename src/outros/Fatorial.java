package outros;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite: ");
		Integer num1 = scanner.nextInt();
		Integer num2 = num1 - 1;
		Integer contador = num1;
		Integer soma = 0;

		for(int i = 1; i < contador; i++) {
			if(num2 > 0) {
				soma = num1 * num2;
				num1 = soma;
				num2--;
			}
		}
		
		System.out.println("Soma: " + soma);
	}
}
