package aula10;

import java.util.ArrayList;

public class DesafioAgenda {
	private ArrayList<DesafioContato> contatos = new ArrayList<DesafioContato>();

	public DesafioAgenda() {
		
	}

	public DesafioAgenda(ArrayList<DesafioContato> contatos) {
		this.contatos = contatos;
	}

	public ArrayList<DesafioContato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<DesafioContato> contatos) {
		this.contatos = contatos;
	}
	
	public void adicionar(DesafioContato contato) {
		contatos.add(contato);
	}
	public void remover(String nome) {
		for(int i=0; i < contatos.size(); i++) {
			if(contatos.get(i).getNome().equals(nome)) {
				contatos.remove(i);
				System.out.println("Removido com Sucesso");
			}
		}
	}
	
	public void buscar(String nome) {
		for(int i=0; i < contatos.size(); i++) {
			if(contatos.get(i).getNome().contains(nome)) {
				System.out.println(contatos.get(i));
			}
		}
	}
	
	public void alterar(String nome, String nomeAlterado, String email, String numero) {
		for(int i=0; i < contatos.size();i++) {
			if(contatos.get(i).getNome().equalsIgnoreCase(nome)) {
				contatos.get(i).setNome(nomeAlterado);
				contatos.get(i).setNome(email);
				contatos.get(i).setNome(numero);
			}
		}
	}
	public void imprimir() {
		System.out.println(contatos);
	}
}
