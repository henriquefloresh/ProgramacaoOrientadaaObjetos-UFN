package pkg;
import java.util.Scanner;
//ex3

public class Pessoa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Criando duas pessoas
        ClassePessoa p1 = new ClassePessoa();
        ClassePessoa p2 = new ClassePessoa();
        

        // Leitura da primeira pessoa
        System.out.println(" Pessoa 1 ");
        System.out.print("Nome: ");
        p1.nome = teclado.nextLine();

        System.out.print("Email: ");
        p1.email = teclado.nextLine();

        System.out.print("Data de nascimento: ");
        p1.dataNascimento = teclado.nextLine();

        System.out.print("Endereço: ");
        p1.endereco = teclado.nextLine();

        // Leitura da segunda pessoa
        System.out.println("\n Pessoa 2 ");
        System.out.print("Nome: ");
        p2.nome = teclado.nextLine();

        System.out.print("Email: ");
        p2.email = teclado.nextLine();

        System.out.print("Data de nascimento: ");
        p2.dataNascimento = teclado.nextLine();

        System.out.print("Endereço: ");
        p2.endereco = teclado.nextLine();

        // Definindo admin (uma sim, outra não)
        p1.promoverAdmin(); // p1 será admin
        p2.admin = false;   // p2 não será admin

        // Exibindo resultados
        System.out.println("\n RESULTADOS ");

        System.out.println("\nPessoa 1:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Email: " + p1.Email());
        System.out.println("Admin: " + (p1.admin ? "Sim" : "Não"));

        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Email: " + p2.Email());
        System.out.println("Admin: " + (p2.admin ? "Sim" : "Não"));

        teclado.close();
    }
}
