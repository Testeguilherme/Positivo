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
		if(lista.isEmpty()) {
			lista.add(numero);
		}else{
			for(int i = 0; i < lista.size(); i++) {
				if(lista.get(i) == numero) {
					lista.add(i, numero);
				}
			}
		}
	}	

	
	public void remove(Integer numero) {
		lista.remove(numero);
	}
	
	public void busca(Integer numero) {
		System.out.println("Número " + numero + " na posição: " + lista.indexOf(numero)); 
	}
	
	public void tamanho() {
		System.out.println("Tamanho: " + lista.size() + " itens na lista.");
	}

	public void imprime() {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	
}
