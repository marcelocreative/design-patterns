package cap2.chainOfResponsibility;

public class RespostaXML implements Resposta{
	
	private Resposta resposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		
		if(req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>"+conta.getTitular()+"</titular><saldo>"+conta.getSaldo()+"</saldo></conta>.");
		}
		else if(resposta != null) {
			resposta.responde(req, conta);
		}
		else {
			throw new RuntimeException("Formato de resposta não encontrado");
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		
		this.resposta = resposta;
		
	}

}
