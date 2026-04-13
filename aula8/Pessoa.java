import java.util.Scanner;

class Pessoa {
    // Atributos privados (encapsulamento)
    private String nome;
    private int idade;
    private String cpf;

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método para verificar maioridade
    public boolean verificaMaiorDeIdade() {
        return idade >= 18;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa p = new Pessoa();

        // Leitura dos dados
        System.out.print("Digite o nome: ");
        p.setNome(teclado.nextLine());

        System.out.print("Digite a idade: ");
        p.setIdade(teclado.nextInt());
        teclado.nextLine(); // limpar buffer

        System.out.print("Digite o CPF: ");
        p.setCpf(teclado.nextLine());

        // Verificação
        if (p.verificaMaiorDeIdade()) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa NÃO é maior de idade.");
        }

        teclado.close();
    }
}
