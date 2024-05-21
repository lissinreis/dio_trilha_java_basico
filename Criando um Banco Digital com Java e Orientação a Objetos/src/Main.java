
public class Main {

	public static void main(String[] args) {
		Cliente Lissin = new Cliente();
		Lissin.setNome("Lissin");
		
		Conta cc = new ContaCorrente(Lissin);
		Conta poupanca = new ContaPoupanca(Lissin);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
