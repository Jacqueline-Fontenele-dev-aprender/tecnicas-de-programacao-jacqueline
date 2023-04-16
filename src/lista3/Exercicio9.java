package lista3;

public class Exercicio9 {
public static void main(String[] args) {
		
		Exercicio9 exercicio9 = new Exercicio9();
		
		System.out.println("\nFunção 9\n");
		
		int[] vetor1 = {10, 100, 6, 7, 1000};
		int[] vetor2 = {15000, 100, 1, 15, 16};
		int[] vetor3 = {2, 7100, 7, 1};
		
		System.out.println("Menor 1º valor do vetor 1: " + exercicio9.kMenorrValor(vetor1, 1));
		System.out.println("Menor 2º valor do vetor 2: " + exercicio9.kMenorrValor(vetor2, 2));
		System.out.println("Menor 3º valor do vetor 3: " + exercicio9.kMenorrValor(vetor3, 3));
	}
	
	public int kMenorrValor(int[] valores, int k) {
		
				for (int i = 0; i < valores.length; i++) {
			
				for (int j = 0; j < valores.length - 1; j++) {
				
				if (valores[j] > valores[j + 1]) {
					
					int reserva = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = reserva;
				}
			}
		}
		
		return valores[k - 1];
	}
}

