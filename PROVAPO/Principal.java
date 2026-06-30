import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Livro> lista = Biblioteca.carregarArquivo();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livro");;
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Titulo: ");
                    String titulo = teclado.nextLine();

                    boolean existe = false;

                    for (Livro v : lista) {
                        if (v.getTitulo().equalsIgnoreCase(titulo)) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("Livro ja cadastrado.");
                        break;
                    }

                    System.out.print("Autor: ");
                    String autor = teclado.nextLine();

                    System.out.print("Ano: ");
                    int anoPublicacao = teclado.nextInt();

                    System.out.print("Emprestado? ");
                    boolean emprestado = teclado.nextBoolean();

                    Livro novo = new Livro(titulo, autor, anoPublicacao, emprestado);

                    lista.add(novo);

                    // Atualiza o arquivo com a nova lista
                    Biblioteca.salvarArquivo(lista);

                    System.out.println("Livro cadastrado.");

                    break;
                case 2:
                    Livro livro1 = new Livro("Pequeno Principe", "Henrique F", 2024, false);
                    Livro livro2 = new Livro("Diario de um banana", "Henrique H", 2023, true);
                    try {
                        FileWriter arquivo =  new FileWriter("livros.txt");
                        BufferedWriter escritor = new BufferedWriter(arquivo);

                        escritor.write(livro1.getTitulo() + "," + livro1.getAutor() + "," + livro1.getAnoPublicacao() + "," + livro1.isEmprestado());
                        escritor.newLine();
                        escritor.write(livro2.getTitulo() + "," + livro2.getAutor() + "," + livro2.getAnoPublicacao() + "," + livro2.isEmprestado());
                        escritor.newLine();

                        escritor.close();
                        arquivo.close();

                        System.out.println("LIvros salvos no arquivo livros.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    teclado.close();
                    System.exit(0);

                default:

                    System.out.println("Opção inválida.");

            }
        }
    }
}
