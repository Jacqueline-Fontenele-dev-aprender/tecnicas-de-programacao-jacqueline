package lista3;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Exercicio18 exercicio18 = new Exercicio18();
		
		System.out.println("\nFunção 18\n");
		
		double valorInicial1 = 1000;
		double taxaJuros1 = 0.05;
		int numeroPeriodos1 = 3;
		
		double valorInicial2 = 100;
		double taxaJuros2 = 0.1;
		int numeroPeriodos2 = 10;
		
		System.out.println("Valor final (teste 1): R$ " + exercicio18.calculoJurosComposto(valorInicial1, taxaJuros1, numeroPeriodos1));
		System.out.println("Valor final (teste 2): R$ " + exercicio18.calculoJurosComposto(valorInicial2, taxaJuros2, numeroPeriodos2));
	}
	
		public double calculoJurosComposto(double valorInicial, double taxaJuros, int numeroPeriodos) {
		
		double valorFinal = valorInicial;
		
		for (int i = 0; i < numeroPeriodos; i++) {
			
			valorFinal += (valorFinal * taxaJuros);
		}
		
		return valorFinal;
	}
}
