package lista2;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		int contador = 1;
		
		
		System.out.println("Digite abaixo o valor que será usado na tabuada:");
		int valorTabuada = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("\nTABUADA\n");
		
		
		while (contador != 11) {
			
			System.out.println(contador + " x " + valorTabuada + " = " + (contador * valorTabuada));
			
			
			contador++;
		}
	}
}
