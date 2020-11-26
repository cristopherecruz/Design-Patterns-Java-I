package br.com.cristopher.strategy.calculadoraimposto;

public class ICCC implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		
		if (valor <= 1000) {
			return valor * 0.05;
		} else if (valor > 1000 && valor <= 3000) {
			return valor * 0.07;
		}
		
		return (valor * 0.08) + 30.00;
	}

}
