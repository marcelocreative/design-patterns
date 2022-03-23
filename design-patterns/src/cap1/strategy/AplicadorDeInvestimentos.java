package cap1.strategy;

public class AplicadorDeInvestimentos {
	
	public void aplicacao(Investimento investimento, Conta conta) {
		
		double rendimento= investimento.calcular(conta);
		conta.deposito(rendimento * 0.75);
		
	}

}
