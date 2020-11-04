package br.com.cristopher.chainofresponsability.calculadoradesconto;

public class TesteDesconto {

	public static void main(String[] args) {

		CalculadoraDesconto descontos = new CalculadoraDesconto();

		Orcamento orcamento = new Orcamento(600.00);
		orcamento.adicionarItem(new Item("CANETA", 300.00));
		orcamento.adicionarItem(new Item("LAPIS", 300.00));
		orcamento.adicionarItem(new Item("BORRACHA", 15.00));  
		
		double descontoFinal = descontos.calcularDesconto(orcamento);

		System.out.println(descontoFinal);

	}

}
