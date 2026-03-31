package pkg;

import java.util.Scanner;

public class Produto {
    String nome;
    Float preco;
    Float quantidade;

    public Produto(String n, Float pr, Float q) {
        nome = n;
        preco = pr;
        quantidade = q;

        System.out.println("Produto nome: " + nome);
        System.out.println("Produto preco: " + preco);
        System.out.println("Produto quantidade: " + quantidade);
    }
    public void calcularValorTotalEstoque(){
        Float ve = preco * quantidade;
        System.out.println("Valor de estoque: R$ " + ve);

    }
    public boolean temEstoque(){
        return quantidade > 0;
    }
    public void adicionarEstoque(int qtdeAdd){
         quantidade += qtdeAdd;
    }
    public boolean vender(int qtdVenda) {

        if (quantidade >= qtdVenda) {
            quantidade = quantidade - qtdVenda;
            System.out.println("Venda realizada com sucesso!");
            return true;
        } else {
            System.out.println("Erro: Estoque insuficiente para esta venda.");
            return false;
        }
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o nome do produto: ");
            String nome = teclado.nextLine();
            System.out.println("Digite o preco do produto: ");
            Float preco = teclado.nextFloat();
            System.out.println("Digite o quantidade do produto: ");
            Float quantidade = teclado.nextFloat();
            Produto produto = new Produto(nome, preco, quantidade);

            produto.calcularValorTotalEstoque();

            if(produto.temEstoque()){
                System.out.println("Produto tem estoque!");
            }
            else{
                System.out.println("Produto indisponível");
            }

        System.out.println("Quantas unidades saíram hoje? ");
        int qtde = teclado.nextInt();
        produto.adicionarEstoque(qtde);

        if(produto.vender(qtde)){
            System.out.println("---  Recibo: Venda de " + qtde + " unidades confirmada! ---");
        } else{
            System.out.println("---  Alerta: Não foi possível realizar a venda! ---");
        }

    }
}
