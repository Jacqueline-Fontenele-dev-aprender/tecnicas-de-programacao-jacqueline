package lista2;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		int contador = 0;
		
		
		System.out.println("Digite abaixo o limite:");
		int limite = entrada.nextInt();
		entrada.nextLine();
		
		
		while (contador <= limite) {
			
			
			for (int i = 0; i <= limite; i++) {
				
				System.out.println(contador + " - " + i);
			}
			
			
			contador++;
		}
	}
}
