import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine();

        System.out.print("Informe a idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine(); // limpar buffer

        System.out.print("Informe o tipo: ");
        String tipo = teclado.nextLine();

        // Criando objeto
        Pessoa pessoa = new Pessoa(nome, idade, tipo);

        // Exibindo atributos
        System.out.println("\n--- Dados da Pessoa ---");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Tipo: " + pessoa.tipo);

        // Chamando métodos
        System.out.println("\n--- Métodos ---");
        System.out.println(pessoa.falar());
        pessoa.andar();

        teclado.close();
    }
}
