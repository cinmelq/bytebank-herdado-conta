
public class ContaCorrente extends Conta implements  Tributavel{

	public ContaCorrente(double saldo, int agencia, int numero, Cliente titular) {
		super(saldo, agencia, numero, titular);
	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getValorImpostos() {
		return super.saldo * 0.01;
	}
}
