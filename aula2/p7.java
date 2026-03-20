import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double c = scanner.nextDouble();

        double temp;

        // Ordenação simples (trocas)
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Valores em ordem crescente:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scanner.close();
    }
}
