package lista3;

public class Exercicio6 {
public static void main(String[] args) {
		
		Exercicio6 exercicio6 = new Exercicio6();
		System.out.println("\nFunção 6\n");
		
		int[] vetorDesordenado = {10, 1, 5, 2, 4};
		int[] vetorOrdenado = exercicio6.ordenacaoCrescente(vetorDesordenado);
		
		System.out.println("Vetor ordenado");
		for (int i = 0; i < vetorOrdenado.length; i++) {
			
			System.out.println(vetorOrdenado[i]);
		}
	}
	public int[] ordenacaoCrescente(int[] vetor) {
		
			for (int i = 0; i < vetor.length; i++) {
				
			for (int j = 0; j < vetor.length - 1; j++) {
		
			if (vetor[j] > vetor[j + 1]) {
					
					int reserva = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = reserva;
				}
			}
		}
		
		return vetor;
	}
}

