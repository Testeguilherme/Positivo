package lista02;

public class Exer03 {
	
	private Integer identificador;
	private String nome;
	private Double preco;
	private Double qtde;
	
	public Exer03() {
	}

	public Exer03(Integer identificador, String nome, Double preco, Double qtde) {
		this.identificador = identificador;
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public Exer03(Double preco, Double qtde) {
		this.preco = preco;
		this.qtde = qtde;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getQtde() {
		return qtde;
	}

	public void setQtde(Double qtde) {
		this.qtde = qtde;
	}

	public Double valorTotalEstoque() {
		Double valorTotal = preco * qtde;
		return valorTotal;
	}
	
	public void diminuiEstoque(Double qtde) {
		this.qtde -= qtde;
	}
	
	public void aumentaEstoque(Double qtde) {
		this.qtde += qtde;
	}

}
