package pkg;
import java.util.Scanner;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	void exibirInformacoes(){
		System.out.println(" Dados do produto: ");
		System.out.println("Nome do produto: "+nome);
		System.out.println("Preço do produto: "+preco);
		System.out.println("Quantidade: "+quantidade);
	}
	
	double calcularValorTotal() {
		return preco * quantidade;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Produto p1 = new Produto();
		
		System.out.println("Digite o nome do produto: ");
		p1.nome = teclado.next();
		System.out.println("Digite o preço do produto: ");
		p1.preco = teclado.nextDouble();
		System.out.println("Digite a quantidade: ");
		p1.quantidade = teclado.nextInt();
		
		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 5100;
		p2.quantidade = 15;
		
		System.out.println("Exibindo dados do Primeiro Produto... ");
		p1.exibirInformacoes();
		System.out.println("Valor total: "+p1.calcularValorTotal());
		
		System.out.println("Exibindo dados do Segundo Produto... ");
		p2.exibirInformacoes();
		System.out.println("Valor total: "+p2.calcularValorTotal());
		
		teclado.close();
	}

}
