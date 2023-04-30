package aula14;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private Double rendaBruta;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String endereco, Double rendaBruta) {
		this.nome = nome;
		this.endereco = endereco;
		this.rendaBruta = rendaBruta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(Double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public Double calculaImposto() {
		Double imposto = this.rendaBruta * 0.1;
		return imposto;
	}
	

}
