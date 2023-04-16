package lista3;

public class Exercicio8 {
public static void main(String[] args) {
		
		Exercicio8 exercicio8 = new Exercicio8();
		
		System.out.println("\nFunção 8\n");
		int[] vetor1 = {10, 100, 6, 7, 1000};
		int[] vetor2 = {15000, 100, 1, 15, 16};
		int[] vetor3 = {2, 7100, 7, 1};
		
		System.out.println("Maior 3º valor do vetor 1: " + exercicio8.kMaiorValor(vetor1, 3));
		System.out.println("Maior 1º valor do vetor 2: " + exercicio8.kMaiorValor(vetor2, 1));
		System.out.println("Maior 4º valor do vetor 3: " + exercicio8.kMaiorValor(vetor3, 4));
	}
	
	public int kMaiorValor(int[] valores, int k) {
		
			for (int i = 0; i < valores.length; i++) {
			
			for (int j = 0; j < valores.length - 1; j++) {
			if (valores[j] < valores[j + 1]) {
					
					int reserva = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = reserva;
				}
			}
		}
		
		return valores[k - 1];
	}
}
