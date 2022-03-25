package cap2.chainOfResponsibility;

public class RespostaXML implements Resposta{
	
	private Resposta resposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		
		if(req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>"+conta.getTitular()+"</titular><saldo>"+conta.getSaldo()+"</saldo></conta>.");
		}
		else {
			resposta.responde(req, conta);
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		
		this.resposta = resposta;
		
	}

}
