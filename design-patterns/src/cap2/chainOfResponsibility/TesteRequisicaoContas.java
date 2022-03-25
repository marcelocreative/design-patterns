package cap2.chainOfResponsibility;

public class TesteRequisicaoContas {

	public static void main(String[] args) {
		
		Conta conta= new Conta(500.00, "José das Neves");
		Requisicao req= new Requisicao(Formato.CSV);
		ProcessadorDeRespostas processador= new ProcessadorDeRespostas();
		processador.processar(req, conta);

	}

}
