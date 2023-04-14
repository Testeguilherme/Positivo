package outros;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite: ");
		Integer num = scanner.nextInt();

		int soma = num;
		for(int i = 1; i < num; i++) {
			soma = soma * (num - i);
		}
		
		System.out.println("Soma: " + soma);
	}
}
