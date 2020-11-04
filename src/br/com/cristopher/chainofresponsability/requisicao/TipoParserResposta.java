package br.com.cristopher.chainofresponsability.requisicao;

public class TipoParserResposta {

	public void responde(Requisicao req, Conta conta) {
		
		Resposta r1 = new RespostaParserXML();
		Resposta r2 = new RespostaParserCSV();
		Resposta r3 = new RespostaParserPorCento();
		Resposta r4 = new RespostaParserNenhuma();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		r3.setProxima(r4);
		
		r1.responde(req, conta);

	}

}
