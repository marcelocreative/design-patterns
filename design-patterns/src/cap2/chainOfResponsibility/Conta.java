package cap2.chainOfResponsibility;

public class Conta {
	
	private Double saldo;
	private String titular;
	
	public Conta(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void deposito(Double valor) {
		
		if(valor > 0) {
			saldo += valor;
		}
		
	}

}
