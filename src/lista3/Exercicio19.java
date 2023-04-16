package lista3;

public class Exercicio19 {
public static void main(String[] args) {
		
		Exercicio19 exercicio19 = new Exercicio19();
		
		System.out.println("\nFunção 19\n");
		
		int valor1 = 6;
		int valor2 = 15;
		int valor3 = 28;
		
		System.out.println("Número perfeito (6)? " + exercicio19.verificacaoNumeroPerfeito(valor1));
		System.out.println("Número perfeito (15)? " + exercicio19.verificacaoNumeroPerfeito(valor2));
		System.out.println("Número perfeito (28)? " + exercicio19.verificacaoNumeroPerfeito(valor3));
	}
	
		public boolean verificacaoNumeroPerfeito(int valor) {
		
			int somaDivisores = 0;
		
		for (int i = 1; i < valor; i++) {
			
			if (valor % i == 0) {
				
				somaDivisores += i;
			}
		}
		
			if (somaDivisores == valor) {
			
			return true;
		}
		
		return false;
	}
}
