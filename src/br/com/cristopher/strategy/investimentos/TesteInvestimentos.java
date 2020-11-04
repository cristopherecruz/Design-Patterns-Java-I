package br.com.cristopher.strategy.investimentos;

public class TesteInvestimentos {

	public static void main(String[] args) {

		ContaBancaria contaBancaria = new ContaBancaria(100.00);

		Conservador conservador = new Conservador();
		Moderado moderado = new Moderado();
		Arrojado arrojado = new Arrojado();

		RealizadorInvestimentos realizadorInvestimentos = new RealizadorInvestimentos();
		realizadorInvestimentos.realizarInvestimento(contaBancaria, conservador);
		realizadorInvestimentos.realizarInvestimento(contaBancaria, moderado);
		realizadorInvestimentos.realizarInvestimento(contaBancaria, arrojado);

	}

}
