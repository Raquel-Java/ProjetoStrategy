
package com.tde.services;

import com.tde.domain.Correios;
import com.tde.strategy.FreteServico;

public class PacService implements FreteServico{
	
	@Override
	public float calcula(float peso) {
		Correios correios = new Correios();
		float valorTotal = correios.calcularRemessa("Pac", peso);
		return valorTotal;
	}

}
