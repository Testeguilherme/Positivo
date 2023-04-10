package aula11;

public class Exer03Velho extends Exer03Imovel{
	
	private Double porcentagemDesvalorizacao;

	public Exer03Velho() {
	}

	public Exer03Velho(Double porcentagemDesvalorizacao) {
		this.porcentagemDesvalorizacao = porcentagemDesvalorizacao;
	}

	public Double getPorcentagemDesvalorizacao() {
		return porcentagemDesvalorizacao;
	}

	public void setPorcentagemDesvalorizacao(Double porcentagemDesvalorizacao) {
		this.porcentagemDesvalorizacao = porcentagemDesvalorizacao;
	}

	public void setPrecoDesconto(Exer03Imovel imovel) {
		Double valorDescontado = imovel.getPreco() - (imovel.getPreco() * porcentagemDesvalorizacao);
		imovel.setPreco(valorDescontado);
		System.out.println("Valor do imóvel com desconto: " + valorDescontado);
	}
	
	
	public void imprimeVelho() {
		System.out.println(imprimeImovel() +
				"\nProcentagem de desconto: " + porcentagemDesvalorizacao +
				"\nValor do imóvel com desconto: " + getPreco());
	}

}
