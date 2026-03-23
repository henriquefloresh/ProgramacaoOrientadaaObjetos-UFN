package pkg;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomeCidade;
		
		System.out.println("Digite nomes de cidades (Digite São Paulo para parar o programa): ");
		
		while(true) {
			nomeCidade = teclado.nextLine();
			
			 if (nomeCidade.equalsIgnoreCase("São Paulo")) { // comparação de string se usa .equalsIgnoreCase
	                break;
	            }
			 
			System.out.println("Voce digitou: "+nomeCidade);
		}
		
		System.out.println("Programa encerrado, porque você digitou São Paulo.");
        teclado.close();

	}

}
