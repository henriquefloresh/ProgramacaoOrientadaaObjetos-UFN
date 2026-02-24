package pakg;

import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		int n1,n2,soma,sub;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1 = teclado.nextInt();
		System.out.println("Digite outro número");
		n2 = teclado.nextInt();
		
		soma = n1 + n2;
		System.out.println("A soma desses números  é: "+soma);
		
		sub = n1 - n2;
		System.out.println("A subtração desses números é: "+sub);
		
		float m,div;
		
		m= n1 * n2;
		System.out.println("A multiplicação desses números é: "+m);
		
		div = n1 / n2;
		System.out.println("A divisão desses números é: "+div);

	}

}
