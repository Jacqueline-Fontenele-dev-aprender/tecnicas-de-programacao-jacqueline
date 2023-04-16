package lista3;

public class Exercicio20 {
public static void main(String[] args) {
		
		Exercicio20 exercicio20 = new Exercicio20();
		
		System.out.println("\nFunção 20\n");
		
		int[] vetor1 = exercicio20.diminuicaoVetor(5);
		int[] vetor2 = exercicio20.diminuicaoVetor(20);
		int[] vetor3 = exercicio20.diminuicaoVetor(56);
		
		System.out.println("Tamanho do vetor 1 = " + vetor1.length);
		System.out.println("Tamanho do vetor 2 = " + vetor2.length);
		System.out.println("Tamanho do vetor 3 = " + vetor3.length);
	}
	
	public int[] diminuicaoVetor(int tamanhoInicial) {
		
		int[] vetorResultado = new int[tamanhoInicial];
		
		for (int i = vetorResultado.length - 1; i > 0; i--) {
			
			vetorResultado = new int[i];
		}
		
		return vetorResultado;
	}
}


