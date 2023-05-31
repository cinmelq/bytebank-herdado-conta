
public class CalculadoraDeImposto {

	private double totalImposto;

	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValorImpostos();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}
}
