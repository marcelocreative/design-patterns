package cap1.strategy;

public class TesteInvestimento {

	public static void main(String[] args) {
		
		Conta conta1= new Conta(100);
		Conta conta2= new Conta(500);
		Conta conta3= new Conta(1000);
		
		Investimento conservador= new Conservador();
		Investimento moderado= new Moderado();
		Investimento arrojado= new Arrojado();
		
		AplicadorDeInvestimentos aplicador= new AplicadorDeInvestimentos();
		
		aplicador.aplicacao(conservador, conta1);
		aplicador.aplicacao(moderado, conta2);
		aplicador.aplicacao(arrojado, conta3);
		
		System.out.println("Saldo conta 1: "+conta1.getSaldo());
		System.out.println("Saldo conta 2: "+conta2.getSaldo());
		System.out.println("Saldo conta 3: "+conta3.getSaldo());

	}

}
