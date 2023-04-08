package lista2;

public class Exercicio6 {
public static void main(String[] args) {
		
		
		boolean matrizComposta = true;
		
		
		int[][] matriz = {{1, -3}, {-3, 1}};
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if (matriz[i][j] != matriz[j][i]) {
					
					matrizComposta = false;
				}
			}
		}
		
		
		if (matrizComposta) {
			
			System.out.println("A matriz é simétrica");
		} else {
			
			System.out.println("A matriz não é simétrica");
		}
	}
}
