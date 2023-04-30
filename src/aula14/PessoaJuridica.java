package aula14;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, String endereco, Double rendaBruta, String cnpj) {
		super(nome, endereco, rendaBruta);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public Double calculaImposto() {
		return super.calculaImposto();
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco()
				+ ", getRendaBruta()=" + getRendaBruta() + "]";
	}
	
	
	
	

}
