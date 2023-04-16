package lista3;

public class Exercicio13 {
public static void main(String[] args) {
		
		Exercicio13 exercicio13 = new Exercicio13();
		
		System.out.println("\nFunção 13\n");
		
		double[] vetor1 = {1, 2, 3, 5, 6, 15.5, 7.7};
		double[] vetor2 = {1, 10, 11, 6, 2};
		
		double[] vetorResultado = exercicio13.buscaOcorrencia(vetor1, vetor2);
		
		System.out.println("Vetor resultante");
		
		for (int i = 0; i < vetorResultado.length; i++) {
			
			System.out.println(vetorResultado[i]);
		}
		
	}
	
		public double[] buscaOcorrencia(double[] vetor1, double[] vetor2) {
		
		double[] elementosIguaisParcial = new double[vetor1.length];
		
		int contador = 0;
		int quantidadeAparecem = 0;
		for (int i = 0; i < vetor1.length; i++) {
			for (int j = 0; j < vetor2.length; j++) {
				
				if (vetor1[i] == vetor2[j]) {
					elementosIguaisParcial[contador] = vetor1[i];
					contador++;
					quantidadeAparecem++;
				}
			}
		}
		
		double[] elementosIguaisCompleto = new double[contador];
		
		for (int i = 0; i < contador; i++) {
			elementosIguaisCompleto[i] = elementosIguaisParcial[i];
		}
		
		return elementosIguaisCompleto;
	}
}

