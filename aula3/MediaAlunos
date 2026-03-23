import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 5;

        System.out.println("A média das notas é: " + media);

        sc.close();
    }
}
