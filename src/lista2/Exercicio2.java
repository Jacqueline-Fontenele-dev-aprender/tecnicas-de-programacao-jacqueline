package lista2;

import java.util.Scanner;
public class Exercicio2 {
public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		double valorAtual;
		
		double soma = 0;
		
		System.out.println("Digite os valores abaixo, caso queira sair digite um número negativo: ");
		
				do {
			
			valorAtual = entrada.nextDouble();
			entrada.nextLine();
			
				if (valorAtual >= 0) {
								
			soma += valorAtual;
			}
			
			
		} while (valorAtual >= 0);
		
		System.out.println("Soma: " + soma);
	}
}
