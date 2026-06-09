public abstract class Conta {
    protected double saldo;
    protected double limite;
    public abstract void depositar(double valor) throws SaldoInsuficienteException;;
    public abstract void sacar(double valor) throws SaldoInsuficienteException;;
    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }
    public double getSaldo() {
        return saldo;
    }
}
