package cap2.chainOfResponsibility;

public class ProcessadorDeRespostas {
	
	public void processar(Requisicao req, Conta conta) {
		
		Resposta xml= new RespostaXML();
		Resposta porcento= new RespostaPorcento();
		Resposta csv= new RespostaCSV();
		
		xml.setProxima(porcento);
		porcento.setProxima(csv);
		
		xml.responde(req, conta);
		
	}

}
