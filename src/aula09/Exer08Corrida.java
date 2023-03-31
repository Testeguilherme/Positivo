package aula09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exer08Corrida {
	
	private String dataCorrida;
	private String horaCorrida;
	private List<Exer08Pessoa> pessoa = new ArrayList<Exer08Pessoa>();
	
	public Exer08Corrida() {
	}

	public Exer08Corrida(String dataCorrida, String horaCorrida, List<Exer08Pessoa> pessoa) {
		this.dataCorrida = dataCorrida;
		this.horaCorrida = horaCorrida;
		this.pessoa = pessoa;
	}
	
	public Exer08Corrida(String dataCorrida, String horaCorrida) {
		this.dataCorrida = dataCorrida;
		this.horaCorrida = horaCorrida;
	}

	public String getDataCorrida() {
		return dataCorrida;
	}

	public void setDataCorrida(String dataCorrida) {
		this.dataCorrida = dataCorrida;
	}

	public String getHoraCorrida() {
		return horaCorrida;
	}

	public void setHoraCorrida(String horaCorrida) {
		this.horaCorrida = horaCorrida;
	}

	public List<Exer08Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Exer08Pessoa> pessoa) {
		this.pessoa = pessoa;
	}
	
	public void adicionar(Exer08Pessoa pessoa2) {
		pessoa.add(pessoa2);
	}
	
	public void remover(Exer08Pessoa pessoa2) {
		pessoa.remove(pessoa2);
	}
	
	public void dataHora() {
		System.out.println("Data: " + this.dataCorrida);
		System.out.println("Hora: " + this.horaCorrida);
	}
	
	public void idadeMaior(Integer idade) {
		int cont = 0;
		for(Exer08Pessoa idades : pessoa) {
			if(idades.getIdade() > idade) {
				cont++;
			}
		}
		System.out.println(cont + " pessoa(as) possui(em) idade maior");
	}
	
	public void imc() {
		int cont = 0;
		for (Exer08Pessoa exer08Pessoa : pessoa) {
			Double calculaImc = exer08Pessoa.getPeso() / (exer08Pessoa.getAltura() * exer08Pessoa.getAltura());
			if(calculaImc >= 18.5 && calculaImc < 25) {
				System.out.println("Peso normal, imc: " + calculaImc);
				cont++;
			} else if(calculaImc >= 25 && calculaImc < 30) {
				System.out.println("Sobrepeso, imc: " + calculaImc);
			} else if(calculaImc >= 30) {
				System.out.println("Obesidade, imc: " + calculaImc);
			}else {
				System.out.println("Baixo peso, imc: " + calculaImc);
			}
		}
		System.out.println(cont + " pessoas com imc normal");
	}
	
}
