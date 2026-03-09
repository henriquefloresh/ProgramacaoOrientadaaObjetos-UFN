import java.util.Scanner;

public class CidadeMaisPopulosa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cidades = new String[5];
        int[] populacoes = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da cidade: ");
            cidades[i] = sc.nextLine();

            System.out.print("Digite a população da cidade: ");
            populacoes[i] = sc.nextInt();
            sc.nextLine(); // limpar o enter
        }

        int maiorPop = populacoes[0];
        int indiceMaior = 0;

        for (int i = 1; i < 5; i++) {
            if (populacoes[i] > maiorPop) {
                maiorPop = populacoes[i];
                indiceMaior = i;
            }
        }

        System.out.println("A cidade mais populosa é: " + cidades[indiceMaior]);
        System.out.println("População: " + maiorPop);

        sc.close();
    }
}
