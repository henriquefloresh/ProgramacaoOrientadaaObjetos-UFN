package pkg;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota;
		
		System.out.println("Digite notas de alunos (ate que a nota -1 seja lida): ");
		
		while(true) {
			nota = teclado.nextInt();
			
			if(nota == -1) {
				break;
			}
			System.out.println("Voce digitou: "+nota);
		}
		
		System.out.println("Programa encerrado, porque a nota '-1' foi lida.");
        teclado.close();

	}

}
