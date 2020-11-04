package br.com.cristopher.chainofresponsability.calculadoradesconto;

public interface Desconto {

	double descontar(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
	
}
