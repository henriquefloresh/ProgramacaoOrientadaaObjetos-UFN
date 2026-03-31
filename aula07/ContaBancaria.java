package pkg;

import java.util.Scanner;

public class ContaBancaria {
    String titular;
    Double saldo;

    public ContaBancaria(String t, Double s) {
        titular = t;
        saldo = s;

        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferir(double valorTransferencia, ContaBancaria contaDestino) {

        if (sacar(valorTransferencia)) {
            contaDestino.depositar(valorTransferencia);
            return true;
        }
        return false;
    }
    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Cadastro da 1ª Conta ---");
        System.out.print("Nome do titular: ");
        String nome1 = teclado.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo1 = teclado.nextDouble();
        teclado.nextLine(); // Limpar o buffer do teclado

        ContaBancaria contaA = new ContaBancaria(nome1, saldo1);

        System.out.println("\n--- Cadastro da 2ª Conta ---");
        System.out.print("Nome do titular: ");
        String nome2 = teclado.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo2 = teclado.nextDouble();

        ContaBancaria contaB = new ContaBancaria(nome2, saldo2);

        System.out.print("\nQuanto " + contaA.titular + " deseja depositar? ");
        double valorDep = teclado.nextDouble();
        contaA.depositar(valorDep);
        System.out.println("Novo saldo de " + contaA.titular + ": R$ " + contaA.consultarSaldo());

        System.out.print("\nQuanto " + contaA.titular + " deseja sacar? ");
        double valorSaque = teclado.nextDouble();
        if (contaA.sacar(valorSaque)) {
            System.out.println("Saque realizado! Saldo atual: R$ " + contaA.consultarSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }

        System.out.print("\nValor para transferir de " + contaA.titular + " para " + contaB.titular + ": ");
        double vTransf = teclado.nextDouble();

        if (contaA.transferir(vTransf, contaB)) {
            System.out.println("Transferência concluída com sucesso!");
        } else {
            System.out.println("Falha na transferência: " + contaA.titular + " não tem saldo suficiente.");
        }


        System.out.println("\n= RELATÓRIO FINAL ");
        System.out.println("Titular: " + contaA.titular + " | Saldo: R$ " + contaA.consultarSaldo());
        System.out.println("Titular: " + contaB.titular + " | Saldo: R$ " + contaB.consultarSaldo());

        teclado.close();

    }
}
