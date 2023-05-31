
public class TesteTributaveis {

	public static void main(String[] args) {
		
		Cliente ana = new Cliente("Ana", "555.555.555-55", "Estagiária");
		ContaCorrente cc = new ContaCorrente(4000, 111, 1113, ana);
		cc.deposita(100.0);
		
		SeguroDeVida seguroAna = new SeguroDeVida();
		
		CalculadoraDeImposto calculaImposto = new CalculadoraDeImposto();
		calculaImposto.registra(cc);
		calculaImposto.registra(seguroAna);
		
		System.out.println(calculaImposto.getTotalImposto());
	}
}
