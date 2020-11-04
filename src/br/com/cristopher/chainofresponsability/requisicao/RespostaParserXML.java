package br.com.cristopher.chainofresponsability.requisicao;

public class RespostaParserXML implements Resposta {

	private Resposta resposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		
		if (req.getFormato().equals(Formato.XML)) {			
			System.out.println(String.format("<conta><titular>%s</titular><saldo>%s</saldo></conta>", conta.getTitular(), conta.getSaldo()));
		}
		
		resposta.responde(req, conta);
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
