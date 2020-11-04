package br.com.cristopher.chainofresponsability.requisicao;

import java.util.ArrayList;
import java.util.List;

public class RespostaParserCSV implements Resposta {

	private Resposta resposta;

	@Override
	public void responde(Requisicao req, Conta conta) {

		if (req.getFormato().equals(Formato.CSV)) {

			List<String> dados = new ArrayList<String>();
			dados.add(conta.getTitular());
			dados.add(String.valueOf(conta.getSaldo()));

			System.out.println(String.join(";", dados));
		}

		resposta.responde(req, conta);

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
