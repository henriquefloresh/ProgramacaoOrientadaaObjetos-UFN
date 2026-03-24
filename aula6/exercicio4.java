package aula6.pkg;

import java.util.Scanner;
import java.util.InputMismatchException;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] nomes = {"Ana","Carlos","Pedro","Henrique","João"};
		
		try {
			System.out.println("Digite um número de 0 a 4: ");
			int indice = teclado.nextInt();
			
			System.out.println("Nome na posição "+indice+" : "+nomes[indice]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: índice fora do limite do array (0 a 4).");
		} catch (InputMismatchException e) {// Caso o usuário digite letra ou valor inválido
            System.out.println("Erro: você deve digitar um número inteiro.");
        
		}
		teclado.close();
	}

}
