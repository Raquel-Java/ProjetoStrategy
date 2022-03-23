package com.tde.domain;

public class Correios {
	
	public float calcularRemessa(String servico , float peso) {
		 peso = 0.0f;
		
		if(servico.equalsIgnoreCase("Pac")){
			peso=10f;
			
		}else if(servico.equalsIgnoreCase("sedex")){
			peso=30f;
		}
		
		return peso;
	}

}
