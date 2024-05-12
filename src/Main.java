import dominio.Cliente;
import dominio.ContaCorrente;
import dominio.ContaPoupanca;


public class Main {

	public static void main(String[] args) {
		Cliente pedro = new Cliente("Pedro Henrique", "1049560***", "29/06/1994");
		
		 ContaCorrente cc = new ContaCorrente(pedro);
		 ContaPoupanca poupanca = new ContaPoupanca(pedro);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}