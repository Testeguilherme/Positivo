package aula16;

import java.util.Arrays;

//GUILHERME FRIAS, LEONARDO OLIVEIRA, VICTOR MOTA

public class Candidato {
	
	private String nome;
	private String cpf;
	String[] lista = new String[10];
	
	public Candidato() {
	}
	
	public Candidato(String nome, String cpf, String[] lista) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.lista = lista;
	}
	
	public Candidato(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String[] getLista() {
		return lista;
	}

	public void setLista(String[] lista) {
		this.lista = lista;
	}
	
	public void addResposta(String nota) {
		for(int i = 0; i < 10; i++) {
			if(nota.equals("a") || nota.equals("b") || nota.equals("c") || nota.equals("d") || nota.equals("e")) {
				lista[i] = nota;
			}else {
				i--;
			}
		}
	}

}