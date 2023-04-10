package aula11;

public class Exer02Fornecedor extends Exer02Pessoa{
	
	private Double valorCredito;
	private Double valorDivida;
	
	public Exer02Fornecedor() {
	}

	public Exer02Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(Double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo() {
		Double result = this.valorCredito - this.valorDivida;
		System.out.println("Total de crédito: " + result); 
	}

	public void imprimeFornecedor() {
		System.out.println( imprimePessoa() +
				"\nValor de crédito: "+ valorCredito +
				"\nValor dívida: " + valorDivida);
	}
	
}
