package aula6.pkg;
import java.util.Scanner;
import java.util.InputMismatchException;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro número: ");
			double n1 = teclado.nextDouble();
			System.out.println("Digite o segundo número: ");
			double n2 = teclado.nextDouble();
			
			System.out.println("Digite a ação que deseja fazer(+, -, *, /");
			char operacao = teclado.next().charAt(0);

            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = n1 + n2;
                    break;
                case '-':
                    resultado = n1 - n2;
                    break;
                case '*':
                    resultado = n1 * n2;
                    break;
                case '/':
                    if (n2 == 0) {
                        throw new ArithmeticException("Divisão por zero não é permitida.");
                    }
                    resultado = n1 / n2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            System.out.println("Resultado: " + resultado);
		}	catch (InputMismatchException e) {
            	System.out.println("Erro: você deve digitar números válidos.");
        }	 catch (ArithmeticException e) {
        		System.out.println("Erro: " + e.getMessage());
        } 	catch (Exception e) {
            	System.out.println("Erro inesperado.");
        }
		teclado.close();
	}
	

}
