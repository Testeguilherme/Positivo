package aula11;

public class Exer03Teste {
	public static void main(String[] args) {
		
		Exer03Imovel imovel = new Exer03Imovel("Rua daqui de frente", 3000.00);
		Exer03Imovel imovel2 = new Exer03Imovel("Rua esquisita", 4000.00);
		Exer03Novo novo = new Exer03Novo(0.1);
		Exer03Velho velho = new Exer03Velho(0.1);
		
		System.out.println(imovel.getPreco()); 
		novo.setNovoPreco(imovel);
		System.out.println(imovel.imprimeImovel()); 
		
		System.out.println();
		
		System.out.println(imovel2.getPreco());
		velho.setPrecoDesconto(imovel2);
		System.out.println(imovel2.imprimeImovel()); 
	}
}
