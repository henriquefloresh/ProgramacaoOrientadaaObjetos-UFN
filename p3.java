package pkag;

import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		
		int mi, mf;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marcação do odômetro no começo do dia: ");
		mi = teclado.nextInt();
		System.out.println("Digite a marcação do odômetro no final do dia: ");
		mf = teclado.nextInt();
		
		int l;
		System.out.println("Digite o numero de litros de combústivel gasto: ");
		l = teclado.nextInt();
		
		float vtr;
		System.out.println("Digite o valor total recebido: ");
		vtr = teclado.nextFloat();
		
		int tkm;
		
		tkm = mf - mi;
		System.out.println("A total quilometragem é: "+tkm);
		
		double mc, lucro;
		mc = tkm / l;
		System.out.println("A média do consumo é: "+mc);
		
		lucro = vtr - (l * 4.90);
		System.out.println("O lucro total é de: "+lucro);
		
		
	}

}
