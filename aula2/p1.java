package pkg;

import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		System.out.println("testando println "); //se usar println nao precisa de \n
		System.out.print("Hello guys! \n");

		char c = 'r';
		System.out.println("O char: "+c);
		
		float f = 3.14f;
		System.out.println("O float: "+f);		
		double d = 3.141516; // se quiser mudar a variavel tecle alt shift r
		System.out.println("O double: "+d);
		
		
		String nome; //é o que eu vou ler
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		nome = teclado.nextLine();
		System.out.println("O nome digitado é:  "+nome);
		
		int number;
		System.out.println("Digite um número inteiro: ");
		number = teclado.nextInt();
		System.out.println("O número digitado é: "+number);
		
		float b;
		System.out.println("Digite um número: ");
		b = teclado.nextFloat();
		System.out.println("Float: "+b);
	
		double x;
		System.out.println("Digite um número: ");
		x = teclado.nextDouble();
		System.out.println("Double: "+x); 
		
		
		
		
		
		}
		
	}
