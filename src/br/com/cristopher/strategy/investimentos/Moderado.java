package br.com.cristopher.strategy.investimentos;

import java.util.Random;

public class Moderado implements TipoInvestimento {

	@Override
	public double realizarInvestimento(ContaBancaria conta) {
		
		boolean is = new Random().nextInt(2) == 0;
		
		if (is) {
			return conta.getSaldo() * 0.025;
		}
		
		return conta.getSaldo() * 0.007;
	}

}
