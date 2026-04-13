import java.util.Scanner;

class Retangulo {
    // Atributos privados (encapsulamento)
    private double base;
    private double altura;

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular a área
    public double calculaArea() {
        return base * altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Retangulo r = new Retangulo();

        // Leitura dos valores
        System.out.print("Digite a base: ");
        r.setBase(teclado.nextDouble());

        System.out.print("Digite a altura: ");
        r.setAltura(teclado.nextDouble());

        // Cálculo da área
        double area = r.calculaArea();

        // Exibição do resultado
        System.out.println("Área do retângulo: " + area);

        teclado.close();
    }
}
