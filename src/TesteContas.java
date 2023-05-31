
public class TesteContas {

	public static void main(String[] args) {

		Cliente cinthia = new Cliente("Cinthia", "555.852.669-87", "Estagiária");

		ContaCorrente cinthiaContaCorrente = new ContaCorrente(2000, 555, 668, cinthia);
		cinthiaContaCorrente.deposita(5000);

		ContaPoupanca cinthiaContaPoupanca = new ContaPoupanca(100, 555, 668, cinthia);
		cinthiaContaPoupanca.deposita(1000);

		System.out.println(cinthia);
		System.out.println();
		System.out.println("Conta corrente:\n" + cinthiaContaCorrente);
		System.out.println();
		System.out.println("conta poupança:\n" + cinthiaContaPoupanca);

		cinthiaContaCorrente.transfere(500, cinthiaContaPoupanca);
		System.out.println("\nSaldo conta corrente: " + cinthiaContaCorrente);
		System.out.println("\nSaldo conta poupança: " + cinthiaContaPoupanca);
	}
}
