package lista2;
import java.util.Scanner;
public class Exercicio7 {
public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		int primo = 0;
		
		
		System.out.println("Digite abaixo o valor de referência:");
		int valorReferencia = entrada.nextInt();
		entrada.nextLine();
		
		
		int copia = valorReferencia;
		
		
		while (primo == 0) {
			
			int contador = 1;
			int divisores = 0;
			
			
			while(contador <= valorReferencia) {
				
			
				if (valorReferencia % contador == 0) {
					
					divisores++;
				}
				
				contador++;
			}
			
			
			if (divisores == 2 && valorReferencia != copia) {
				
				primo = valorReferencia;
			}
			
		
			valorReferencia--;
		}
		
		System.out.println("Primo mais próximo: " + primo);
	}
}
