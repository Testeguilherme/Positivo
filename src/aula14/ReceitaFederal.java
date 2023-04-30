package aula14;

import java.util.ArrayList;
import java.util.List;

public class ReceitaFederal {
	
	List<Pessoa> lista = new ArrayList<Pessoa>();

	public ReceitaFederal() {
	}

	public ReceitaFederal(List<Pessoa> lista) {
		this.lista = lista;
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public void adiciona(Pessoa pessoa) {
		if(lista.size() == 0) {
			lista.add(pessoa);
		}
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof PessoaFisica && pessoa instanceof PessoaFisica) {
				PessoaFisica p1 = (PessoaFisica) lista.get(i);
				PessoaFisica p2 = (PessoaFisica) pessoa;
				if (p1.getCpf().equals(p2.getCpf())) {
					System.out.println("A pessoa física ja existe na lista");
				} else {
					lista.add(pessoa);
				}
			} else if (lista.get(i) instanceof PessoaJuridica && pessoa instanceof PessoaJuridica) {
				PessoaJuridica p3 = (PessoaJuridica) lista.get(i);
				PessoaJuridica p4 = (PessoaJuridica) pessoa;
				if (p3.getCnpj().equals(p4.getCnpj())) {
					System.out.println("A pessoa jurídica ja existe na lista");
				} else {
					lista.add(pessoa);
				}
			}
		}
	}

	public void remover(String nome) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getNome().equals(nome)) {
				lista.remove(i);
			}
		}
	}
	
	public Integer qtdePessoaFisica() {
		Integer contador = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof PessoaFisica) {
				contador++;
			}		
		}
		return contador;
	}
	
	public Integer qtdePessoaJuridica() {
		Integer contador = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof PessoaJuridica) {
				contador++;
			}		
		}
		return contador;
	}
	
	public Double retornaImpostoPessoa(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equals(nome)) {
				return lista.get(i).calculaImposto();
			} else {
				System.out.println("Nome não consta na lista.");
				break;
			}
		}
		return 0d;
	}
	
	public Double calculaTotalImposto() {
		Double soma = 0d;
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i).calculaImposto();
		}
		return soma;
	}

//	@Override
//	public String toString() {
//		return "ReceitaFederal [lista=" + lista + ", getLista()=" + getLista() + "]";
//	}
	
	public void imprimeLista() {
		System.out.println(lista);
	}

	

}
