package cap2.chainOfResponsibility;

public class RespostaCSV implements Resposta{
	
	private Resposta resposta= null;

	@Override
	public void responde(Requisicao req, Conta conta) {
		
		if(req.getFormato() == Formato.CSV) {
			System.out.println(";"+conta.getTitular()+";"+conta.getSaldo()+";");
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
