package aula11;

public class Exer02Empregado extends Exer02Pessoa{

	private Integer codigoSetor;
	private Double salarioBase;
	private Double imposto;
	
	public Exer02Empregado() {
	}

	public Exer02Empregado(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public Integer getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public void salarioLiquido() {
		Double salarioLiquido = salarioBase - (salarioBase * imposto);
		System.out.println("Salário líquido: " + salarioLiquido);
	}
	
	public void imprimeEmpregado() {
		System.out.println(imprimePessoa() +
				"\nCódigo do setor: " + codigoSetor +
				"\nSalário base: " + salarioBase + 
				"\nImposto: " + imposto);
	}
	
	
}
