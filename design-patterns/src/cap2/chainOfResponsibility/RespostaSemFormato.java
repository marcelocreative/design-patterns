package cap2.chainOfResponsibility;

public class RespostaSemFormato implements Resposta{
	

	@Override
	public void responde(Requisicao req, Conta conta) {
		
		
		System.out.println("Sem formato para requisição solicitada");
		
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		
		
		
	}

}
