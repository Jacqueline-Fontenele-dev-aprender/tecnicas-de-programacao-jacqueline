package lista3;

public class Exercicio1 {
			public static void main(String[] args) {
			
			Exercicio1 exercicio1 = new Exercicio1();
			
			System.out.println("\nFunção 1\n");
			
			double[] vetor1 = {1, 2, 3, 4, 5, 6};
			double[] vetor2 = {1, 2, 5.5, 6, 7.8, 10, 11.2};
			
			System.out.println("Soma (vetor 1) = " + exercicio1.somatorio(vetor1));
			System.out.println("Soma (vetor 2) = " + exercicio1.somatorio(vetor2));
		}
		
		public double somatorio(double[] vetor) {
			
			double soma = 0;
			
			for (int i = 0; i < vetor.length; i++) {
				
			if (!(i == 0 || i == 1 || i == vetor.length - 1 || i == vetor.length - 2)) {
					
			soma += vetor[i];
				}
			}
			
			return soma;
		}
	
}
