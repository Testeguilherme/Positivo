package aula09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exer09Time {
	
	private String nome;
	private List<Exer09Jogador> lista = new ArrayList<Exer09Jogador>();
	
	public Exer09Time() {
	}

	public Exer09Time(String nome, List<Exer09Jogador> lista) {
		this.nome = nome;
		this.lista = lista;
	}
	
	public Exer09Time(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Exer09Jogador> getLista() {
		return lista;
	}

	public void setLista(List<Exer09Jogador> lista) {
		this.lista = lista;
	}
	
	public void adicionar(Exer09Jogador jogador) {
		lista.add(jogador);
	}
	
	public void remover(String jogador) {
		for(Exer09Jogador itens : lista) {
			if(itens.getNome().equals(jogador)) {
				lista.remove(itens);
			}
		}
	}
	
	public void imprimeNomes() {
		for(Exer09Jogador itens : lista) {
			System.out.println(itens.getNome());
		}
	}
	
	public void qtdeJogadores() {
		System.out.println("Quantidade de jogadores: "+ lista.size());
	}
	
	public void jogadoresSuspensos() {
		int contador = 0;
		for(Exer09Jogador itens : lista) {
			if(itens.getSuspenso() == true) {
				contador++;
			}
		}
		System.out.println("Numero de jogadores suspenso: " + contador);
	}
	
	public void totalCartoes() {
		int soma = 0;
		for(Exer09Jogador itens : lista) {
			soma += itens.getCartoes();
		}
		System.out.println("Numero total de cartões: " + soma);
	}
	

}
