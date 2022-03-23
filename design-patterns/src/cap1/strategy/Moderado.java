package cap1.strategy;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public Double calcular(Conta conta) {
		
		int possibilidade = new Random().nextInt(10)+1;
		
		if(possibilidade <= 5) {
			return conta.getSaldo() * 0.025;
		}
		
		else {
			return conta.getSaldo() * 0.007;
		}
		
	}

}
