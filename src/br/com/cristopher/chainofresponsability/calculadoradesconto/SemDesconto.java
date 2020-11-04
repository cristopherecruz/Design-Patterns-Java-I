package br.com.cristopher.chainofresponsability.calculadoradesconto;

public class SemDesconto implements Desconto {

	@Override
	public double descontar(Orcamento orcamento) {
		return 0.0;
	}

	@Override
	public void setProximo(Desconto proximo) {		
	}

}
