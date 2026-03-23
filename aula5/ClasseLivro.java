package pkg;
//ex2
public class ClasseLivro {
	public String titulo;
    public String autor;
    public int anoPublicacao;
    public String genero;
    public boolean emprestado;

    // Método para retornar informações do livro
    public String Informacoes() {
        return "Título: " + titulo +
               "\nAutor: " + autor +
               "\nAno: " + anoPublicacao +
               "\nGênero: " + genero +
               "\nEmprestado: " + (emprestado ? "Sim" : "Não");
    }

    // Método para emprestar livro
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    // Método para devolver livro
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro não está emprestado.");
        }
    }

}
