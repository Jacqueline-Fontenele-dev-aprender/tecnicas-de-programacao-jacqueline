package lista3;

public class Exercicio17 {
public static void main(String[] args) {
		
		Exercicio17 exercicio17 = new Exercicio17();
		
		System.out.println("\nFunção 17\n");
		
		String palavra1 = "hello";
		String palavra2 = "cachorro";
		
		System.out.println("Palavra invertida (hello) : " + exercicio17.inversaoString(palavra1));
		System.out.println("Palavra invertida (cachorro) : " + exercicio17.inversaoString(palavra2));
	}
	
		public String inversaoString(String palavra) {
		
		String palavraInvertida = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			
			palavraInvertida += palavra.charAt(i);
		}
		
		return palavraInvertida;
	}
}

