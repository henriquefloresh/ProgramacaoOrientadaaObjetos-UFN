package aula6.pkg;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
		System.out.println("Digite um numero inteiro: ");
		int numero = teclado.nextInt();
		
		if (numero<0) {
			System.out.println("Valor inválido!");
		} else {
            float raiz = numero * numero;
            System.out.println("A raiz quadrada de " +numero+ " é: " + raiz);
			}

		}catch(Exception e) {
			System.out.println("Erro, você deve digitar um número inteiro válido.");
		}
		teclado.close();
		
	}
}
