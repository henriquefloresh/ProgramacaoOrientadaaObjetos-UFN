import java.util.Scanner;

class ContaBancaria {
    // Atributos privados (encapsulamento)
    private double saldo;
    private double limite;

    
    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    
    public void saque(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        
        System.out.print("Digite o saldo inicial: ");
        conta.setSaldo(teclado.nextDouble());

        System.out.print("Digite o limite da conta: ");
        conta.setLimite(teclado.nextDouble());

        System.out.print("Digite o valor para saque: ");
        double valorSaque = teclado.nextDouble();
        
        conta.saque(valorSaque);

        
        System.out.println("Saldo atual: " + conta.getSaldo());

        teclado.close();
    }
}
