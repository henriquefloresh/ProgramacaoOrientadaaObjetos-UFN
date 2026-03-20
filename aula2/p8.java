import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Verifica se algum dos valores é zero para evitar divisão por zero
        if (valor1 == 0 || valor2 == 0) {
            System.out.println("Não é possível verificar múltiplos com zero.");
        } else {
            if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
                System.out.println("Os valores são múltiplos um do outro.");
            } else {
                System.out.println("Os valores NÃO são múltiplos um do outro.");
            }
        }

        scanner.close();
    }
}
