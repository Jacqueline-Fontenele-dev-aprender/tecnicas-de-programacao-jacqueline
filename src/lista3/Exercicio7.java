package lista3;

public class Exercicio7 {
public static void main(String[] args) {
		
		Exercicio7 exercicio7 = new Exercicio7();
		
		System.out.println("\nFunção 7\n");
		
		int[] vetorDesordenado2 = {10, 1, 5, 2, 4};
		int[] vetorOrdenado2 = {1, 2, 3, 4};
		
		
		System.out.println("Vetor ordenado: " + exercicio7.verificacaoOrdenacao(vetorDesordenado2));
		System.out.println("Vetor ordenado: " + exercicio7.verificacaoOrdenacao(vetorOrdenado2));
	}
	public boolean verificacaoOrdenacao(int[] vetor) {
		
		for (int i = 0; i < vetor.length - 1; i++) {
			
			if (vetor[i] > vetor[i + 1]) {
				
				return false;
			}
		}
		
		return true;
	}
}

