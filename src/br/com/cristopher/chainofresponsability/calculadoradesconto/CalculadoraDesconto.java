package br.com.cristopher.chainofresponsability.calculadoradesconto;

public class CalculadoraDesconto {

	public double calcularDesconto(Orcamento orcamento) {

		Desconto d1 = new DescontoCincoItens();
		Desconto d2 = new DescontoQuinhentosReais();
		Desconto d3 = new DescontoVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		return d1.descontar(orcamento);

	}

}
