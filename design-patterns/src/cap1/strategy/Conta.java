package cap1.strategy;

public class Conta {
	
	private Double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void deposito(Double valor) {
		
		if(valor > 0) {
			saldo += valor;
		}
		
	}

}
