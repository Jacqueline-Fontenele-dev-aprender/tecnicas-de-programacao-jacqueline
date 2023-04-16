package lista3;

public class Exercicio16 {
public static void main(String[] args) {
		
		Exercicio16 exercicio16 = new Exercicio16();
		
		System.out.println("\nFunção 16\n");
		
		int valor1 = 7;
		int valor2 = 21;
		
		System.out.println("É primo (7)? " + exercicio16.verificacaoNumeroPrimo(valor1));
		System.out.println("É primo (21)? " + exercicio16.verificacaoNumeroPrimo(valor2));
	}
	
		public boolean verificacaoNumeroPrimo(int valor) {
			int quantidadeDivisores = 0;
			for (int i = 1; i <= valor; i++) {
			
			if (valor % i == 0) {
				
				quantidadeDivisores++;
			}
		}
		
			if (quantidadeDivisores > 2) {
			
			return false;
		}
		
		return true;
	}
}
