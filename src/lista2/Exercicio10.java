package lista2;

import java.util.Scanner;
public class Exercicio10 {
public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite abaixo o número de linhas:");
		int linhas = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Digite abaixo o número de colunas:");
		int colunas = entrada.nextInt();
		entrada.nextLine();
		
		
		// Item A
		System.out.println("\nItem A\n");
		for (int i = 0; i < linhas; i++) {
			
			String linhaAtual = "";
			for (int j = 0; j <= i; j++) {
				
				linhaAtual += j + " ";
			}
			
			System.out.println(linhaAtual);
		}
		
		// Item B
		System.out.println("\nItem B\n");
		
		for (int i = 0; i < linhas; i++) {
			
			
			int contador = i;
			
			String linhaAtual = "";
			for (int j = 0; j < colunas; j++) {
				
				
				if (contador % 2 == 0) {
					
					linhaAtual += "@" + " ";
				} else {
					
					linhaAtual += "*" + " ";
				}
				
				contador++;
			}
			
			System.out.println(linhaAtual);
		}
		
		// Item C
		System.out.println("\nItem C\n");
		
		
		int eixo = linhas / 2;
		
		for (int i = 0; i < linhas; i++) {
			
			String linhaAtual = "";
			for (int j = 0; j < colunas; j++) {
				
				
				if (i == eixo || j == eixo) {
					
					linhaAtual += "@" + " ";
				} else {
					
					if (i % 2 == 0) {
						
						linhaAtual += (colunas - 1 - j) + " ";
					} else {
						
						linhaAtual += j + " ";
					}
				}
			}
			
			System.out.println(linhaAtual);
		}

		// Item D
		System.out.println("\nItem D\n");
		for (int i = 0; i < linhas; i++) {
			
			String linhaAtual = "";
			for (int j = 0; j < colunas; j++) {
				
				if (i != 0 && i != linhas - 1) {
					
					if (j == 0) {
						
						linhaAtual += i + " ";
					} else if (j == colunas - 1) {
						
						linhaAtual += (j - i) + " ";
					} else {
						
						linhaAtual += "*" + " ";
					}
				} else if (i == 0) {
					
					linhaAtual += j + " ";
				} else if (i == colunas - 1) {
					
					linhaAtual += (i - j) + " ";
				}
			}
			
			System.out.println(linhaAtual);
		}
		
		// Item C
		System.out.println("\nItem E\n");
		
		
		int eixo2 = linhas / 2;
		
		for (int i = 0; i < linhas; i++) {
			
			String linhaAtual = "";
			for (int j = 0; j < colunas; j++) {
				
				
				if (j == eixo2) {
					
					linhaAtual += "||" + " ";
				} else if (i == eixo2) {
					
					linhaAtual += "=" + " ";
				} else if (i < eixo && j < eixo){
					
					linhaAtual += "#" + " ";
				} else if (i < eixo && j > eixo){
					
					linhaAtual += "!" + " ";
				} else if (i > eixo && j < eixo){
					
					linhaAtual += "*" + " ";
				} else {
					
					linhaAtual += "%" + " ";
				}
			}
			
			System.out.println(linhaAtual);
		}
		
		// Item E
		System.out.println("\nItem E\n");
		for (int i = 0; i < linhas; i++) {
			
			String linhaAtual = "";
			for (int j = 0; j < colunas; j++) {
				
				 
				if (i == j) {
					
					linhaAtual += i + " ";
				} else if (i + j == colunas - 1) {
					
					linhaAtual += j + " ";
				} else {
					
					linhaAtual += "*" + " ";
				}
			}
			
			System.out.println(linhaAtual);
		}
	}
}
