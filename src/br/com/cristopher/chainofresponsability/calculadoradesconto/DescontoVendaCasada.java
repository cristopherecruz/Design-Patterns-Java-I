package br.com.cristopher.chainofresponsability.calculadoradesconto;

import java.util.List;

public class DescontoVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double descontar(Orcamento orcamento) {

		boolean contemItemDeNome = contemItemDeNome(orcamento.getItens(), "LAPIS");
		boolean contemItemDeNome2 = contemItemDeNome(orcamento.getItens(), "CANETA");
		
		if (contemItemDeNome && contemItemDeNome2) {
			return orcamento.getValor() * 0.05;
		}
		
		return proximo.descontar(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	public boolean contemItemDeNome(List<Item> itens, String nomeDoItem) {
		for (Item item : itens) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

}
