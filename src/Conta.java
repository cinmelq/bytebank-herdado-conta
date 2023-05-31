

public abstract class Conta {
//	atributos ou propriedades ou campos
	double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

//	variável pertencente a classe e não ao objeto
	private static int total;


	public Conta(double saldo, int agencia, int numero, Cliente titular) {
		Conta.total++;

		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public abstract void deposita(double valor);
//		this palavra chave que se refere ao objeto que esta invocando o metodo
//		this.saldo += valor;
//		altera o valor do atributo
	

//	true ou false para saber se tem dinheiro na conta e se o saque foi realizado
//	com sucesso
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
//			this.saldo -= valor;
//			destino.saldo += valor; ou
			destino.deposita(valor); // reutiliza o método da propria classe
			return true;
		}
		return false;
	}

//	getter e setter são metodos utilizados para acessar e modificar variáveis
//	privadas
//	ou encapsuladas de uma classe.

//	getter: é um método utilizado para recuperar o valor de uma variável

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

//	setAgencia e setNumero podem ser deletados pois por regra de negócio, depois
//	de criados, não podem ser modificados
//	número e agencia são imutaveis
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return "Saldo: " + this.saldo + "\nAgência: " + this.agencia + "\nNúmero: " + this.numero + "\nTitular: "
				+ this.titular;
	}
}

//esconder o funcionamento de como as coisas funcionam para quando em um futuro
//precisar fazer uma mudança, a alteração será feita em apenas um único lugar.
