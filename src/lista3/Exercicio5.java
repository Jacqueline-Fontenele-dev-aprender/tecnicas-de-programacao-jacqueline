package lista3;

public class Exercicio5 {
public static void main(String[] args) {
		
		Exercicio5 exercicio5 = new Exercicio5();
		
		System.out.println("\nFunção 5\n");
		
		int[] vetorCopiar = {1, 2, 3, 4, 5};
		int[] vetorCopiado = exercicio5.copiaVetor(vetorCopiar);
		
		System.out.println("Vetor a ser copiado");
		for (int i = 0; i < vetorCopiar.length; i++) {
			
			System.out.println(vetorCopiar[i]);
		}
		
		System.out.println("Vetor copiado");
		for (int i = 0; i < vetorCopiado.length; i++) {
			
			System.out.println(vetorCopiado[i]);
		}
	}
	
	public int[] copiaVetor(int[] vetorCopiar) {
		
		int[] copia = new int[vetorCopiar.length];
		for (int i = 0; i < vetorCopiar.length; i++) {
			copia[i] = vetorCopiar[i];
		}
		
		return copia;
	}
}

