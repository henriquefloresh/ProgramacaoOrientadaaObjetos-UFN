public class ContaBancaria {
    
        private double saldo;
    
        // Método para depositar um valor em dinheiro
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Valor depositado: R$ " + valor);
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }
    
        // Método sobrecarregado para depositar um cheque
        public void depositar(Cheque cheque) {
            if (cheque != null && cheque.getValor() > 0) {
                saldo += cheque.getValor();
                System.out.println("Cheque depositado: R$ " + cheque.getValor());
            } else {
                System.out.println("Cheque inválido para depósito.");
            }
        }
    
        // Método para consultar o saldo
        public double getSaldo() {
            return saldo;
        }
    }
    
    // Classe Cheque
    class Cheque {
        private double valor;
    
        public Cheque(double valor) {
            this.valor = valor;
        }
    
        public double getValor() {
            return valor;
        }
    }
    // Classe principal para testar o código
class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        // Testando depósito em dinheiro
        conta.depositar(500);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        // Testando depósito com cheque
        Cheque cheque = new Cheque(300);
        conta.depositar(cheque);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
