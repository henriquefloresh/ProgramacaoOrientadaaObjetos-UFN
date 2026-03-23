package pkg1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		Livro l = new Livro();
		
		System.out.println("Digite aqui o titulo do livro: ");
		l.titulo = teclado.nextLine();
		System.out.println("Digite aqui o nome do autor do livro: ");
		l.autor = teclado.nextLine();
		System.out.println("Digite aqui o ano de publicação do livro: ");
		l.anoPublicacao = teclado.nextLine();
		
		System.out.println("Titulo: "+l.titulo);
		System.out.println("Autor: "+l.autor);
		System.out.println("Ano de publicação: "+l.anoPublicacao);

	}

}
