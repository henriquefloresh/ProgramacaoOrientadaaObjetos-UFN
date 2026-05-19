public class Funcionario {
    void CalcularSalario(){
        System.out.println("Salário Base: R$ 3000,00");
    }

    class Gerente extends Funcionario{
        double bonus = 1000.0;

        @Override
        void CalcularSalario(){
            double salarioFinal = 3000.0 + bonus;
            System.out.println("Salário do Gerente: R$ " + salarioFinal);
        }
    }

    public static void main(String[] args) {
        Gerente gerente = new Funcionario().new Gerente();
        gerente.CalcularSalario();
    }
}
