package br.com.cristopher.chainofresponsability.calculadoradesconto;

public class DescontoCincoItens implements Desconto {

	private Desconto proximo;

	@Override
	public double descontar(Orcamento orcamento) {

		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}

		return proximo.descontar(orcamento);

	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
