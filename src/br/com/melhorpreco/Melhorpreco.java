package br.com.melhorpreco;

public class Melhorpreco {
  
	public double gasolina;
	public double alcool;
	public double diferenca;
	
	//metodo
	public String difpreco() {
		if (this.diferenca>=0.7) {
			return "É melhor abastecer com gasolina";
		}
		else {
			return "É  melhor abastecer com alcool";
		}
		}
	}
	
	

