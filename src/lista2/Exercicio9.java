package lista2;

import java.util.Scanner;
public class Exercicio9 {
public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		int quantidadePermutacoes = 1;
		
		int contador = 1;
		
		
		System.out.println("Digite abaixo o conjunto de caracteres:");
		String conjuntoCaracteres = entrada.nextLine();
		
		
		String[] letras = new String[conjuntoCaracteres.length()];
		
		
		for (int i = 1; i <= conjuntoCaracteres.length(); i++) {
			
			quantidadePermutacoes *= i;
			letras[i-1] = conjuntoCaracteres.charAt(i-1) + "";
		}
		
		
		String[] permutas = new String[quantidadePermutacoes];
		
		
		permutas[0] = conjuntoCaracteres;
		
		 
		int[] c = new int[quantidadePermutacoes];
		
		
		for (int i = 0; i < c.length; i++) {
			
			c[i] = 0;
		}
		
	
		
		int i = 0;
		
				while (i < conjuntoCaracteres.length()) {
			
			if (c[i] < i) {
				
				
				if (i % 2 == 0) {
					
					String reserva = letras[0];
					letras[0] = letras[i];
					letras[i] = reserva;
				} else {
					
					String reserva = letras[c[i]];
					letras[c[i]] = letras[i];
					letras[i] = reserva;
				}
				
				
				String saida = "";
				
				
				for (String letra : letras) {
					
					saida += letra;
				}
				
				
				permutas[contador] = saida;
				contador++;
				
				c[i] ++;
				i = 0;
				
			} else {
				
				c[i] = 0;
				i ++;
			}
		}
		
		System.out.println("\nPERMUTAÇÕES\n");
		
		
		for (int j = 0; j < c.length; j++) {
			
			System.out.println(permutas[j]);
		}
	}
}
