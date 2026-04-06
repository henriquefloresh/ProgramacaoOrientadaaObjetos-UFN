package pkgas;

import java.util.Scanner;

public class Livro {
    public String titulo;
    public String autor;
    public int paginas;
    public boolean emprestado;

    
    public Livro(String titulo, String autor, int paginas, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.emprestado = emprestado;
    }

    
    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }

    
    public void devolver() {
        emprestado = false;
    }

    
    public boolean estaDisponivel() {
        return !emprestado;
    }

    
    public String detalhesLivro() {
        return "Título: " + titulo +
               "\nAutor: " + autor +
               "\nPáginas: " + paginas +
               "\nDisponível: " + (estaDisponivel() ? "Sim" : "Não");
    }

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Digite o título do livro: ");
        String titulo = teclado.nextLine();

        System.out.print("Digite o autor: ");
        String autor = teclado.nextLine();

        System.out.print("Digite o número de páginas: ");
        int paginas = teclado.nextInt();

    
        Livro livro = new Livro(titulo, autor, paginas, false);

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Ver detalhes do livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n" + livro.detalhesLivro());
                    break;

                case 2:
                    if (livro.emprestar()) {
                        System.out.println("Livro emprestado com sucesso! ");
                    } else {
                        System.out.println("Livro já está emprestado. ");
                    }
                    break;

                case 3:
                    livro.devolver();
                    System.out.println("Livro devolvido com sucesso! ");
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        teclado.close();
    }
}
