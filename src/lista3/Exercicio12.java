package lista3;

public class Exercicio12 {
public static void main(String[] args) {
		
		Exercicio12 exercicio12 = new Exercicio12();
		
		System.out.println("\nFunção 12\n");
		
		int valor1 = 13;
		int valor2 = 10;
		
		System.out.println("É primo (13)? " + exercicio12.primo(valor1));
		System.out.println("É primo (10)? " + exercicio12.primo(valor2));
	}
	
		public boolean primo(int valor) {
		
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

