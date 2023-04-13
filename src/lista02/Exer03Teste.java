package lista02;

public class Exer03Teste {
	public static void main(String[] args) {

		Exer03 e3 = new Exer03(1500.0, 3.0);
		System.out.println("Estoque inicial: " + e3.getQtde());
		System.out.println("Preco total: " + e3.valorTotalEstoque());
		e3.diminuiEstoque(1.0);
		System.out.println("Estoque final: " + e3.getQtde());
		System.out.println("Preco total: " + e3.valorTotalEstoque());
		e3.aumentaEstoque(5d);
		System.out.println("Estoque final2: " + e3.getQtde());
		System.out.println("Preco total: " + e3.valorTotalEstoque());
	}
}
