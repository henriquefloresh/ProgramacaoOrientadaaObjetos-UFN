import java.util.Scanner;

// Classe base
class ContaBancaria {

    public void calcularSaldo() {
        System.out.println("Calculando saldo...");
    }
}

// Classe herdadeira
class ContaCorrente extends ContaBancaria {

    double saldoInicial;
    double deposito;
    double saque;

    public ContaCorrente(double saldoInicial, double deposito, double saque) {
        this.saldoInicial = saldoInicial;
        this.deposito = deposito;
        this.saque = saque;
    }

    // Sobrescrita do método
    @Override
    public void calcularSaldo() {

        double saldoFinal = saldoInicial + deposito - saque;

        System.out.println("Saldo final: R$ " + saldoFinal);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = teclado.nextDouble();

        System.out.print("Digite o valor do depósito: ");
        double deposito = teclado.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = teclado.nextDouble();

        ContaCorrente conta = new ContaCorrente(saldoInicial, deposito, saque);

        conta.calcularSaldo();

        teclado.close();
    }
}
