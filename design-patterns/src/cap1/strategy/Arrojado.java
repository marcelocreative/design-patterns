package cap1.strategy;

import java.util.Random;

public class Arrojado implements Investimento {

	@Override
	public Double calcular(Conta conta) {
		
		int possibilidade = new Random().nextInt(10)+1;
		
		if(possibilidade <= 2) {
			return conta.getSaldo() * 0.05;
		}
		
		else if(possibilidade > 2 && possibilidade <= 5) {
			return conta.getSaldo() * 0.03;
		}
		
		else {
			return conta.getSaldo() * 0.006;
		}
		
	}

}
