package pkg1;

import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Carro c1= new Carro();
		
		System.out.println("Digite aqui a marca do primeiro carro: ");
		c1.marca = teclado.nextLine();
		System.out.println("Digite aqui o modelo do primeiro carro: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite aqui o ano de fabricação do primeiro carro: ");
		c1.anoFabricacao = teclado.nextLine();
		
		Carro c2= new Carro();
		
		System.out.println("Digite aqui a marca do segundo carro: ");
		c2.marca = teclado.nextLine();
		System.out.println("Digite aqui o modelo do segundo carro: ");
		c2.modelo = teclado.nextLine();
		System.out.println("Digite aqui o ano de fabricação do segundo carro: ");
		c2.anoFabricacao = teclado.nextLine();
		
		teclado.close();
		

	}

}
