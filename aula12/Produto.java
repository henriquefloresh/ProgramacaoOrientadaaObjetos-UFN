import java.util.ArrayList;

class Produto {
    String nome;
    double preco;
    int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para exibir os dados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("--------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando a lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        // Adicionando produtos à lista
        produtos.add(new Produto("Notebook", 3500.00, 5));
        produtos.add(new Produto("Mouse", 80.50, 20));
        produtos.add(new Produto("Teclado", 150.99, 10));

        // Percorrendo a lista e exibindo os dados
        for (Produto produto : produtos) {
            produto.exibirDados();
        }
    }
}
