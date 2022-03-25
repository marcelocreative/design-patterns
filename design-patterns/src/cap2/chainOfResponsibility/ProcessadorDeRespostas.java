package cap2.chainOfResponsibility;

public class ProcessadorDeRespostas {
	
	public void processar(Requisicao req, Conta conta) {
		
		Resposta xml= new RespostaXML();
		Resposta porcento= new RespostaPorcento();
		Resposta csv= new RespostaCSV();
		Resposta semFormato= new RespostaSemFormato();
		
		xml.setProxima(porcento);
		porcento.setProxima(csv);
		csv.setProxima(semFormato);
		
		xml.responde(req, conta);
		
	}

}
