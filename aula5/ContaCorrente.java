package pkg;

public class ContaCorrente {
	public static void main(String[] args) {

        // Criando objeto
        ClasseContaCorrente novaConta = new ClasseContaCorrente();
        

        // Definindo saldo inicial
        novaConta.definirSaldoInicial(1000);

        // Mostrando saldo inicial
        System.out.println("Saldo inicial: " + novaConta.saldo);

        // Saque de 500
        if (novaConta.sacar(500)) {
            System.out.println("Saque de 500 realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque de 500!");
        }

        // Depósito de 50
        novaConta.depositar(50);

        // Mostrando saldo
        System.out.println("Saldo após depósito: " + novaConta.saldo);

        // Saque de 600
        if (novaConta.sacar(600)) {
            System.out.println("Saque de 600 realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque de 600!");
        }

        // Saldo final
        System.out.println("Saldo final: " + novaConta.saldo);
    }
}
