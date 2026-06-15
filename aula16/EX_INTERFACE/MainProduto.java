public class MainProduto {

    public static void main(String[] args) {

        Livro livro = new Livro(
                "Java para Iniciantes",
                89.90,
                "Livro de programação Java"
        );

        CD cd = new CD(
                "Rock Nacional",
                29.90,
                "Coletânea de músicas brasileiras"
        );

        System.out.println("=== LIVRO ===");
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Preço: R$ " + livro.getPreco());
        System.out.println("Descrição: " + livro.getDescricao());

        System.out.println();

        System.out.println("=== CD ===");
        System.out.println("Nome: " + cd.getNome());
        System.out.println("Preço: R$ " + cd.getPreco());
        System.out.println("Descrição: " + cd.getDescricao());
    }
}
