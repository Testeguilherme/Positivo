package aula11;

public class Exer02Teste {
	public static void main(String[] args) {
		
		Exer02Fornecedor fornecedor = new Exer02Fornecedor("Guilherme", "Rua desse lado", "3352-4567", 6700.00, 1350.00);
		
		Exer02Empregado empregado = new Exer02Empregado("Heisenberg", "Rua do outro lado", "3409-8981", 07, 1900.00, 0.1);
		
		
		fornecedor.obterSaldo();
		fornecedor.imprimeFornecedor();
		
		System.out.println();
		
		empregado.salarioLiquido();
		empregado.imprimeEmpregado();
		
	}
}
