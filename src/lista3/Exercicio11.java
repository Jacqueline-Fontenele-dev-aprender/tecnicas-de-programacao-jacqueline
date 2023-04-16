package lista3;

public class Exercicio11 {
public static void main(String[] args) {
		
		Exercicio11 exercicio11 = new Exercicio11();
		
		System.out.println("\nFunção 11\n");
		
		double base1 = 4;
		double base2 = 3.4;
		
		int expoente1 = 2;
		int expoente2 = 4;
		
		System.out.println("4 ^ 2 = " + exercicio11.potenciacao(base1, expoente1));
		System.out.println("3.4 ^ 4 = " + exercicio11.potenciacao(base2, expoente2));
		
	}
	
		public double potenciacao(double base, int expoente) {
		
		double resultado = 1;
		
		for (int i = 0; i < expoente; i++) {
			
			resultado *= base;
		} 
		
		return resultado;
	}
}

