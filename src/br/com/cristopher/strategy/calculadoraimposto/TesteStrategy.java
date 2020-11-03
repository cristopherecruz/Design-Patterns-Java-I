package br.com.cristopher.strategy.calculadoraimposto;

public class TesteStrategy {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();

		Orcamento orcamento = new Orcamento(500.00);

		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		calculadoraImposto.realizaCalculo(orcamento, iss);
		calculadoraImposto.realizaCalculo(orcamento, icms);
		calculadoraImposto.realizaCalculo(orcamento, iccc);

	}

}
