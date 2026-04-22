package pkg;

import java.util.Scanner;

class Filme {
    String titulo;
    String diretor;
    int duracaoEmMinutos;
    String genero;

    // Método para exibir detalhes
    void exibirDetalhes() {
        System.out.println("\n--- Detalhes do Filme ---");
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Gênero: " + genero);
    }

    // Método para verificar se é longo
    boolean ehLongo() {
        return duracaoEmMinutos > 120;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Filme filme = new Filme();

        // Entrada de dados
        System.out.print("Digite o título do filme: ");
        filme.titulo = teclado.nextLine();

        System.out.print("Digite o diretor: ");
        filme.diretor = teclado.nextLine();

        System.out.print("Digite a duração (em minutos): ");
        filme.duracaoEmMinutos = teclado.nextInt();
        teclado.nextLine(); // limpar buffer

        System.out.print("Digite o gênero: ");
        filme.genero = teclado.nextLine();

        // Exibir dados
        filme.exibirDetalhes();

        // Verificar se é longo
        if (filme.ehLongo()) {
            System.out.println("Este é um filme longo.");
        } else {
            System.out.println("Este não é um filme longo.");
        }

        teclado.close();
    }
}
