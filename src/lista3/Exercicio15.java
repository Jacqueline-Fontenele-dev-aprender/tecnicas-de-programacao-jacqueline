package lista3;

public class Exercicio15 {
public static void main(String[] args) {
		
		Exercicio15 exercicio15 = new Exercicio15();
		
		System.out.println("\nFunção 15\n");
		String palavra1 = "ana";
		
		String palavra2 = "carlos";
		System.out.println("É palíndromo (ana) ? " + exercicio15.verificacaoPalindromo(palavra1));
		System.out.println("É palíndromo (carlos) ? " + exercicio15.verificacaoPalindromo(palavra2));
	}
			public boolean verificacaoPalindromo(String palavra) {
		
		String palavraInvertida = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			palavraInvertida += palavra.charAt(i);
		}
			if (palavraInvertida.equals(palavra)) {
				
			return true;
		}
		
		return false;
	}
}
