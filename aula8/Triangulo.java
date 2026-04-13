import java.util.Scanner;

class Triangulo {
    // Atributos privados (encapsulamento)
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // Getters
    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    // Setters
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    // Método para verificar se é equilátero
    public boolean verificaEquilatero() {
        return (ladoA == ladoB && ladoB == ladoC);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Triangulo t = new Triangulo();

        // Leitura dos lados
        System.out.print("Digite o lado A: ");
        t.setLadoA(teclado.nextDouble());

        System.out.print("Digite o lado B: ");
        t.setLadoB(teclado.nextDouble());

        System.out.print("Digite o lado C: ");
        t.setLadoC(teclado.nextDouble());

        // Verificação
        if (t.verificaEquilatero()) {
            System.out.println("O triângulo é equilátero.");
        } else {
            System.out.println("O triângulo NÃO é equilátero.");
        }

        teclado.close();
    }
}
