package lista3;

public class Exercicio14 {
public static void main(String[] args) {
		
		Exercicio14 exercicio14 = new Exercicio14();
		
		System.out.println("\nFunção 14\n");
		
		double[] vetor1 = {1, 10, 11, 6, 2, 10};
		double[] vetorResultado = exercicio14.remocaoElementoVetor(vetor1, 10);
		
		for (int i = 0; i < vetorResultado.length; i++) {
			
			System.out.println(vetorResultado[i]);
		}
		
	}
	
		public double[] remocaoElementoVetor(double[] vetor, double elemento) {
		double[] vetorResultadoParcial = new double[vetor.length];
		
		int contador = 0;
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] != elemento){
				vetorResultadoParcial[contador] = vetor[i];
				contador++;
			}
		}
		
		double[] vetorResultadoCompleto = new double[contador];
		for (int i = 0; i < contador; i++) {
			
			vetorResultadoCompleto[i] = vetorResultadoParcial[i];
		}
		
		return vetorResultadoCompleto;
	}
}

