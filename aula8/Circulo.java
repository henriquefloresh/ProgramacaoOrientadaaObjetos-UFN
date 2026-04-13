import java.util.Scanner;

class Circulo {
    // Atributo privado (encapsulamento)
    private double raio;

    // Getter
    public double getRaio() {
        return raio;
    }

    // Setter
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Circulo c = new Circulo();

        // Leitura do raio
        System.out.print("Digite o valor do raio: ");
        double raio = teclado.nextDouble();
        c.setRaio(raio);

        // Cálculo da área
        double area = c.calculaArea();

        // Exibição do resultado
        System.out.println("Área do círculo: " + area);

        teclado.close();
    }
}
