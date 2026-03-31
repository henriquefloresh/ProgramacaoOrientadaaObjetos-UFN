package pkg;

import java.util.Scanner;

public class Funcionario {
    public String nome;
    public Double salario;
    public Double horasExtras;

    public Funcionario(String n, Double s, Double hE) {
        nome = n;
        salario = s;
        horasExtras = hE;
        System.out.println("Nome do Funcionário: " + nome);
        System.out.println("Salário do Funcionário: " + salario);
        System.out.println("Horas Extras: " + horasExtras);
    }
    public double calcularValorHoraExtra() {
        return horasExtras * 50;
    }
    public double calcularPagamentoTotal() {
        return salario + calcularValorHoraExtra();
    }
    public void AdicionarHorasExtras(int horas) {
        horasExtras = horasExtras + horas;
        System.out.println("Horas Extras Adicionadas: " + horasExtras);
    }
    public double salarioAnual() {
        return salario * 12;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        Double salario = teclado.nextDouble();
        System.out.println("Digite as horas extras: ");
        Double horasExtras = teclado.nextDouble();
        Funcionario f = new Funcionario(nome, salario, horasExtras);

        System.out.println("Cálculo das horas extras: " + f.calcularValorHoraExtra());
        System.out.println("Cálculo do pagamento total: " + f.calcularPagamentoTotal());
        System.out.println("Digite aqui a quantidade de horas extras adicionadas: ");
        int horasAdicionadas = teclado.nextInt();
        f.AdicionarHorasExtras(horasAdicionadas);
        System.out.println("Cálculo do salário anual: " + f.salarioAnual());

        teclado.close();

    }
}
