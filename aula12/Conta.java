import java.util.ArrayList;

class Conta {
    int numero;
    String titular;
    double saldo;

    // Construtor
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para encontrar a conta com maior saldo
    public static Conta maiorSaldo(ArrayList<Conta> contas) {

        Conta maior = contas.get(0);

        for (Conta conta : contas) {
            if (conta.saldo > maior.saldo) {
                maior = conta;
            }
        }

        return maior;
    }

    // Método para exibir os dados
    public void exibirDados() {
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando a lista de contas
        ArrayList<Conta> contas = new ArrayList<>();

        // Adicionando contas na lista
        contas.add(new Conta(101, "Carlos", 2500.00));
        contas.add(new Conta(102, "Maria", 4800.50));
        contas.add(new Conta(103, "João", 3200.75));

        // Chamando o método para encontrar a conta com maior saldo
        Conta contaMaiorSaldo = Conta.maiorSaldo(contas);

        // Exibindo os dados da conta com maior saldo
        System.out.println("Conta com maior saldo:");
        System.out.println("----------------------");
        contaMaiorSaldo.exibirDados();
    }
}
