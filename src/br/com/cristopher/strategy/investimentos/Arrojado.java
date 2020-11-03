package br.com.cristopher.strategy.investimentos;

import java.util.Random;

public class Arrojado implements TipoInvestimento {

	@Override
	public double realizarInvestimento(ContaBancaria conta) {

		int chute = new Random().nextInt(10);

		if (chute >= 0 && chute <= 1) {
			return conta.getSaldo() * 0.05;
		} else if (chute >= 2 && chute <= 4) {
			return conta.getSaldo() * 0.03;
		}

		return conta.getSaldo() * 0.006;

	}

}
