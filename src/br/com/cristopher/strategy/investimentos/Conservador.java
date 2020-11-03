package br.com.cristopher.strategy.investimentos;

public class Conservador implements TipoInvestimento {

	@Override
	public double realizarInvestimento(ContaBancaria conta) {
		return conta.getSaldo() * 0.008;
	}

}
