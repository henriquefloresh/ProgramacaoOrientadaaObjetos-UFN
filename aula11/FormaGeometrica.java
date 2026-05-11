import java.util.Scanner;

// Classe base
class FormaGeometrica {

    public void calcularArea() {
        System.out.println("Calculando área...");
    }
}

// Classe herdadeira
class Triangulo extends FormaGeometrica {

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Sobrescrita do método
    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;

        System.out.println("Área do triângulo: " + area);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = teclado.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = teclado.nextDouble();

        Triangulo t = new Triangulo(base, altura);

        t.calcularArea();

        teclado.close();
    }
}
