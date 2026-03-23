package pkg;

public class ClasseContaCorrente {
	public float saldo;

    // Definir saldo inicial
    public void definirSaldoInicial(float valor) {
        saldo = valor;
    }

    // Depositar
    public void depositar(float valor) {
        saldo += valor;
    }

    // Sacar
    public boolean sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

}
