package pkg;

import java.util.Scanner;

public class Exemplovetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[5];
		
		for(int i=0; i < vetor.length; i++) {
			System.out.println("Digite o elemento "+i+":");
			vetor[i] = teclado.nextInt();
		}
		
		for(int i=0; i < vetor.length; i++) {
			System.out.println("Elemento "+i+" = "+vetor[i]);
		}
		
		
		
		int[][] matriz = new int[2][2];
		for(int i=0; i<2;i++) {
			for(int j=0; j<2; j++) {
				System.out.println("\nDigite o elemento ["+i+"]["+j+"]");
				matriz[i][j] = teclado.nextInt();
			}
		}
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j< matriz[i].length; j++) {
				System.out.println("Elemento["+i+"]["+j+"] = "+matriz[i][j]);
				
				}
			}
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j< matriz[i].length; j++) {
					System.out.print(matriz[i][j]+"\t");
				}
				System.out.print("\n");
			}

	}

}
