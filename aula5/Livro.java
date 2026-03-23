package pkg;
//ex2
public class Livro {
    public static void main(String[] args) {

        // Criando objeto
        ClasseLivro livro = new ClasseLivro();

        // Atribuindo valores
        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";
        livro.anoPublicacao = 1899;
        livro.genero = "Romance";
        livro.emprestado = false;

        // Mostrando informações
        System.out.println(" INFORMAÇÕES DO LIVRO ");
        System.out.println(livro.Informacoes());

        // Emprestar livro
        System.out.println("\n EMPRÉSTIMO ");
        livro.emprestar();

        // Tentar emprestar de novo
        livro.emprestar();

        // Devolver livro
        System.out.println("\n DEVOLUÇÃO ");
        livro.devolver();

        // Mostrar estado final
        System.out.println("\n ESTADO FINAL ");
        System.out.println(livro.Informacoes());
    }
}
