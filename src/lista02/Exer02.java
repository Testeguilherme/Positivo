package lista02;

public class Exer02 {
	
	private String nome;
	private Integer matricula;
	private Double notaProva1;
	private Double notaProva2;
	private Double notaTrabalho;
	
	public Exer02() {
	}

	public Exer02(String nome, Integer matricula, Double notaProva1, Double notaProva2, Double notaTrabalho) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}
	
	public Exer02(Double notaProva1, Double notaProva2, Double notaTrabalho) {
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getNotaProva1() {
		return notaProva1;
	}

	public void setNotaProva1(Double notaProva1) {
		this.notaProva1 = notaProva1;
	}

	public Double getNotaProva2() {
		return notaProva2;
	}

	public void setNotaProva2(Double notaProva2) {
		this.notaProva2 = notaProva2;
	}

	public Double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(Double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	public Double calculaMediaPonderada() {
		Double notaFinalProva01 = this.notaProva1 * 1.5;
		Double notaFinalProva02 = this.notaProva2 * 1.5;
		Double notaFinalTrabalho = this.notaTrabalho;
		Double mediaFinal = (notaFinalProva01 + notaFinalProva02 + notaFinalTrabalho) / 4;
		return mediaFinal;
	}
	
	public Integer verificaSituacaoAluno() {
		if(calculaMediaPonderada() >= 6.0) {
			return 1;
		} else if(calculaMediaPonderada() >= 4.0) {
			return 2;
		} else {
			return 3;
		}
		
	}
	
}
