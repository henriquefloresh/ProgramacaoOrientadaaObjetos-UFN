class ContaInvestimento extends Conta {

    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Aplicação realizada na Conta Investimento: R$ " + valor);
        System.out.println("Saldo investido: R$ " + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Resgate realizado na Conta Investimento: R$ " + valor);
            System.out.println("Saldo investido: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para resgate na Conta Investimento.");
        }
    }
}
