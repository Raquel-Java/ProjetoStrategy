package com.tde;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tde.services.DhlService;
import com.tde.services.Frete;
import com.tde.services.SedexService;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyApplication.class, args);
		
		
		SedexService sedex = new SedexService();
		DhlService dhl = new DhlService();
		
		
		Frete frete = new Frete(sedex);
		
		
		//Setando qual o serviço irá calcular o frete ...
		frete.setFreteServico(sedex);

		
		System.out.printf("Frete sedex:  %.2f ",frete.calcula(10));
		
		
	}

}
