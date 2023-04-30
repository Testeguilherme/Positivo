package aula14;

public class PessoaFisica extends Pessoa{
	
	public String cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String endereco, Double rendaBruta, String cpf) {
		super(nome, endereco, rendaBruta);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public Double calculaImposto() {
		if(getRendaBruta() <= 1400 && getRendaBruta() >= 0) {
			return 1d;
		}else if(getRendaBruta() <= 2100 && getRendaBruta() > 1400) {
			return (getRendaBruta() * 0.1) - 100;
		}else if(getRendaBruta() <= 2800 && getRendaBruta() > 2100) {
			return (getRendaBruta() * 0.15) - 270;
		}else if(getRendaBruta() <= 3600 && getRendaBruta() > 2800) {
			return (getRendaBruta() * 0.25) - 500;
		}else if(getRendaBruta() > 3600) {
			return (getRendaBruta() * 0.30) - 700;
		} return 0d;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco()
				+ ", getRendaBruta()=" + getRendaBruta() + "]";
	}

	
	
	

}
