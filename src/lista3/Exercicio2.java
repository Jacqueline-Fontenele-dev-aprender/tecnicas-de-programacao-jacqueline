package lista3;

public class Exercicio2 {
public static void main(String[] args) {
		
		Exercicio2 exercicio2 = new Exercicio2();
		
		System.out.println("\nFunção 2\n");
		
		double[] vetor3 = {1, 2, 3};
		double[] vetor4 = {1.2, 2.4, 5.5};
		
		System.out.println("Média = " + exercicio2.media(vetor3, vetor4));
		
	}
	public double media(double[] vetor1, double[] vetor2) {
		
		double media = 0;
		
		for (int i = 0; i < vetor1.length; i++) {
			
			media += vetor1[i];
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			
			media += vetor2[i];
		}
		
			media /= (vetor1.length + vetor2.length);
		
		return media;
	}
}

