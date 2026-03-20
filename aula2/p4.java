import java.util.Scanner;

public class ValoresAcimaDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float[] valores = new float[4];
        float soma = 0;

        // Leitura dos valores
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextFloat();
            soma += valores[i];
        }

        // Cálculo da média
        float media = soma / 4;
        System.out.println("Média: " + media);

        // Exibir valores superiores à média
        System.out.println("Valores superiores à média:");
        for (int i = 0; i < 4; i++) {
            if (valores[i] > media) {
                System.out.println(valores[i]);
            }
        }

        scanner.close();
    }
}
