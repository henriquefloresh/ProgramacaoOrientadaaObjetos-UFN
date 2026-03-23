package pkg1;

import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Computador comp1 = new Computador();
		
		System.out.println("Digite aqui a marca do primeiro computador: ");
		comp1.marca = teclado.nextLine();
		System.out.println("Digite aqui o modelo do primeiro computador: ");
		comp1.modelo = teclado.nextLine();
		System.out.println("Digite aqui o tipo (notebook, netbook, tablet, etc) do primeiro computador: ");
		comp1.tipo = teclado.nextLine();
		System.out.println("Digite aqui o preço(em R$) do primeiro computador: ");
		comp1.preco = teclado.nextFloat();
		
		Computador comp2 = new Computador();
		comp2.marca = "DELL";
		comp2.modelo = "Inspiron";
		comp2.tipo = "Notebook";
		comp2.preco = 3200;
		
		System.out.println("Marca do primeiro computador: "+comp1.marca);
		System.out.println("Modelo do primeiro computador: "+comp1.modelo);
		System.out.println("Tipo do primeiro computador: "+comp1.tipo);
		System.out.println("Preço do primeiro computador: "+comp1.preco);
		
		System.out.println("Marca do segundo computador: "+comp2.marca);
		System.out.println("Modelo do segundo computador: "+comp2.modelo);
		System.out.println("Tipo do segundo computador: "+comp2.tipo);
		System.out.println("Preço do segundo computador: "+comp2.preco);
		

	}

}
