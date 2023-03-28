package aula08;

import java.util.ArrayList;
import java.util.List;

public class Exer07 {
	
	List<Integer> vagas = new ArrayList<Integer>();
	private Integer passageiros;
	
	public Exer07() {
		
	}
	
	public Exer07(List<Integer> vagas, Integer passageiros) {
		super();
		this.vagas = vagas;
		this.passageiros = passageiros;
	}

	public List<Integer> getVagas() {
		return vagas;
	}

	public void setVagas(List<Integer> vagas) {
		this.vagas = vagas;
	}

	public Integer getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(Integer passageiros) {
		this.passageiros = passageiros;
	}

	public void preencherVagas() {
		for(int i = 1; i <= 100; i++) {
			vagas.add(i);
		}
	}
	
	public void proximoLivre() {
		preencherVagas();
		System.out.println(getVagas().indexOf(1));
	}
	
	public void reservaPoltrona() {
		vagas.remove(1);
	}
	
	
}
