package aula6.pkg;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		String entrada =  teclado.nextLine();
		
		try {
			double numero = Double.parseDouble(entrada);
			
			System.out.println("Valor convertido com sucesso: "+numero);
			
		}catch (NumberFormatException e) { // Captura erro caso a conversão falhe
            System.out.println("Erro: valor inválido para conversão em número.");
		}
		teclado.close();
	}
}
