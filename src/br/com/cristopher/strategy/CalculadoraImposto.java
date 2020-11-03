package br.com.cristopher.strategy;

public class CalculadoraImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double resultado = imposto.calcular(orcamento);
		System.out.println(resultado);
	}

}
