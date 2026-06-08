public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1000, 500);
        ContaInvestimento ci = new ContaInvestimento(5000, 0);

        System.out.println("=== CONTA CORRENTE ===");
        cc.depositar(200);
        cc.sacar(1500);

        System.out.println("\n=== CONTA INVESTIMENTO ===");
        ci.depositar(1000);
        ci.sacar(7000);
        ci.sacar(2000);
    }
}
