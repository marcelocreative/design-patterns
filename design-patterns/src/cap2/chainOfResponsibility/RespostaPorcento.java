package cap2.chainOfResponsibility;

public class RespostaPorcento implements Resposta{
	
	private Resposta resposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		
		if(req.getFormato() == Formato.PORCENTO) {
			System.out.println("%"+conta.getTitular()+"%"+conta.getSaldo()+"%");
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
