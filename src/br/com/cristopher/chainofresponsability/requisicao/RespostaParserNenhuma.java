package br.com.cristopher.chainofresponsability.requisicao;

public class RespostaParserNenhuma implements Resposta {

	@Override
	public void responde(Requisicao req, Conta conta) {

	}

	@Override
	public void setProxima(Resposta resposta) {

	}

}
