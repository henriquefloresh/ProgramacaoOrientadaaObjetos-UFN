package pkg;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto p = new Produto();
		float valorestq;

		System.out.println("Digite aqui o nome do seu produto: ");
		p.nome = teclado.nextLine();
		System.out.println("Digite aqui o preco do seu produto: ");
		p.preco = teclado.nextFloat();
		System.out.println("Digite aqui a quantidade de estoque do seu produto: ");
		p.quantidadeest = teclado.nextFloat();
		
		valorestq = p.preco * p.quantidadeest;
		
		System.out.println("NOME DO PRODUTO: "+p.nome);
		System.out.println("PREÇO DO PRODUTO: "+p.preco);
		System.out.println("QUANTIDADE DE ESTOQUE DO PRODUTO: "+p.quantidadeest);
		System.out.println("VALOR TOTAL DE ESTOQUE DO PRODUTO: "+valorestq);

    teclado.close();
				
	}

}
