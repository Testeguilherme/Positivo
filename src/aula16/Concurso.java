package aula16;

import java.util.ArrayList;
import java.util.List;

//GUILHERME FRIAS, LEONARDO OLIVEIRA, VICTOR MOTA

public class Concurso {
	
	String[] listaConcurso = new String[] {"a","b","c","d","e","a","b","c","d","e"};
	List<Candidato> listaCandidatos = new ArrayList<Candidato>();
	
	public Concurso() {
	}
	
	public Concurso(String[] listaConcurso, List<Candidato> listaCandidatos) {
		super();
		this.listaConcurso = listaConcurso;
		this.listaCandidatos = listaCandidatos;
	}
	
	public String[] getListaConcurso() {
		return listaConcurso;
	}
	public void setListaConcurso(String[] listaConcurso) {
		this.listaConcurso = listaConcurso;
	}
	public List<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}
	public void setListaCandidatos(List<Candidato> listaCandidatos) {
		this.listaCandidatos = listaCandidatos;
	}
	
	public void addCandidato(Candidato cand) {
		for(int i = 0; i < listaCandidatos.size(); i++) {
			if(!listaCandidatos.get(i).getCpf().equals(cand.getCpf())) {
				listaCandidatos.add(cand);
			}
		}
	}
	
	public void removeCandidato(String cpf) {
		for(int i = 0; i < listaCandidatos.size(); i++) {
			if(listaCandidatos.get(i).getCpf().equals(cpf)) {
				listaCandidatos.remove(i);
			}
		}
	}
	
	//O método adicionarRespostasAoGabarito() encontra-se na classe Candidato;
	
	public Integer corrigirProva(Candidato c1) {
		Integer contador = 0;
		for(int i = 0; i < 10; i++) {
			if(listaConcurso[i].contains(c1.lista[i])) {
				contador++;
			}
		}
		return contador;
	}
	
	public void corrigirTodasAsProvas() {
		Integer contador = 0;
		Integer nota = 0;
		for(int i = 0; i < listaCandidatos.size(); i++) {
			for(int j = 0; j < 10; j++) {
				if(listaConcurso[j].contains(listaCandidatos.get(i).lista[j])) {
					contador++;
				}
			}
			System.out.println(listaCandidatos.get(i).getNome() + " você acertou " + contador + " questões.\n");
			contador = 0;
		}
	}
	
	public void imprimeCandidatos() {
		for(int i = 0; i < listaCandidatos.size(); i++) {
				System.out.println( "\n\n Nome: " + listaCandidatos.get(i).getNome() +
						"\n Cpf: " + listaCandidatos.get(i).getCpf() +
						"\n Questões certas: " + corrigirProva(listaCandidatos.get(i)));
		}
	}

}