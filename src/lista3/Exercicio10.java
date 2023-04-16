package lista3;

public class Exercicio10 {
public static void main(String[] args) {
		
		Exercicio10 exercicio10 = new Exercicio10();
		
		System.out.println("\nFunção 10\n");
		
		// Caso igual
		int[] vetor1 = {1, 2, 3};
		int[] vetor2 = {1, 2, 3};
		
		// Caso diferente (tamanhos diferentes)
		int[] vetor3 = {1, 2, 3};
		int[] vetor4 = {1, 2, 3, 4};
		
		// Caso diferente (valores diferentes)
		int[] vetor5 = {1, 2, 3};
		int[] vetor6 = {1, 5, 3};
		
		System.out.println("Vetores iguais (caso 1): " + exercicio10.verificacaoIgualdade(vetor1, vetor2));
		System.out.println("Vetores iguais (caso 2): " + exercicio10.verificacaoIgualdade(vetor3, vetor4));
		System.out.println("Vetores iguais (caso 3): " + exercicio10.verificacaoIgualdade(vetor5, vetor6));
	}
	
	public boolean verificacaoIgualdade(int[] vetor1, int[] vetor2) {
			if (vetor1.length == vetor2.length) {
				for (int i = 0; i < vetor1.length; i++) {
				
				if (vetor1[i] != vetor2[i]) {
					
					return false;
				}
			}
			
			return true;
		} else {
			
			return false;
		}
	}
}

