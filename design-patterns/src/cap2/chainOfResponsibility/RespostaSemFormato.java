package cap2.chainOfResponsibility;

public class RespostaSemFormato implements Resposta{
	

	@Override
	public void responde(Requisicao req, Conta conta) {
		
		
		System.out.println("Sem formato para requisi��o solicitada");
		
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		
		
		
	}

}
