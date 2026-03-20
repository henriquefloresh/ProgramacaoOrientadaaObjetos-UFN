import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("O ponto está na origem.");
        } else if (x == 0) {
            System.out.println("O ponto está sobre o eixo Y.");
        } else if (y == 0) {
            System.out.println("O ponto está sobre o eixo X.");
        } else if (x > 0 && y > 0) {
            System.out.println("O ponto está no 1º quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no 2º quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no 3º quadrante.");
        } else { // x > 0 && y < 0
            System.out.println("O ponto está no 4º quadrante.");
        }

        scanner.close();
    }
}
