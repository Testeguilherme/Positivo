package aula09;

import java.util.ArrayList;

public class Exer07 {

	private ArrayList<Integer> lista;
	
	public Exer07() {
		lista = new ArrayList<Integer>();
	}

	public Exer07(ArrayList<Integer> lista) {
		super();
		this.lista = lista;
	}

	public ArrayList<Integer> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}
	
	public void adiciona(Integer numero) {
		if(!lista.contains(numero)) {
			lista.add(numero);
		}else {
			System.out.println("Número invalido");
		}
	}	

	
	public void remove(Integer numero) {
		lista.remove(numero);
	}
	
	public void busca(Integer numero) {
		System.out.println("Número " + numero + " na posição: " + lista.indexOf(numero)); 
	}
	
	public void tamanho() {
		System.out.println("A lista possui: " + lista.size() + " elemento(os).");
	}

	public void imprime() {
		for(Integer itens : lista) {
			System.out.println("[" + itens + "]");
		}
	}
	
	
}
