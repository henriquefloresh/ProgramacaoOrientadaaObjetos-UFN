package pkgas;

import java.util.Scanner;
public class Pedido {
    private int numero;
    private String produto;
    private double preco;
    private int quantidade;

    
    public Pedido(int numero, String produto, double preco, int quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
    public double calcularSubtotal() {
        return preco * quantidade;
    }

    
    public double calcularDesconto(double percentual) {
        return calcularSubtotal() * (percentual / 100);
    }

    
    public double calcularTotal(double percentualDesconto) {
        return calcularSubtotal() - calcularDesconto(percentualDesconto);
    }

    
    public String resumoPedido() {
        return "Pedido Nº: " + numero +
               "\nProduto: " + produto +
               "\nPreço: R$ " + preco +
               "\nQuantidade: " + quantidade +
               "\nSubtotal: R$ " + calcularSubtotal();
    }
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o número do pedido: ");
        int numero = teclado.nextInt();
        teclado.nextLine(); 

        System.out.print("Digite o nome do produto: ");
        String produto = teclado.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = teclado.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = teclado.nextInt();

        System.out.print("Digite o percentual de desconto (%): ");
        double percentualDesconto = teclado.nextDouble();

        
        Pedido pedido = new Pedido(numero, produto, preco, quantidade);

        
        System.out.println("\n--- Resumo do Pedido ---");
        System.out.println(pedido.resumoPedido());

        
        System.out.println("\n--- Cálculos ---");
        System.out.println("Subtotal: R$ " + pedido.calcularSubtotal());
        System.out.println("Desconto: R$ " + pedido.calcularDesconto(percentualDesconto));
        System.out.println("Total com desconto: R$ " + pedido.calcularTotal(percentualDesconto));

        teclado.close();
    }
}
