public class Produto{
    public double preco = 100.0;

    void desconto(){
        System.out.println("Preço Original: " + preco);
    }

    class ProdutoComDesconto extends Produto{
        double valorDesconto = 15.0;

        @Override
        void desconto(){
            double precoFinal = preco - valorDesconto;
            System.out.println("Preço com Desconto: " + precoFinal);
        }
    }

    public static void main(String[] args) {
        ProdutoComDesconto meuProduto = new Produto().new ProdutoComDesconto();
        meuProduto.desconto();
    }

}
