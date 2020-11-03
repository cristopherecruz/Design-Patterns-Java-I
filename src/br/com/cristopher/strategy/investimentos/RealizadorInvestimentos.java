package br.com.cristopher.strategy.investimentos;

public class RealizadorInvestimentos {

	public void realizarInvestimento(ContaBancaria conta, TipoInvestimento tipoInvestimento) {
		double resultado = tipoInvestimento.realizarInvestimento(conta);
		conta.deposita(resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}

}
