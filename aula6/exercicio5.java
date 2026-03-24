package aula6.pkg;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva a temperatura: ");
		String entrada = teclado.nextLine();
		
		try {
			double celsius = Double.parseDouble(entrada);
			
			 double fahrenheit = (celsius * 9/5) + 32;

			 System.out.println("Conversão para fahrenheit: "+fahrenheit);
		} catch(NumberFormatException e) {
			System.out.println("Valor inválido, use '.' para especificar que o número é decimal e digite apenas números!");
		}
		teclado.close();
	}

}
