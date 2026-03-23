package pkg;
//ex5
import java.util.Scanner;

public class Pessoa2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o construtor:");
        System.out.println("1 - Nome e idade");
        System.out.println("2 - Apenas idade");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        ClassePessoa2 p = null;

        if (opcao == 1) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            p = new ClassePessoa2(nome, idade);

        } else if (opcao == 2) {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            p = new ClassePessoa2(idade);

        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
