package br.com.cristopher.chainofresponsability.requisicao;

public class TesteRequisicao {

	public static void main(String[] args) {

		TipoParserResposta tipoParserResposta = new TipoParserResposta();

		Requisicao req = new Requisicao(Formato.PORCENTO);
		Conta conta = new Conta("Teste titular", 500.00);

		tipoParserResposta.responde(req, conta);

	}

}
