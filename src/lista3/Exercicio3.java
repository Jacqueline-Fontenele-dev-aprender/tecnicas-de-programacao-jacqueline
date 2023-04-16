package lista3;

public class Exercicio3 {
public static void main(String[] args) {
		
		Exercicio3 exercicio3 = new Exercicio3();
		
		System.out.println("\nFunção 3\n");
		
		double[] notas = {7, 8, 6};
		double[] pesos = {2, 3, 1};
		
		System.out.println("Média ponderada = " + exercicio3.mediaPonderada(notas, pesos));
	}
	
		public double mediaPonderada(double[] notas, double[] pesos) {
		
		double mediaPonderada = 0;
		double somaPesos = 0;
		
			for (int i = 0; i < notas.length; i++) {
			
			mediaPonderada += notas[i] * pesos[i];
			somaPesos += pesos[i];
		}

			mediaPonderada /= somaPesos;
		
		return mediaPonderada;
	}
}
