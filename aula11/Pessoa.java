import java.util.Scanner;

// Classe Pessoa
class Pessoa {

    // Método normal
    public void falar(String mensagem) {
        System.out.println(mensagem);
    }

    // Sobrecarga do método
    public void falar(String mensagem, int repeticoes) {

        for (int i = 1; i <= repeticoes; i++) {
            System.out.println(mensagem);
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.print("Digite uma mensagem: ");
        String mensagem = teclado.nextLine();

        // Chamando o primeiro método
        p.falar(mensagem);

        System.out.print("Digite quantas vezes deseja repetir a mensagem: ");
        int repeticoes = teclado.nextInt();

        // Chamando o método sobrecarregado
        p.falar(mensagem, repeticoes);

        teclado.close();
    }
}
