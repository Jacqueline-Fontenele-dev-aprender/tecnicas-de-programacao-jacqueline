package lista2;
import java.util.Scanner;
public class Exercicio8 {
public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		boolean estaoFechada = true;
		
		
		System.out.println("Digite abaixo a entrutura matemática:");
		String expressao = entrada.nextLine();
		
	
		for (int i = 0; i < expressao.length(); i++) {
			
			
			if (expressao.charAt(i) == '(') {
				
				estaoFechada = false;
				
				
				for (int j = i; j < expressao.length(); j++) {
					
					if (expressao.charAt(j) == ')') {
						
						estaoFechada = true;
					}
				}	
			}
			
			
			if (expressao.charAt(i) == '[') {
				
				estaoFechada = false;
				
				
				for (int j = i; j < expressao.length(); j++) {
					
					if (expressao.charAt(j) == ']') {
						
						estaoFechada = true;
					}
				}	
			}
			
			
			if (expressao.charAt(i) == '{') {
				
				estaoFechada = false;
				
				 
				for (int j = i; j < expressao.length(); j++) {
					
					if (expressao.charAt(j) == '}') {
						
						estaoFechada = true;
					}
				}	
			}
		}
		
		
		if (estaoFechada) {
			
			System.out.println("A expressão está bem formada");
		} else {
			
			System.out.println("A expressão não está bem formada");
		}
	}
}
