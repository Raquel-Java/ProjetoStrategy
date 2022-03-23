package com.tde.domain;

public class Pac {

	public float CalculaFretePac(float peso) {
		Correios correios = new Correios();
		float valorTotal = correios.calcularRemessa("Pac", peso);
		return valorTotal;
	}

}
