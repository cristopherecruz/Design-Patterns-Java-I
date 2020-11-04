package br.com.cristopher.chainofresponsability.calculadoradesconto;

public class DescontoQuinhentosReais implements Desconto {

	private Desconto proximo;

	@Override
	public double descontar(Orcamento orcamento) {

		if (orcamento.getValor() > 500.00) {
			return orcamento.getValor() * 0.07;
		}

		return proximo.descontar(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
