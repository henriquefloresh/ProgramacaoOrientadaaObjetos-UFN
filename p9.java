import java.util.Scanner;

public class SituacaoEleitor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("A pessoa NÃO está apta a votar.");
        } 
        else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto é FACULTATIVO.");
        } 
        else {
            System.out.println("O voto é OBRIGATÓRIO.");
        }

        scanner.close();
    }
}
