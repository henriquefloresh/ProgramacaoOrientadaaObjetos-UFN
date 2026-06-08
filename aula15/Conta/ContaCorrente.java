class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado na Conta Corrente: R$ " + valor);
        System.out.println("Saldo atual: R$ " + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado na Conta Corrente: R$ " + valor);
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente na Conta Corrente.");
        }
    }
}
