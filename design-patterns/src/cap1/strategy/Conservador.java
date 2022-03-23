package cap1.strategy;

public class Conservador implements Investimento {

	@Override
	public Double calcular(Conta conta) {
		
		return conta.getSaldo() * 0.008;
		
	}

}
