package lista3;

public class Exercicio4 {
public static void main(String[] args) {
		
		Exercicio4 exercicio4 = new Exercicio4();
		
		System.out.println("\nFunção 4\n");
		
		double[] vetor5 = {7, 8, 6, 10.6, 1, 4};
		double[] vetor6 = {40, 100, 1, 1.5, 2.2, 3.5, 1};
		double elemento = 1;
		
		System.out.println("Contagem do elemento = " + exercicio4.contagemElementos(vetor5, vetor6, elemento));
	}
	
	public int contagemElementos(double[] vetor1, double[] vetor2, double valorComparado) {
		
		int contagemElemento = 0;
		
			for (int i = 0; i < vetor1.length; i++) {
			
			if (vetor1[i] == valorComparado) {
				contagemElemento++;
			}
		}
		
			for (int i = 0; i < vetor2.length; i++) {
			if (vetor2[i] == valorComparado) {
				contagemElemento++;
			}
		}
		
		return contagemElemento;
	}
}
