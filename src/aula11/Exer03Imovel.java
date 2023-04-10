package aula11;

public class Exer03Imovel {
	
	private String endereco;
	private Double preco;
	
	public Exer03Imovel() {
	}

	public Exer03Imovel(String endereco, Double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String imprimeImovel() {
		return "Endereço do imóvel: " + endereco +
				"\nPreço imóvel:  " + preco;
	}

}
