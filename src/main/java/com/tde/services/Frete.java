package com.tde.services;

import com.tde.domain.Dhl;
import com.tde.strategy.FreteServico;

public class Frete{
	
	private FreteServico freteServico;

	public Frete(FreteServico freteServico) {
		this.freteServico = freteServico;
	}

	public Frete() {
	
	}
	
	public float calcula(float peso){
		Float valorTotal = this.freteServico.calcula(peso);
		return valorTotal;
	}

	public void setFreteServico(FreteServico freteServico) {
		this.freteServico = freteServico;
	}
	


	

}
