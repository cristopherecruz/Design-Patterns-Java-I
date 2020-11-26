package br.com.cristopher.templatemethod.impostos;

public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {

		if (orcamento.getValor() >= 500.00) {
			return true;
		}
		
		return false;
	}

}
