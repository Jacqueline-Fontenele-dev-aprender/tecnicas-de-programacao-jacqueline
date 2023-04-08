package lista2;

import java.util.Scanner;

public class Exercicio3 {
		public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		double valorDescobrir = 10;
		
		
		double valorDigitado = 0;
		
		
		do {
			
			
			System.out.println("Digite abaixo um valor: ");
			valorDigitado = entrada.nextDouble();
			entrada.nextLine();
			
			
			if (valorDigitado != valorDescobrir) {
				
				System.out.println("Valor incorreto, tente novamente!");
				
				
				if (valorDigitado > valorDescobrir) {
					
					System.out.println("O valor a ser descoberto é menor que " + valorDigitado);
				} else if (valorDigitado < valorDescobrir) {
					
					System.out.println("O valor a ser descoberto é maior que " + valorDigitado);
				}
			}
			
		} while (valorDigitado != valorDescobrir);
		
		
		System.out.println("ACERTOU O NÚMERO!");
	}
	
}
