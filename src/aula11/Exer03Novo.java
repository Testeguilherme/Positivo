package aula11;

public class Exer03Novo extends Exer03Imovel{
	
	private Double porcentagemValorizacao;

	public Exer03Novo() {
	}

	public Exer03Novo(Double porcentagemValorizacao) {
		this.porcentagemValorizacao = porcentagemValorizacao;
	}

	public Double getPorcentagemValorizacao() {
		return porcentagemValorizacao;
	}

	public void setPorcentagemValorizacao(Double porcentagemValorizacao) {
		this.porcentagemValorizacao = porcentagemValorizacao;
	}
	
	public void setNovoPreco(Exer03Imovel imovel) {
		Double novoValorImovel = imovel.getPreco() + (imovel.getPreco() * porcentagemValorizacao); 
		imovel.setPreco(novoValorImovel);
		System.out.println("Valor do imóvel valorizado: " + novoValorImovel);
	}
	
	public void imprimeNovo() {
		System.out.println( imprimeImovel() +
				"\nProcentagem de valorização: " + porcentagemValorizacao +
				"\nValor do imóvel valorizado: " + getPreco());
	}
	

}
