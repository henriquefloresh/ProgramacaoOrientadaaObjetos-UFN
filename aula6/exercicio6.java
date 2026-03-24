package aula6.pkg;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 double premio = 5000.0;

	        try {
	            System.out.print("Quantos ganhadores irão dividir o prêmio? ");
	            int ganhadores = teclado.nextInt();

	            double valorPorPessoa = premio / ganhadores;

	            System.out.println("Cada ganhador receberá: R$ " + valorPorPessoa);

	        } catch (ArithmeticException e) {
	            System.out.println("Erro: não é possível dividir por zero!");
	        } catch (InputMismatchException e) {
	            System.out.println("Erro: digite um número inteiro válido!");
	        }
	        teclado.close();
	      
	}

}
