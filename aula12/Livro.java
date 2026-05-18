import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Livro {
    String titulo;
    String autor;
    int ano;

    // Construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Método para exibir os dados
    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando a lista de livros
        ArrayList<Livro> livros = new ArrayList<>();

        // Adicionando livros na lista
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945));

        // Ordenando a lista pelo ano
        Collections.sort(livros, new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return Integer.compare(l1.ano, l2.ano);
            }
        });

        // Exibindo os livros ordenados
        System.out.println("Lista de livros ordenada por ano:");
        System.out.println("----------------------");

        for (Livro livro : livros) {
            livro.exibirDados();
        }
    }
}
