package aula11;

public class Exer02Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	
	public Exer02Pessoa() {
	}

	public Exer02Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String imprimePessoa() {
		return "Nome: " + nome +
				"\nEndereço: " + endereco +
				"\nTelefone: " + telefone;
	}
	
	
}
