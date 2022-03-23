package com.tde.services;

import com.tde.domain.Dhl;
import com.tde.strategy.FreteServico;

public class DhlService implements FreteServico{

	@Override
	public float calcula(float peso) {
		Dhl dhl = new Dhl();
		float valorTotal = dhl.CalculaFrete(peso);
		return valorTotal;
	}

}
